package ru.mirea.task12;

import java.util.Arrays;

public class Sort3 {
    private static final int arraySize = 10;

    private static void mergeSort(Students[] a, int lo, int hi){
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        Students[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Students[] studArr1 = new Students[arraySize];
        for (int i = 0; i < 8; i++) {
            studArr1[i] = new Students();
        }
        studArr1[8] = new Students(5000);
        studArr1[9] = new Students(8, "Mary", "Sue");

        Students[] studArr2 = new Students[arraySize];
        for (int i = 0; i < 8; i++) {
            studArr2[i] = new Students();
        }
        studArr2[8] = new Students(6000);
        studArr2[9] = new Students(0, "Mary", "White");

        Students[] studArr3 = new Students[arraySize*2];
        for (int i = 0; i < studArr1.length; i++){
            studArr3[i] = studArr1[i];
        }
        for(int i = studArr1.length; i < studArr3.length; i++){
            studArr3[i] = studArr2[i - studArr1.length];
        }

        System.out.println("\nCreated array: ");
        System.out.println(Arrays.toString(studArr3));
        mergeSort(studArr3,0, studArr3.length-1);
        System.out.println("\nSorted array: ");
        System.out.println(Arrays.toString(studArr3));
    }
}
