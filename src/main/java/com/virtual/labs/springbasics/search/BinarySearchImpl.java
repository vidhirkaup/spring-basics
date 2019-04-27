package com.virtual.labs.springbasics.search;

public class BinarySearchImpl {

    public int binarySearch(int[] numbers, int numberToSearchFor){
        // sort numbers
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        bubbleSortAlgorithm.sort(numbers);

        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        quickSortAlgorithm.sort(numbers);

        // search the number

        // return index
        return 3;
    }
}
