package com.virtual.labs.springbasics.search;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        System.out.println("Using Algorithm - Bubble Sort");
        return numbers;
    }
}
