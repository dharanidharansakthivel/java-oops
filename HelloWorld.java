abstract class Networks{
    abstract void modelname();
}
class Router extends Networks{
    void modelname(){
        System.out.println("Router");
    }
}
class Switch extends Networks{
    void modelname(){
        System.out.println("Switch");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Networks n;
        n=new Router();
        n.modelname();
        n=new Switch();
        n.modelname();
    }
}