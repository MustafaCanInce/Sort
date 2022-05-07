/*
Author : Mustafa Can İnce
Date : May 2022

 */

package Main_Package;

public class Test {

    public static void main(String[] args){

        // Bubble Sort Algorithms for int array version
        {
            bubble_sort can = new bubble_sort();
            int[] array = {5, 20, 40, 80, 8, 1, 0, 19, 66, 88, 11, 12};
            //System.out.println("Before Sort : ");
            //can.PrintArray(array);

            double startTime = System.nanoTime();
            can.BubbleSort(array);
            double stopTime = System.nanoTime();

            //System.out.println("Sorted Array is : ");
            //can.PrintArray(array);

            can.setBubbleSort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Bubble Sort : " + can.getBubbleSort_Time() + " Seconds");
        }

        //Selection Sort Algorithms for int array version
        {
            selection_sort can = new selection_sort();
            int[] array = {5, 20, 40, 80, 8, 1, 0, 19, 66, 88, 11, 12};
            //System.out.println("Before Sort : ");
            //can.PrintArray(array);

            double startTime = System.nanoTime();
            can.SelectionSort(array);
            double stopTime = System.nanoTime();

            //System.out.println("Sorted Array is : ");
            //can.PrintArray(array);

            can.setSelectionSort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Selection Sort : " + can.getSelectionSort_Time() + " Seconds");
        }

        //Insertion Sort Algorithms for int array version
        {
            insertion_sort can = new insertion_sort();
            int[] array = {5, 20, 40, 80, 8, 1, 0, 19, 66, 88, 11, 12};
            //System.out.println("Before Sort : ");
            //can.PrintArray(array);

            double startTime = System.nanoTime();
            can.InsertionSort(array);
            double stopTime = System.nanoTime();

            //System.out.println("Sorted Array is : ");
            //can.PrintArray(array);

            can.setInsertionSort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Selection Sort : " + can.getInsertionSort_Time() + " Seconds");
        }
        //
        {

        }
    }
}
