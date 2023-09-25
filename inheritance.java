import java.util.Scanner;
import java.util.*;

class bank{
     Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
    void deposit(){
       int deposit=0;
       System.out.println("enter the deposit to be entered");
       deposit= sc.nextInt();
       amount=deposit+amount;
        System.out.println("the amount is deposited "+deposit+" "+amount);
    }
    void withdraw(){
        int withd=0;
        System.out.println("enter withdraw amount");
        withd=sc.nextInt();
        amount=amount-withd;
        System.out.println("the amount is withdraw "+amount);
    }
}
class branch extends bank{
    void fundtransfer(){
        System.out.println("the fund is transfered");
    }
}
class inheritance{
    public static void main(String[] args) {
        branch obj=new branch();
        obj.deposit();
        obj.withdraw();
        obj.fundtransfer();
    }
}