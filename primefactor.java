import java.util.Scanner;

class primefactor{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int fac=s.nextInt();
        for(int i=2;i<=fac;i++){
            if(i%fac==0){
                if(i%2==0){
                    System.out.println(i);
                }

            }

        }
        
    }
}