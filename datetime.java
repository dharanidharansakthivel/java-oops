import java.util.*;
import java.time.LocalTime;
public class datetime{
    public static void main(String[] args) {
        String s="01:06:45:PM";
        String h1= s.charAt(0);
        String h2 =s.charAt(1);
        String hh=h1+h2;
        int hr=integer.paraseint(hh);
        if(s.charAt(8)=='A'){
            if(hr==12){
                System.out.println("00");
                for(int i=2;i<=7;i++){
                    System.out.println(s.charAt(i));
                }
            }
            else{
               for(int i=0;i<=7;i++){
                    System.out.println(s.charAt(i));
                } 
            }
        }
    if(s.charAt(8)=='P'){
            if(hr==12){
                System.out.println("12");
                for(int i=2;i<=7;i++){
                    System.out.println(s.charAt(i));
                }
            }
            else{
                hr=hr+12;
                 System.out.println(hr);
               for(int i=0;i<=7;i++){
                    System.out.println(s.charAt(i));
                } 
            }
        }
        }
    
    }
     
    