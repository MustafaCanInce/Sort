package Main_Package;

public class bubble_sort {

    private double BubbleSort_Time;

    public double getBubbleSort_Time() {
        return BubbleSort_Time;
    }

    public void setBubbleSort_Time(double bubbleSort_Time) {
        BubbleSort_Time = bubbleSort_Time;
    }

    void BubbleSort(int [] arr){
        int arr_length = arr.length;

        for (int i = 0; i < arr_length; i++){
            for (int k = 0; k < arr_length - i - 1; k++){
                if (arr[k] > arr[k + 1]){

                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }

    void PrintArray(int []arr){
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++){
            System.out.println(arr[i]);

        }
    }

}
