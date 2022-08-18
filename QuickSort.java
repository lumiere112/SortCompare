public class QuickSort 
{
    /*
    This takes the last element as the pivot, sorts it to its correct place,
    then places smaller elements to its left and larger elements to its right.
    */
    int partition(int arr[], int low, int high) 
    {
        int pivot = arr[high];
        int i = (low - 1); // Smaller element
        for (int j = low; j < high; j++)
        {
            if (arr[j] <= pivot) // If the current element is <= to pivot
            {
                i++;
                
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swaps high elements past the pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    /*
    arr[] - array
    low - start
    high - end
    Recursively calls Quicksort to sort an array on either side of a pivot.
    */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int p = partition(arr, low, high);
            
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }
}
