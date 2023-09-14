import java.util.*;
class voting{
    String vname;
    int id;
    void castvote(){
        System.out.println("hello.."+vname+"  id :"+id+ " you casted vote");

    }
    void withdrawcasting(){
        System.out.println("hello.."+vname+"  id :"+id+ " you withdraw vote");

    }
}
public class vote {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        voting v =new voting();
        System.out.println("enter the user name");
        v.vname=sc.next();
        System.out.println("enter the user id ");
        v.id=sc.nextInt();
        v.castvote();
        v.withdrawcasting();

        //second 
        System.out.println("  now we are getting second user ");
        voting v1 =new voting();
        System.out.println("enter the user name");
        v1.vname=sc.next();
        System.out.println("enter the user id ");
        v1.id=sc.nextInt();
        v1.castvote();
        v1.withdrawcasting();

        //third 
          System.out.println("  now we are getting second user ");
        voting v2 =new voting();
        System.out.println("enter the user name");
        v2.vname=sc.next();
        System.out.println("enter the user id ");
        v2.id=sc.nextInt();
        v2.castvote();
        v2.withdrawcasting();

    }
}
