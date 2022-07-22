# Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
![Alt Text](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

Consider an array arr[] = {5, 1, 4, 2, 8}

Bubble sort starts with very first two elements, comparing them to check which one is greater.

( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 

( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 

( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

```
Bubble Sort algorithms ;
void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
```

# Bubble Sort Time Complexity

We denote by n the number of elements to be sorted. In the example above, n = 6.

The two nested loops suggest that we are dealing with quadratic time, i.e., a time complexity* of O(n²). 
This will be the case if both loops iterate to a value that grows linearly with n.

# Reference
1) https://www.happycoders.eu/algorithms/bubble-sort/#Bubble_Sort_Time_Complexity
2) https://www.geeksforgeeks.org/bubble-sort/
