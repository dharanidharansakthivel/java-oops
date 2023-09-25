/*
 * 1.make the first first char of string as a capital
 * 2.seperating the vowels and printing the remaining strings
 * 3.reversing the alternate char
 * 4.replacint the special char insted of vowels in a string 
 */
import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String capital=str.substring(0, 1);
        capital=capital.toUpperCase();
        String ans1=capital+str.substring(1);
        System.out.println("1.printing the first letter as capital "+ans1);

        // to seperate vowels 
        
        String ans2=str.replaceAll("[AEIOUaeiou]","");
        System.out.println("2.After removig the vowels "+ans2);

        //reversing alternate char

        char[] ans3=str.toCharArray();
        for(int i=1;i<ans3.length;i+=2){
            ans3[i]=ans3[i-1];
        }
        for(char a:ans3){
            System.out.print(a);
        }
        System.out.println("");
        
        String ans4=str.replaceAll("[AEIOUaeiou]","*");
        System.out.println("4.after replacing the special char:"+ans4);
    }
}
