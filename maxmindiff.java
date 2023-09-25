import java.util.Arrays;

public class maxmindiff {
    public static void main(String[] args) {
        int[] arr={4,3,1,6,8,9};
        Arrays.sort(arr);
        int minval=Integer.MAX_VALUE;
        int maxval=Integer.MIN_VALUE;
       /* for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int val=arr[i]-arr[j];
                if(val<minval ){

                    minval=val;
                }
                if(val>maxval ){

                    maxval=val;
                }
            }
        }

        */ 
        for(int i=0;i<arr.length-1;i++){
            int val=arr[i+1]-arr[i];
            if(val<minval ){

                    minval=val;
                }
                
        }
        maxval=arr[arr.length-1]-arr[0];
        System.out.println("minimum is "+minval);
        System.out.println("maximum is "+maxval);
    }
}
