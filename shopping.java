import java.util.*;
class shopping{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String val="yes";

    while(val.equals("No")){
        System.out.println("He is not prorper");
        break;
    }

    int i=0;
    do{
        if(i==0){
        System.out.println("Tell what shop have yuo want to visit");}
        i++;
        System.out.println("Shop visited "+i);
    }while(i<5);
    }
}