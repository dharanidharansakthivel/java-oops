//import java.util.*;
/* 
public class intstrlen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] c=str.toCharArray();
        int intlen=0;
        int strlen=0;
        for(char ch:c){
            System.out.println(ch);
            if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                intlen+=1;
            }
            else{
                if(ch!=' '){

                     strlen+=1;
                }
               
            }
        }
        System.out.println("length of string "+strlen+" "+"len of int "+intlen);
    }
}*/
/* 
import java.util.*;

public class intstrlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        int intLen = 0;
        int strLen = 0;

        for (char ch : c) {
            if (Character.isDigit(ch)) {
                intLen++;
            } else if (!Character.isWhitespace(ch)) {
                strLen++;
            }
        }

        System.out.println("Number of integers in the string: " + intLen);
        System.out.println("Number of characters in the string: " + strLen);
    }
}*/
