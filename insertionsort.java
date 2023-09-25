public class insertionsort {
    public static void main(String[] args) {
        int[] arr={2,5,6,4,9,1,};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j >= 0 && temp < arr[j]){
               
                arr[j+1]=arr[j];
                
                j--;
            }
            // while (j >= 0 && arr[j] > key) {
            //     arr[j + 1] = arr[j];
            //     j--;
            // }
            arr[j+1]=temp;

        }

        for(int val : arr){
            System.out.print(val+"");
        }
    }
}
