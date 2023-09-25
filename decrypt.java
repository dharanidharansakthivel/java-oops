import java.util.*;
 
/*class Decrypt {
    public static void main(String[] args) {
        String s = "221abc00ba*c0";
        char[] c = s.toCharArray();
        int len = s.length();
        StringBuilder result = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            char temp;
            switch (c[i]) {
                case '0':
                    if (i > 0) {
                        temp=c[0];
                       c[i]=temp;
                       result.append(temp);
                    }
                    
                    break;
                case '*':
                    if (i > 0) {
                        temp = c[i-1];
                        c[i-1] = c[i - 2];
                        c[i - 2] = temp;
                        result.append(c[i-1]);
                    }
                    
                    break;
                default:
                 result.append(c[i]);
                 break;

                    // code block
            }
        }
       System.out.println(result);
    }
}*/

/*public class decrypt{
    public static void main(String[] args) {
        String s="221abc00BA*c0";
        char ch[]=s.toCharArray();
        int j=0;
        for(int i=ch.length-1;i>0;i--){
             if(ch[i]=='0'){
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=0;
                j++;
                
                 
             }
             if(ch[i]=='*'){
                char tt=ch[i-1];
                ch[i-1]=ch[i+1];
                ch[i+1]=tt;
                ch[i]=0;
                int k=i+1;
                while( k<ch.length-1&& Character.isUpperCase(ch[k+1])){
                    char ttf=ch[k+1];
                    ch[k+1]=ch[k];
                    ch[k]=ttf;
                    k++;
                }
                
                
                
             }
        }
        String ss=new String(ch);
        
        System.out.println(ss);
    }
}*/
public class decrypt {
    public static void main(String[] args) {
        String s="221abc00bA*c0";
        char ch[]=s.toCharArray();
        int j=0;
        for(int i=ch.length-1;i>0;i--){
             if(ch[i]=='0'){
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=0;
                j++;
                
                 
             }
             if(ch[i]=='*'){
                char tt=ch[i-1];
                ch[i-1]=ch[i-2];
                ch[i-2]=tt;
                ch[i]=0;
             }
        }
        String ss=new String(ch);
        
        System.out.println(ss);
    }
}

