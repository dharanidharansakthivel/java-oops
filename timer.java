import java.io.*;
import java.util.*;
import java.util.Scanner;

public class timer {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        double bs=s.nextDouble();
         double gross=bs+(0.15*bs)+(0.2*bs)+2000;
        double pf=0.1*gross;
        double ef=0.2*gross;
        double inc=0.25*gross;
        double all=ef+pf+inc;
         System.out.println(gross-all);
    }
}