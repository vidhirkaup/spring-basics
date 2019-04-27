package com.virtual.labs.springbasics.search;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        System.out.println("Using Algorithm - Quick Sort");
        return numbers;
    }
}
