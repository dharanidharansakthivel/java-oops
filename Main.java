
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        int arr[] = new int[52];
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean b[]=new boolean[52];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-97]+=1;
        }

        for(int i=0;i<str.length();i++){
            if(!b[str.charAt(i)-97]){
            System.out.println(str.charAt(i)+"-->"+arr[str.charAt(i)-97]);
            b[str.charAt(i)-97]=true;}
        }

    }
}