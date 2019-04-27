package com.virtual.labs.springbasics;

import com.virtual.labs.springbasics.search.BinarySearchImpl;
import com.virtual.labs.springbasics.search.BubbleSortAlgorithm;
import com.virtual.labs.springbasics.search.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 5);
        System.out.println("Search result = " + result);

        SpringApplication.run(SpringBasicsApplication.class, args);
    }

}
