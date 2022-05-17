package basics;

public class ConsExample {


    ConsExample(String hinduDeviDevta){

    }


    ConsExample(int jesus){

    }

    public void nonStatic(){

    }

    public static void sm(){}


    public static void main(String[] args) {

        //class name    object referense  new
        StaticNonStatic staticNonStatic = new StaticNonStatic();
        staticNonStatic.chotoKaKamra();
        ConsExample consExample= new ConsExample(5);

        ConsExample.sm();
        ConsExample consExample1= new ConsExample("");
        consExample1.nonStatic();



    }





}
