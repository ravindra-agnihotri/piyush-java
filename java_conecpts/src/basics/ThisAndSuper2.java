package basics;

public class ThisAndSuper2 extends ThisAndSuper{

    public  int number= 150;

    ThisAndSuper2(){

    }

    public void aMethod(){
        System.out.println( this.number);
    }
    public static void main(String[] args) {
        ThisAndSuper2 thisAndSuper2= new ThisAndSuper2();
        thisAndSuper2.aMethod();
       // System.out.println(ThisAndSuper.number);

    }
}
