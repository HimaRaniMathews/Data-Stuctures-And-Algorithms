public class MinMax {
        /* Class Pair is used to return two values from getMinMax() */
        public static void getMinMax(int[] arr,int n){
        int min=arr[0];int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            } if (arr[i]>max) {
                max=arr[i];

            }
        }

            System.out.printf("\nMinimum element is %d", min);
            System.out.printf("\nMaximum element is %d", max);
        }

        /* Driver program to test above function */
        public static void main(String args[]) {
            int arr[] = {1000, 11, 445, 1, 330, 3000};
            int arr_size = 6;
            getMinMax(arr, arr_size);

        }



}
