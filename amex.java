/**
 * amex
 */
public class amex {

    public static void main(String[] args) {
        double[] val={12.2,13.7,15.3,17.2,18.1};
        double temp=0;

        for (double d : val) {

             temp= temp+d;
        }
        double mean =temp/val.length;
        double median;
        if ( val.length % 2 == 0) {
            int middle1 = val.length / 2 - 1;
            int middle2 = val.length / 2;
            median = (val[middle1] + val[middle2]) / 2.0;
        } else {
            int middle = val.length / 2;
            median = val[middle];
        }
        System.out.println("the mean value is "+mean);
        System.out.println("the mean value is "+median);

    }
}