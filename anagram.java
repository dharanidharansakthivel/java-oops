import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //String str=sc.next();
       // String str2="abce";

       String[] str1={"abc","eswd","ytre"};
       String[] str2={"bca","ews","yter"};

       HashMap<String , Integer > hm=new HashMap<String, Integer>();
       HashMap<String , Integer > hm1=new HashMap<String, Integer>();
       for(int i=0;i<str1.length;i++){
        char[] ch=str1[i].toCharArray();
        int j=0;
        while(j<str2.length){

            char[] ch1=str2[i].toCharArray();

         Arrays.sort(ch);
         Arrays.sort(ch1);
         int count1=0;
         int count=0;
         if(Arrays.equals(ch, ch1) ){

        System.out.println(str1[i]+" "+str2[j]+"anagrams");

        count+=1;
        count1+=1;
        hm.put(str1[i], count);
        hm1.put(str2[j], count1);
       }
       else{
        System.out.println("not anagrams");
       }
       j++;
        }
        
       }
       for (String i : hm.keySet()) {
        System.out.println("key: " + i + " value: " + hm.get(i));
      }
      for (String i : hm1.keySet()) {
        System.out.println("key: " + i + " value: " + hm.get(i));
      }
    
       
    }
}

/**
 * anagram
 */
/*public class anagram {
    public static void arraysort(String str,String str1){
        int[] arr=new int[25];
        int[] arr1=new int[25];
        for(char c:str.toCharArray()){
            arr[c-97]+=1;
        }
        for(char c1:str1.toCharArray()){
            arr1[c1-97]+=1;
        }

        if(Arrays.equals(arr,arr1)){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
    }

    public static void main(String[] args) {
        String str="hello";
        String str1="hleo";
        arraysort(str,str1);
        

    }
}*/


/**
 * anagram
 * public class anagram {
public static void main(String[] args) {
    String[] s={"abc","eswd","ytre"};
    String[] s1={"abc","eswd","ytre"};
    

}
    
}
 */
