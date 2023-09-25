/*write a java program to find out the second maximum element in an arrayYUI
 * 
 */
public class secondmax {
    public static void main(String[] args) {
        int[] arr={12,23,54,76,1,78,92,3,100};
        int max=0;
        int secondmax=0;
        for(int ar: arr){
            if(max<ar){
                secondmax=max;
                max=ar;

            }
        }
        System.out.println("the second max value is "+secondmax);
    }
}
