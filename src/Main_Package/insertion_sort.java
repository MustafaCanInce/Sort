package Main_Package;

public class insertion_sort {

    private double InsertionSort_Time;

    public double getInsertionSort_Time() {
        return InsertionSort_Time;
    }

    public void setInsertionSort_Time(double insertionSort_Time) {
        InsertionSort_Time = insertionSort_Time;
    }

    void InsertionSort (int [] arr){
        int array_length = arr.length;

        for (int i = 1; i < array_length; i++){
            int key = arr[i];
            int k = i -1;

            while (k >= 0 && arr[k] > key){
                arr[k + 1] = arr[k];
                k = k - 1;
            }
            arr[k + 1] = key;

        }

    }



    void PrintArray(int []arr){
        int arrray_length = arr.length;
        for (int i = 0; i < arrray_length; i++){
            System.out.println(arr[i]);
        }
    }
}
