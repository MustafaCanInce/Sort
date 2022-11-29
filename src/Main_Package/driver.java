package Main_Package;

public class driver {

    public static void compute(int how_many_times){
        int[] array = merge_sort.myfunc(100);
        int[] array1 = array.clone();
        int[] array2 = array.clone();
        int[] array3 = array.clone();
        int[] array4 = array.clone();

        double[] all_bubbletime = new double[101];

        for (int i = 0;i <= how_many_times; i++){

            {

                //System.out.println("Bubble Sort");

                bubble_sort can = new bubble_sort();

                //System.out.println("Before Sort : ");
                //can.printArray(array1, array1.length);

                double startTime = System.nanoTime();
                can.BubbleSort(array1);
                double stopTime = System.nanoTime();

                //System.out.println("Sorted Array is : ");
                //can.printArray(array1, array1.length);

                can.setBubbleSort_Time(stopTime / 1000000 - startTime / 1000000);
                all_bubbletime[i] =(stopTime / 1000000 - startTime / 1000000);
                can.setAll_BubbleSort_Time(all_bubbletime);
                System.out.println("Bubble Sort    : " + can.getBubbleSort_Time() + " Seconds");
                //if (can.getAll_BubbleSort_Time()[i] == all_bubbletime[i]){
                //    System.out.println("its work");
                //}

            }

            {

                //System.out.println("\nSelection Sort");

                selection_sort can = new selection_sort();

                //System.out.println("Before Sort : ");
                //can.printArray(array2, array2.length);

                double startTime = System.nanoTime();
                can.SelectionSort(array2);
                double stopTime = System.nanoTime();

                //System.out.println("Sorted Array is : ");
                //can.printArray(array2, array2.length);

                can.setSelectionSort_Time(stopTime / 1000000 - startTime / 1000000);

                System.out.println("Selection Sort : " + can.getSelectionSort_Time() + " Seconds");
            }

            {
                //System.out.println("\nInsertion Sort");

                insertion_sort can = new insertion_sort();

                //System.out.println("Before Sort : ");
                //can.printArray(array3, array3.length);

                double startTime = System.nanoTime();
                can.InsertionSort(array3);
                double stopTime = System.nanoTime();

                //System.out.println("Sorted Array is : ");
                //can.printArray(array3, array3.length);

                can.setInsertionSort_Time(stopTime / 1000000 - startTime / 1000000);

                System.out.println("Insertion Sort : " + can.getInsertionSort_Time() + " Seconds");
            }

            {
                //System.out.println("\nMerge Sort");

                //Merge Sort Algorithms for int array version

                merge_sort can = new merge_sort();

                //System.out.println("Before Sort : ");
                //can.printArray(array4);

                //System.out.println();
                // int arr[], int l, int m, int r

                double startTime = System.nanoTime();
                can.sort(array4, 0, array4.length - 1);
                double stopTime = System.nanoTime();

                //System.out.println("Sorted Array is : ");
                //can.printArray(array4);

                can.setMerge_Sort_Time(stopTime / 1000000 - startTime / 1000000);
                System.out.println("Merge Sort     : " + can.getMerge_Sort_Time() + " Seconds");

            }

            {
                //System.out.println("\nQuick Sort");

                int n = array.length;
                quick_sort can = new quick_sort();

                //System.out.println("Before Sort : ");
                //can.printArray(array, array.length);

                double startTime = System.nanoTime();
                can.QuickSort(array, 0, n - 1);
                double stopTime = System.nanoTime();

                //System.out.println("Sorted Array is : ");
                //can.printArray(array, array.length);

                can.setQuickSort_Time(stopTime / 1000000 - startTime / 1000000);
                System.out.println("Quick Sort     : " + can.getQuickSort_Time() + " Seconds");
            }

        }

    }
}
