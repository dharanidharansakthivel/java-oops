class arrays{
    public static void main(String[] args) {
        /*int[][] num={};
        for(int i=0;i<num.length;i++){
            System.out.println(" ");
            for(int j=0;j<num[i].length;j++){
                System.out.print(" "+num[i][j]);        
        }
        }   */ 

        int[] val={50,30,40,60,10,20};
        for(int i=val.length-1;i>=val.length-3;i--){
            System.out.println(val[i]);
        }

        String[] pub={"shreyas","suhas","vikas","plyboo"};
        System.out.println("length is "+pub.length);
    }
}
