public class HeapSort 
{
    /*
    Heapifies a subtree whose root is an index in arr[], n is the size of the
    heap
    */
    void maxHeapify(int arr[], int n, int root)
    {
        int max = root; // Make the largest the root
        int left = 2*root + 1;
        int right = 2*root + 2;
        
        // If left child is larger that the root
        if (left < n && arr[left] > arr[max])
            max = left;
        
        // If the right child is the largest
        if (right < n && arr[right] > arr[max])
            max = right;
        
        // If the largest is not the root
        if (max != root)
        {
            int temp = arr[root];
            arr[root] = arr[max];
            arr[max] = temp;
            
            maxHeapify(arr, n, max);
        }
    }
    
    public void sort(int arr[])
    {
        int n = arr.length;
        
        // Builds the heap
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);
        
        // Extract each element from the heap
        for (int i = n - 1; i >= 0; i--)
        {
            // Move the current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Heapify the reduced heap
            maxHeapify(arr, i, 0);
        }
    }
}
