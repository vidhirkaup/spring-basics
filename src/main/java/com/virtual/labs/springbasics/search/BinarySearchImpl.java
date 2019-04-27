package com.virtual.labs.springbasics.search;

public class BinarySearchImpl {

    public int binarySearch(int[] numbers, int numberToSearchFor){
        // sort numbers
        SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
        sortAlgorithm.sort(numbers);

        sortAlgorithm = new QuickSortAlgorithm();
        sortAlgorithm.sort(numbers);

        // search the number

        // return index
        return 3;
    }
}
