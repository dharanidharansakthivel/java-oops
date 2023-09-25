import java.util.Collections;
import java.util.HashMap;

public class winner {
    public static void main(String[] args) {
        
        String [][] t={{"c","java"},{"java","python"},{"python","c"}};
        int [] w={0,1,0};
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<t.length;i++){
           for(String el:t[i]){
            if(!hs.containsKey(el)){
                hs.put(el,0);
            }

           }
        }
        for(int i=0;i<w.length;i++){
            if(w[i]==0){
                hs.put(t[i][1], hs.get(t[i][1])+1);
            }
            else{
                hs.put(t[i][0], hs.get(t[i][0])+1);
            }
        }
        System.out.println(hs);

        int largestValue = Collections.max(hs.values());
 
        System.out.println(largestValue);
       
    }
}
