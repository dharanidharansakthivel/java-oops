import java.util.*;
//sieve
public class expo {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag = false;

   for (int i = 2; i <= n / 2; ++i) {
     
      if (n % i == 0) {
        flag = true;
        break;
      }
    }
    if(!flag){
        System.out.println(n+", 1");
    }
     /*
    else{
        int num=n;
        int count1=0;
        int count2=0;
        for(int j=2;j<=n;){
            if(num%j==0){
                 num=num/j;

                 if(j==2){
                    count1=count1+1;
                 }
                  if(j==3){
                    count2=count2+1;
                 }

            }
            else{
                j++;
            }
        
        }
        System.out.println("2,"+count1);
        System.out.println("3,"+count2);
    }*/ 
    else{
        int i=2;
       while (n!=1) {
        int con=0;
        while (n%i==0) {
           n= Math.floorDiv( n, i);
           con+=1;
        }
        if(con>0){
            System.out.println(i+" "+con);
        }
        i+=1;
       }
    }


    }
}
