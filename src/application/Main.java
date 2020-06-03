package application;

import search.LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinearSearch searchList = new LinearSearch();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(0, 1);
        numbers.add(1, 2);
        numbers.add(2, 3);
        numbers.add(3, 3);
        numbers.add(4, 4);
        numbers.add(5, 3);
        numbers.add(6, 5);
        numbers.add(7, 7);
        numbers.add(8, 3);
        numbers.add(9, 3);

        searchList.setDesiredValue(3);
        System.out.println();
        System.out.print("index of first value desiredValue = ");
        System.out.print(searchList.searchFirstIndex(numbers));
        System.out.println();
        System.out.print("index of all value desiredValue = ");
        System.out.print(searchList.searchAllIndex(numbers));
    }
}
