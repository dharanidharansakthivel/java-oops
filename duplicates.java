/*develop a java program to develpoe the progt=rm to show the integer element in an array */
public class duplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,6,7,5};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
            }
        }
    }
    }
    
}
