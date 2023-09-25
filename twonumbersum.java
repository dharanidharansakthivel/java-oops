//import java.util.*;
//public class twonumbersum {
  /*  public static void main(String[] args) {
        int[] arr={3,5,-4,8,11,1,-1,7,6};
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        boolean bool=true;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==val){
                    System.out.println("the val which give"+val+" "+arr[i]+" "+arr[j]);
                    bool=false;
                }
            }
        }
        if(bool){
            System.out.println("match not found");
        }
    }*/ 
/* 
    public static void main(String[] args) {
        int[] arr={3,5,-4,8,11,1,-1,7,6};
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        Arrays.sort(arr);
        int j=arr.length-1;
        int i=0;
        while(i<j){
            int a=arr[i]+arr[j];
            if(a==val){

                System.out.println(" the val is "+val+" "+arr[i]+" "+arr[j]);
                i++;
                j--;
            }else if(a<val){
                i++;
            }else{
                j--;
            }
        }
    }
}*/


import java.util.HashSet;

class twonumbersum{
    public static void main(String[] args) {
        int a[]={-1,11,15,-5};
        int tar=10;
        HashSet<Integer> hs=new HashSet();
        for(int i=0;i<a.length;i++){
            int s=tar-a[i];
            if(hs.contains(s)){
                System.out.println(a[i]+" "+s);
                
            } else
            hs.add(a[i]);
        }
    }
}
