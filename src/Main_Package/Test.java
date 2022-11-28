/*
Author : Mustafa Can İnce
Date : May 2022

 */

package Main_Package;


import java.util.Scanner;
import java.util.Arrays;
public class Test {
    /*TODO  Selection Sort +
            Bubble Sort    +
            Insertion Sort +
            Merge Sort     +
            Quick Sort     +
     */
    public static void main(String []args){

        int[] array = merge_sort.myfunc(20);



        {

            System.out.println("Bubble Sort");

            bubble_sort can = new bubble_sort();

            System.out.println("Before Sort : ");
            can.printArray(array, array.length);

            double startTime = System.nanoTime();
            can.BubbleSort(array);
            double stopTime = System.nanoTime();

            System.out.println("Sorted Array is : ");
            can.printArray(array, array.length);

            can.setBubbleSort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Bubble Sort    : " + can.getBubbleSort_Time() + " Seconds");
        }

        {

            System.out.println("\nSelection Sort");

            selection_sort can = new selection_sort();

            System.out.println("Before Sort : ");
            can.printArray(array, array.length);

            double startTime = System.nanoTime();
            can.SelectionSort(array);
            double stopTime = System.nanoTime();

            System.out.println("Sorted Array is : ");
            can.printArray(array, array.length);

            can.setSelectionSort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Selection Sort : " + can.getSelectionSort_Time() + " Seconds");
        }

        //Insertion Sort Algorithms for int array version
        {
            System.out.println("\nInsertion Sort");

            insertion_sort can = new insertion_sort();

            System.out.println("Before Sort : ");
            can.printArray(array, array.length);

            double startTime = System.nanoTime();
            can.InsertionSort(array);
            double stopTime = System.nanoTime();

            System.out.println("Sorted Array is : ");
            can.printArray(array, array.length);

            can.setInsertionSort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Insertion Sort : " + can.getInsertionSort_Time() + " Seconds");
        }
        {
            System.out.println("\nMerge Sort");

            //Merge Sort Algorithms for int array version

            merge_sort can = new merge_sort();

            System.out.println("Before Sort : ");
            can.printArray(array);

            //System.out.println();
            // int arr[], int l, int m, int r

            double startTime = System.nanoTime();
            can.sort(array, 0, array.length - 1);
            double stopTime = System.nanoTime();

            System.out.println("Sorted Array is : ");
            can.printArray(array);

            can.setMerge_Sort_Time(stopTime / 1000000 - startTime / 1000000);
            System.out.println("Merge Sort     : " + can.getMerge_Sort_Time() + " Seconds");

        }
        {
            System.out.println("\nQuick Sort");

            int n = array.length;
            quick_sort can = new quick_sort();

            System.out.println("Before Sort : ");
            can.printArray(array, array.length);

            double startTime = System.nanoTime();
            can.QuickSort(array, 0, n - 1);
            double stopTime = System.nanoTime();

            System.out.println("Sorted Array is : ");
            can.printArray(array, array.length);

            can.setQuickSort_Time(stopTime / 1000000 - startTime / 1000000);
            System.out.println("Quick Sort     : " + can.getQuickSort_Time() + " Seconds");
        }





        }
}

