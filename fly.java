abstract class flyingcreature{
    abstract void flyingwithwings();  
}
class eagle extends flyingcreature{
    void flyingwithwings(){
        System.out.println("flies at an higher altitude");
    }
}
class bat extends flyingcreature{
    void flyingwithwings(){
  
        System.out.println("flying with a lower atitude");
    }
}
public class fly {
    public static void main(String[] args) {
        flyingcreature f;
        f= new eagle();
        f.flyingwithwings();
        f= new bat();
        f.flyingwithwings();
    }
}
