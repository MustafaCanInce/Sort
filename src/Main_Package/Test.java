/*
Author : Mustafa Can İnce
Date : May 2022

 */

package Main_Package;

public class Test {

    public static void main(String []args){

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

            System.out.println("Insertion Sort : " + can.getInsertionSort_Time() + " Seconds");
        }

        //Merge Sort Algorithms for int array version

            merge_sort can = new merge_sort();
            int[] array = {5, 20, 40, 80, 8, 1, 0, 19, 66, 88, 11, 12};
            System.out.println("Before Sort : ");
            //can.PrintArray(array);

            for (int i = 0;i < array.length;i++){
                System.out.print(array[i]);
            }
        System.out.println();
            // int arr[], int l, int m, int r


            double startTime = System.nanoTime();
            can.MergeSort(array, 0, array.length/2,array.length - 1);
            double stopTime = System.nanoTime();

            //System.out.println("Sorted Array is : ");
            //can.PrintArray(array);





            can.setMerge_Sort_Time(stopTime / 1000000 - startTime / 1000000);

            System.out.println("Merge Sort : " + can.getMerge_Sort_Time() + " Seconds\n");
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]);
        }
        }



}
