public class SortArray {

    /**
     * sort an integer array.
     * @param input the array needed to be sorted
     * @return sorted array
     */
    public int[] sort(int[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }
    
    public void quickSort (int[] arr, int ltLim, int rtLim) {
        if (ltLim < rtLim) {
            int pivot = partition(arr, ltLim, rtLim);
            quickSort(arr, ltLim, pivot - 1);
            quickSort(arr, pivot + 1, rtLim);
        }
    }
    
    public int partition (int[] arr, int ltLim, int rtLim) {
        // int pivotIndex = new Random.nextInt(rtLim - ltLim) + ltLim;
        // int pivot = arr[pivotIndex];
        // swap(arr, pivot, rtLim);
        
        int pivot = arr[rtLim];
        int i = ltLim, j = rtLim;
        
        while (i < j) {
            while (arr[i] <= pivot && i < j) {
                ++i;
            }
            while (arr[j] > pivot && i > j) {
                --j;
            }
            swap(arr, i, j);
        }
        
        swap(arr, rtLim, j);
        
        return j;
    }
    
    private static void swap (int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
