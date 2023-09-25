import java.util.*;
class oddeven{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        if(num%2==0){
            System.out.println("Weak number");
        }else if(num%2==1){
            System.out.println("Strong number");
        }else{
            System.out.println("enter correct value");
        }
    }
}