class add {
    int marks;
    String name;
}

public class demo {
    public static void main(String[] args) {
       add s1=new add();
       s1.name="dharani";
       s1.marks=97;

       add s2=new add();
       s2.name="dharani";
       s2.marks=97;

       add arradd[]=new add[3];
       arradd[0]=s1;
       arradd[1]=s2;

       for(int i=0;i<=arradd.length;i++){
         System.out.print(arradd[i].name+" : "+arradd[i].marks);
       }
      

    }
}
