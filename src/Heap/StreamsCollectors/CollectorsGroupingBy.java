package Heap.StreamsCollectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
    public static void main(String[] args) {
        StringBuilder info = new StringBuilder("==========="); // - not save threading
//        StringBuffer info = new StringBuffer("Start"); // - save threading

        List<Transaction> collectionInt = new ArrayList<>();
        collectionInt.add(new Transaction(13, "Hat", "elf"));
        collectionInt.add(new Transaction(7, "Street", "dungeonMaster"));
        collectionInt.add(new Transaction(7, "Dead", "dwarf"));
        collectionInt.add(new Transaction(10, "Rad", "dwarf"));
        collectionInt.add(new Transaction(4, "Hat", "dragon"));

        info.append("\n").append("1-----------------------\n");

        Map<Integer, List<Transaction>> toList = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency));
        toList.forEach((k, v) -> info.append(k + " : " + v.toString() + "\n"));
        info.append("1-----------------------\n");

        Map<Integer, Set<Transaction>> toSet = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency, Collectors.toSet()));
        toSet.forEach((k, v) -> info.append(k + " : " + v.toString() + "\n"));
        info.append("2-----------------------\n");

        Map<String, Long> toExactParam = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getPosition, Collectors.counting()));
        toExactParam.forEach((k, v) -> info.append(k + " : " + v.toString() + "\n"));
        info.append("3-----------------------\n");

        Map<String, Set<String>> byCurrencyJustName = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getPosition,
                            Collectors.mapping(Transaction::getName,
                                Collectors.toSet())));
        byCurrencyJustName.forEach((k, v) -> info.append(k + " : " + v.toString() + "\n"));
        info.append("4-----------------------\n");

        Map<String, Double> averageKillsForEachCharacter = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getPosition, Collectors.averagingLong(Transaction::getCurrency)));
        averageKillsForEachCharacter.forEach((k, v) -> info.append(k + " : " + v.toString() + "\n"));
        info.append("5-----------------------\n");

        Map<String, String> theSameBatInOneLine = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getPosition,
                            Collectors.mapping(Transaction::getName,
                                Collectors.joining(", ", "{", "}"))));
        theSameBatInOneLine.forEach((k, v) -> info.append(k + " : " + v.toString() + "\n"));
        info.append("6-----------------------\n");

        Map<String, Map<String,List<Transaction>>> groupByPositionAndName = collectionInt.stream()
                .collect(Collectors.groupingBy(Transaction::getPosition,
                            Collectors.groupingBy(Transaction::getName)));
        groupByPositionAndName.forEach((k, v) -> info.append(k + " : " + v.values() + "\n"));
        info.append("7-----------------------\n");
        System.out.println(info);
    }


}
