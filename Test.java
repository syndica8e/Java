public class Test {
    public static void conquer(int arr[], int si,int mid , int ei){
        //Code here for Conquer
        // O(n)
        int merged[] = new int[ei-si+1];   //new arr
        int idx1 = si; //track 1st sub arr
        int idx2 = mid+1; //track 2nd sub arr
        int x = 0; //track merged arr

        while (idx1 <= mid && idx2 <= ei  ){
            if ( arr[idx1] < arr[idx2]){  // 6 < 5
                merged[x++] = arr[idx1++];
            }else{   
                merged[x++] = arr[idx2++];  //5
            }
        }
//incase the right part is sorted
        while(idx1 <= mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
//incase the left part is sorted
        while(idx2 <= ei){
            merged[x] = arr[idx2];  //5
            x++;
            idx2++;
        }
//Copy elements from Merged Array to "arr" original array
        for ( int i =0 ,j=si ; i < merged.length ; i++,j++){
            arr[j] = merged[i];
        }


    }

    public static void divide(int arr[], int si, int ei){
        //O(logn)
        if(si>=ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si , mid , ei);
    }

    public static void main(String[] args) {
        //O(nlogn)
        int arr[] = {6 , 3, 9, 5 ,2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        //print Array values
        for ( int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }  
}