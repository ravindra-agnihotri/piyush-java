package oopSConcepts.encap;

public class Ravindra {


    public static void main(String[] args) {
        Closed close = new Closed();
        System.out.println(close.getAtm());


        close.setAtm(2000);

        System.out.println(close.getAtm());
    }
}
