package com.virtual.labs.springbasics.search;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        // sort numbers
        sortAlgorithm.sort(numbers);

        // search the number

        // return index
        return 3;
    }
}
