interface mammal{
    public void mammalsound();
    public void sleep();
}

    class man implements mammal{
        public void mammalsound(){
            System.out.println(" shouting");
        }

        public void sleep(){
            System.out.println(" sleep");
        }
    }

public class intefacemain {
    public static void main(String[] args) {
        man m=new man();
        m.mammalsound();
        m.sleep();
    }
    
}
