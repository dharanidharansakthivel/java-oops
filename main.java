class car{
    //car is the encapsulated entity which is binding data members and member functions in the class
    String color;//data members of the class
    int speed;
    void start(){
        System.out.println("car start");
    }
    void stop(){//member function of the class
        System.out.println("car stopped");
    }
}
class main{
    public static void main(String[] args) {
        car obj= new car();
        obj.color="red";
        obj.speed=10;
        System.out.println("color is "+obj.color);
        System.out.println("speed  is "+obj.speed);

        obj.start();
        obj.stop();
    }
}