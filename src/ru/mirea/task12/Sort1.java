package ru.mirea.task12;
import java.util.Arrays;

public class Sort1 {
    private static final int arraySize = 20;

    public static void sorting(Students[] students) {
        int minId;
        Students temp;
        for(int left = 0; left < students.length - 1; left++){
            // Students q = students[left];
            minId = left;
            for(int j = left + 1; j < students.length; j++){
                if(students[j].compareTo(students[minId]) < 0){
                    minId = j;
                }
            }
            temp = students[minId];
            students[minId] = students[left];
            students[left] = temp;
        }
    }

    public static void main(String[] args) {
        Students[] studArr = new Students[arraySize];
        for (int i = 0; i < 18; i++) {
            studArr[i] = new Students();
        }
        studArr[18] = new Students(5000);
        studArr[19] = new Students(8, "Mary", "Sue");

        System.out.println("\nCreated array: ");
        System.out.println(Arrays.toString(studArr));
        sorting(studArr);
        System.out.println("\nSorted array: ");
        System.out.println(Arrays.toString(studArr));
    }
}
