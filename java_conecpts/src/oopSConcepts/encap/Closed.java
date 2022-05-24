package oopSConcepts.encap;

public class Closed {
// having a private var in my class and accessing its value outside by means of getter and setter methods
    public int getAtm() {
        return atm;
    }

    public void setAtm(int atm) {
        this.atm = atm;
    }

    private  int atm= 9090;







    public static void badaBhai(){
      Closed close = new Closed();
        System.out.println(close.atm);
    }


}
