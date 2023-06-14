public class QuickSort {
    public static int partition(int arr[], int low , int high){
        int pivot = arr[high];  //take pivot as last element
        int i = low-1; //tracks how many elements are lower than pivot = assuming its null

        for(int j = low ; j<high;j++){  //since arr[high] = already pivot
            if( arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index

    }
    public static void quicksort(int arr[], int low , int high){
        if( low < high){
            int pidx = partition(arr,low,high);
            quicksort(arr,low , pidx-1);
            quicksort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 6,3,9,5,2,8};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        //print sorted array
        for ( int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
}