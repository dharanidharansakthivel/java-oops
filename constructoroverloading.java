public class constructoroverloading {//cmpile time polymorphism
    int id;
    String name;
    int age;

    constructoroverloading(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args) {
       constructoroverloading c1=new constructoroverloading(36, "dharani", 20) ;
       constructoroverloading c2=new constructoroverloading(4, "anand", 20) ;

       c1.display();
       c2.display();
    }
}
 