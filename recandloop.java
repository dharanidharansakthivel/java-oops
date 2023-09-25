/*using java program differentiate recursion and looping  */
import java.util.*;
public class recandloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        recandloop f=new recandloop();
        System.out.println("enter the fact number");
        int fact=sc.nextInt();
        int result=f.factorial(fact);
        System.out.println("the value of printed using iteration :"+result);

        double loopval=1;
        //we are using looping
        for(int i=1;i<=fact;i++){
            loopval=i*loopval;
        }

        System.out.println("the value printed using looping :"+loopval);
    }
//using recursion 
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        else {
           return n*factorial(n-1);
        }
    }
}
