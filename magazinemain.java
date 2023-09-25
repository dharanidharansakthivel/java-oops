import java.time.LocalDate;

class mag{
    String name;
    int price;
    void buy(){
        LocalDate myObj = LocalDate.now();
        System.out.println("the magazine is bougnt on "+myObj
        );
    }
    void sell(){
        LocalDate myObj1 = LocalDate.now();
        System.out.println(" the magazine is sold on "+myObj1);
    }
}
class magazinemain{
    public static void main(String[] args) {
        mag obj=new mag();
        obj.name="harry potter";
        obj.price=100;

        System.out.println("the name of the book is "+obj.name);
        System.out.println("the price of the book is "+obj.price);

        obj.buy();
        obj.sell();
    }
}

