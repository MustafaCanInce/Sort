package Main_Package;

public class bubble_sort {

    private double BubbleSort_Time;

    private double[] all_BubbleSort_Time;

    public double[] getAll_BubbleSort_Time() {
        return all_BubbleSort_Time;
    }

    public void setAll_BubbleSort_Time(double[] all_BubbleSort_Time) {
        this.all_BubbleSort_Time = all_BubbleSort_Time;
    }

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

    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    static void printArray(double[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}
