
abstract class Bank{
    abstract int getInterstRate();
}
class citi extends Bank{
    int getInterstRate(){
        return 7;
    }
}
class hsbc extends Bank{
    int getInterstRate(){
        return 17;
    }
}
class canara extends Bank{
    int getInterstRate(){
        return 27;
    }
}

class mainab{
    public static void main(String[] args) {
        Bank b;
        b=new citi();
        
        System.out.println("city rate"+b.getInterstRate()+"%");
        b=new hsbc();
        System.out.println("city rate"+b.getInterstRate()+"%");
        
    }
}