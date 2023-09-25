public class sortedsquarearray {
    public static void insertionSort(double[] arr) {
        double n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        double[] arr={1,2,3,7,-2,6,8,9};
        for(int i=0;i<arr.length;i++){

            arr[i]=Math.pow(arr[i], 2);
        }

        insertionSort(arr);

        for(double val:arr){
            System.out.print(val+" ");
        }
    }
}
