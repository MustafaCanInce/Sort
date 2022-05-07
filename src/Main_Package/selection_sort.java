package Main_Package;

public class selection_sort {

    private double SelectionSort_Time;

    public double getSelectionSort_Time() {
        return SelectionSort_Time;
    }

    public void setSelectionSort_Time(double selectionSort_Time) {
        SelectionSort_Time = selectionSort_Time;
    }

    void SelectionSort (int []arr){
        int array_length = arr.length;
        for (int i = 0; i < array_length - 1; i++){
            int min_index = i;
            for (int k = i + 1; k < array_length; k++){
                if (arr[k] < arr[min_index]){
                    min_index = k;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    void PrintArray(int []arr){
        int arrray_length = arr.length;
        for (int i = 0; i < arrray_length; i++){
            System.out.println(arr[i]);
        }
    }
}
