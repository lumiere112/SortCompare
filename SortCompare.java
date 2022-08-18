
public class SortCompare {
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    /*
    10 Arrays are declared, half are sorted with Quick sort, the other half are
    sorted with Heap sort. The duration of each sort is recorded and the average
    for each are compared at the end. The arrays were generated using Python's 
    random.randint() function.
    */
    public static void main(String args[])
    {
        // Declare arrays for heap sort
        int arr1[] = {39, 64, 69, 4, 53, 19, 59, 40, 35, 36, 19, 77, 37, 31, 66,
                     12, 49, 77, 81, 56, 23, 11, 55, 23, 13, 78, 69, 76, 77, 97};
        
        int arr2[] = {99, 39, 99, 51, 76, 70, 67, 22, 0, 42, 90, 39, 4, 71, 96, 
                      47, 45, 5, 45, 11, 45, 3, 66, 44, 48, 4, 67, 30, 78, 29};
        
        int arr3[] = {14, 90, 14, 9, 8, 69, 37, 66, 79, 64, 29, 76, 24, 51, 85,
                      59, 81, 50, 83, 78, 62, 74, 53, 53, 16, 25, 69, 83, 55, 69};
        
        int arr4[] = {12, 78, 44, 84, 0, 63, 26, 0, 96, 64, 58, 35, 74, 30, 89, 
                      43, 52, 53, 52, 29, 51, 57, 89, 59, 48, 51, 23, 0, 65, 20};
        
        int arr5[] = {90, 67, 60, 54, 60, 76, 48, 80, 38, 93, 59, 37, 25, 7, 58,
                      0, 31, 28, 90, 100, 61, 45, 79, 76, 75, 59, 66, 75, 88, 72};
        
        // Declare arrays for quick sort
        int arr6[] = {93, 68, 85, 80, 7, 25, 88, 20, 83, 33, 55, 92, 11, 87, 62,
                      21, 40, 59, 47, 52, 64, 69, 33, 22, 27, 44, 54, 11, 58, 31};
        int n6 = arr6.length;
        
        int arr7[] = {55, 60, 91, 15, 98, 66, 87, 69, 22, 45, 61, 86, 36, 76, 19,
                      87, 40, 42, 31, 42, 43, 48, 39, 16, 54, 38, 63, 18, 50, 86};
        int n7 = arr7.length;
        
        int arr8[] = {93, 20, 40, 54, 23, 4, 82, 43, 0, 96, 4, 73, 99, 65, 39,
                      73, 58, 54, 74, 53, 5, 62, 82, 23, 14, 69, 39, 94, 85, 1};
        int n8 = arr8.length;
        
        int arr9[] = {31, 80, 87, 46, 100, 12, 97, 95, 74, 43, 54, 28, 100, 11,
                      78, 93, 1, 82, 85, 76, 1, 5, 93, 54, 57, 66, 65, 22, 90, 89};
        int n9 = arr9.length;
        
        int arr10[] = {22, 100, 64, 75, 69, 68, 85, 47, 52, 89, 85, 55, 58, 80,
                       42, 14, 45, 30, 6, 43, 7, 21, 70, 91, 45, 18, 17, 3, 7, 74};
        int n10 = arr10.length;
        
        
        QuickSort quick = new QuickSort();      
        HeapSort heap = new HeapSort();
        long start;
        long end;
        
        // Heap sorts
        // Array 1
        start = System.nanoTime();
        heap.sort(arr1);
        end = System.nanoTime();
        long duration1 = (end - start);
        System.out.println("Heap sort Array 1:");
        printArray(arr1);
        System.out.printf("Duration: %d ns", duration1);
        System.out.println();
        
        // Array 2
        start = System.nanoTime();
        heap.sort(arr2);
        end = System.nanoTime();
        long duration2 = (end - start);
        System.out.println("Heap sort Array 2:");
        printArray(arr2);
        System.out.printf("Duration: %d ns", duration2);
        System.out.println();
        
        // Array 3
        start = System.nanoTime();
        heap.sort(arr3);
        end = System.nanoTime();
        long duration3 = (end - start);
        System.out.println("Heap sort Array 3:");
        printArray(arr3);
        System.out.printf("Duration: %d ns", duration3);
        System.out.println();
        
        // Array 4
        start = System.nanoTime();
        heap.sort(arr4);
        end = System.nanoTime();
        long duration4 = (end - start);
        System.out.println("Heap sort Array 4:");
        printArray(arr4);
        System.out.printf("Duration: %d ns", duration4);
        System.out.println();
        
        // Array 5
        start = System.nanoTime();
        heap.sort(arr5);
        end = System.nanoTime();
        long duration5 = (end - start);
        System.out.println("Heap sort Array 5:");
        printArray(arr5);
        System.out.printf("Duration: %d ns", duration5);
        System.out.println();
        
        // Quick Sorts
        // Array 6
        start = System.nanoTime();
        quick.sort(arr6, 0, n6 - 1);
        end = System.nanoTime();
        long duration6 = (end - start);
        System.out.println("Quick sort Array 6:");
        printArray(arr6);
        System.out.printf("Duration: %d ns", duration6);
        System.out.println();
        
        // Array 7
        start = System.nanoTime();
        quick.sort(arr7, 0, n7 - 1);
        end = System.nanoTime();
        long duration7 = (end - start);
        System.out.println("Quick sort Array 7:");
        printArray(arr7);
        System.out.printf("Duration: %d ns", duration7);
        System.out.println();
        
        // Array 8
        start = System.nanoTime();
        quick.sort(arr8, 0, n8 - 1);
        end = System.nanoTime();
        long duration8 = (end - start);
        System.out.println("Quick sort Array 8:");
        printArray(arr8);
        System.out.printf("Duration: %d ns", duration8);
        System.out.println();
        
        // Array 9
        start = System.nanoTime();
        quick.sort(arr9, 0, n9 - 1);
        end = System.nanoTime();
        long duration9 = (end - start);
        System.out.println("Quick sort Array 9:");
        printArray(arr9);
        System.out.printf("Duration: %d ns", duration9);
        System.out.println();
        
        // Array 10
        start = System.nanoTime();
        quick.sort(arr10, 0, n10 - 1);
        end = System.nanoTime();
        long duration10 = (end - start);
        System.out.println("Quick sort Array 10:");
        printArray(arr10);
        System.out.printf("Duration: %d ns", duration10);
        System.out.println();
        
        long heapAvg = (duration1 + duration2 + duration3 + duration4 + duration5) / 5;
        long quickAvg = (duration6 + duration7 + duration8 + duration9 + duration10) / 5;
        System.out.println();
        System.out.printf("\nHeap sort average: %d ns", heapAvg);
        System.out.printf("\nQuick sort average: %d ns", quickAvg);
    }
}
