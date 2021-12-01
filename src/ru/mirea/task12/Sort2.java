package ru.mirea.task12;

import java.util.Arrays;

public class Sort2 {
    private static final int arraySize = 20;

    public static void main(String[] args) {
        Students[] studArr = new Students[arraySize];
        for (int i = 0; i < 18; i++) {
            studArr[i] = new Students();
        }
        studArr[18] = new Students(5000);
        studArr[19] = new Students(8, "Mary", "Sue");

        System.out.println("\nCreated array: ");
        System.out.println(Arrays.toString(studArr));
        Arrays.sort(studArr, new SortingStudentsByGPA());
        System.out.println("\nSorted array: ");
        System.out.println(Arrays.toString(studArr));
    }
}
