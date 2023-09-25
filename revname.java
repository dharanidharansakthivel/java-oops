import java.util.*;
public class revname {
    public static void main(String[] args) {
        String name="Dharanidharan";

        revname r=new revname();

        int length=name.length();
        System.out.println(r.rev(name,length-1));
    }
    public String rev(String n,int i){
        if(i<0){
            return "";
        }
        return (n.charAt(i)+rev(n,i-1));
    }
}
