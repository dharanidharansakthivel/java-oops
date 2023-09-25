import java.util.*;
class leap{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();
       if(year%4==0){
        System.out.println(year+" is leap year");
       }else if(year%400==0){
        System.out.println(year+" is leap year");
       }else{
        System.out.println(year+" not leap year");
       }
    }
}