class subarray{
    public static void main(String[] args) {
        int num[]={1,2,-3,5,7};
        int k=0;
        for(int j=0;j<num.length;j++){
        int val=0;
        for(int i=0;i<num.length;i++){
           val=val+num[i];
           if(k<val){
            k=val;

           }
        }
    }/// learn cadet algorithm
        System.out.println(k);
    }
}