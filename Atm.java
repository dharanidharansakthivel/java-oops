 abstract class trans{
    abstract void getvalue();
}
class withdraw extends trans{
    void getvalue(){
        System.out.println("the value in sub class");
    }
}
class debit extends trans{
    void getvalue(){
        System.out.println("base ");
    }
}
class Atm{
    public static void main(String[] args) {
        trans a=new debit();
        a.getvalue();
    }
}