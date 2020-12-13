package Heap.StreamsCollectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
class Transaction {
    private int currency;
    private String name;
    private String position;

}