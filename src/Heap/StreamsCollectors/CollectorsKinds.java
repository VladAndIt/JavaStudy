package Heap.StreamsCollectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.*;

public class CollectorsKinds {
    public static void main(String[] args) {


        StringBuilder info = new StringBuilder(); // - not save threading
//        StringBuffer info = new StringBuffer("Start"); // - save threading

        List<Transaction> collectionInt = new ArrayList<>();
        collectionInt.add(new Transaction(13, "Hat", "elf"));
        collectionInt.add(new Transaction(7, "Street", "dungeonMaster"));
        collectionInt.add(new Transaction(7, "Dead", "dwarf"));
        collectionInt.add(new Transaction(10, "Rad", "dwarf"));
        collectionInt.add(new Transaction(4, "Hat", "dragon"));

        info.append("\n0-----------------------\n");

        info.append(collectionInt.stream().collect(Collectors.counting())).append("\n");
//        info.append(collectionInt.stream().count()).append("\n");

        Comparator<Transaction> transactionCurrencyComparator = Comparator.comparingInt(Transaction::getCurrency);

        info.append("\n======================================= min max\n");

        Optional<Transaction> maxCurrency = collectionInt.stream().collect(Collectors.maxBy(transactionCurrencyComparator));
//        Optional<Transaction> maxCurrencySquash = collectionInt.stream().max(transactionCurrencyComparator);
        maxCurrency.ifPresentOrElse(transaction -> info.append(transaction).append("\n"), () -> info.append("empty").append("\n"));
        Optional<Transaction> minCurrency = collectionInt.stream().collect(Collectors.minBy(transactionCurrencyComparator));
//        Optional<Transaction> minCurrencySquash = collectionInt.stream().min(transactionCurrencyComparator);
        minCurrency.ifPresent(transaction -> info.append(transaction).append("\n"));
        Optional.of(new ArrayList<Transaction>().stream().max(transactionCurrencyComparator))
                .ifPresentOrElse(transaction -> info.append(transaction).append("\n"), () -> info.append("empty2").append("\n"));

        info.append("\n======================================= summarization\n");

        info.append(collectionInt.stream().collect(Collectors.summingDouble(Transaction::getCurrency))).append("\n");
//        collectionInt.stream().mapToDouble(Transaction::getCurrency).sum();
        info.append(collectionInt.stream().collect(Collectors.averagingDouble(Transaction::getCurrency))).append("\n");

        DoubleSummaryStatistics stat = collectionInt.stream().collect(summarizingDouble(Transaction::getCurrency));
        info.append(stat).append("\n");

        info.append(collectionInt.stream().map(Transaction::getName).collect(joining(", ", "[", "]"))).append("\n");
        info.append("General reducing\n");
        info.append(collectionInt.stream().collect(reducing(0, Transaction::getCurrency, (i, j) -> i + j))).append("\n");
//        info.append(collectionInt.stream().map(Transaction::getCurrency).reduce(0, (i, j) -> i + j));
//        info.append(collectionInt.stream().map(Transaction::getCurrency).reduce(0, Integer::sum));
        info.append(collectionInt.stream().collect(reducing((d1, d2) -> d1.getCurrency() > d2.getCurrency() ? d1 : d2))).append("\n");
        info.append(collectionInt.stream().collect(reducing((d1, d2) -> d1.getCurrency() > d2.getCurrency() ? d2 : d1))).append("\n");

        info.append(collectionInt.stream().collect(groupingBy(Transaction::getName))).append("\n");

        info.append(collectionInt.stream().collect(groupingBy(v -> {
            if (v.getCurrency() <= 5) return "++5++";
            else if (v.getCurrency() <= 10) return "++10++";
            else return "+++++";
        }, Collectors.mapping(Transaction::getName, Collectors.toSet())))).append("\n");

        Map<String, List<String>> fgg = new HashMap<>();
        fgg.put("elf", asList("Jogging", "Cycling"));
        fgg.put("dwarf", asList("Mathematics", "Calculation"));

        info.append("\n======================================= grouping with flatMap\n");

        List<PersonWithTasty> checkWho = new ArrayList<>();
        checkWho.add(new PersonWithTasty("elf", 300));
        checkWho.add(new PersonWithTasty("dwarf", 250));
        info.append(checkWho.stream().collect(groupingBy(PersonWithTasty::getName,
                flatMapping(d -> fgg.get(d.getName()).stream(), toSet())))).append("\n");

        info.append("\n======================================= grouping by two param\n");

        info.append(checkWho.stream().collect(groupingBy(PersonWithTasty::getName,
                groupingBy(d -> {
                    if (d.getDamage() > 290) return "MORE";
                    else if (d.getDamage() > 200) return "LESS";
                    else return "NO MORE";
                })))).append("\n");

        info.append("\n======================================= grouping by two param\n");

//        Map<String,Transaction> rat =
        info.append(collectionInt.stream().collect(groupingBy(Transaction::getName,
                collectingAndThen(maxBy(comparingInt(Transaction::getCurrency)), p -> p.get().getCurrency()))));

        info.append("\n======================================= grouping by and get max for each\n");

        checkWho.add(new PersonWithTasty("Bogdan", 360));
        checkWho.add(new PersonWithTasty("elf", 388));
        info.append(checkWho.stream().collect(groupingBy(PersonWithTasty::getName,
                collectingAndThen(maxBy(comparingLong(PersonWithTasty::getDamage)), Optional::get))));

        info.append("\n======================================= grouping by and summarizing\n");
        info.append(checkWho.stream().collect(groupingBy(PersonWithTasty::getName, summarizingLong(PersonWithTasty::getDamage))));

        info.append("\n======================================= grouping to set\n");
        info.append(checkWho.stream().collect(
                groupingBy(PersonWithTasty::getName, mapping(d -> {
                    if (d.getDamage() > 290) return "MORE";
                    else if (d.getDamage() > 260) return "LESS";
                    else return "NO MORE"; }
                    ,toCollection(HashSet::new))))).append("\n");

        info.append("\n======================================= partition by\n");

        List<PersonWithTastyBool> boolPerson = asList(new PersonWithTastyBool("Gor",342,false),
                new PersonWithTastyBool("Door",103,true));
        info.append(boolPerson.stream().collect(partitioningBy(PersonWithTastyBool::isPower)));

        info.append("\n======================================= partition by advanced\n");

        info.append(boolPerson.stream().filter(PersonWithTastyBool::isPower).collect(toList())).append("\n");
        info.append(boolPerson.stream().collect(partitioningBy(PersonWithTastyBool::isPower, groupingBy(PersonWithTastyBool::getName))));

        info.append("\n======================================= partition by advanced\n");
        info.append(boolPerson.stream().collect(partitioningBy(PersonWithTastyBool::isPower,
                partitioningBy(v->v.getDamage()>200))));

        info.append("\n======================================= partition in prime number\n");
        info.append(IntStream.rangeClosed(2, (int) Math.sqrt(40)).noneMatch(i -> 40 % i == 0)).append("\n");
        info.append(IntStream.rangeClosed(2, 40).boxed()
                        .collect(partitioningBy(c -> isPrime(c))));

        System.out.println(info);
    }

    static boolean isPrime(int n) {
        int nRoot = (int) Math.sqrt(n);
        return IntStream.rangeClosed(2, nRoot).noneMatch(i -> n % i == 0);
    }
}

@Getter
@AllArgsConstructor
@Data
class PersonWithTasty {
    private String name;
    private long damage;
}

@Getter
@AllArgsConstructor
@Data
class PersonWithTastyBool{
    private String name;
    private long damage;
    private boolean power;
}
