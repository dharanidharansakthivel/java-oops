import java. util. Scanner;
class arclen{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius and theta");
        double rad=sc.nextDouble();
        double theta=sc.nextDouble();
        double val = 2*3.14*rad*(theta/360);
        System.out.println(val);

    }
}