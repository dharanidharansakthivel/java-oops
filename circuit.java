import java.util.*;
class circuit{
    public static void main(String[] args) {

        //stste of circuit
      /*  int state=0;
        if(state==1){
            System.out.println("the system is in on state");
        }else if(state==0){
            System.out.println("off");
        }
        else{
            System.out.println("neutral");
        }*/ 

        //traffic signal

       /* String tl="red";
        if (tl=="red"){
            System.out.println("vehicle stop ..!!!!");
        }else if(tl=="yellow"){
            System.out.println("  __vehicle is getting ready to move__");
        }
        else if(tl=="green"){
            System.out.println("--vehicle proceed__");
        }
        else{
            System.out.println("enter correctly");
        } */


        Scanner sc= new Scanner(System.in);
        System.out.println("enter the chess piece");
        String pos =sc.nextLine();
        if(pos.equals("king")){
            System.out.println("the position is in the right");
        }else if(pos.equals("queen")){
            System.out.println("the position is in the left");
        }else if(pos.equals("pawn")){
            System.out.println("the position is in the top");
        }else{
            System.out.println("please enter the correct value");
        }



    }
}