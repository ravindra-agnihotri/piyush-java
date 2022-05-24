package basics;

public class MethodAndVar {

//public= access modifier, static = static/non-static, void= return type main= method name, () = paremeter space,
// {} body
    public static void main(String[] args) {
        mixer("orange");

        ;;;;
        System.out.println(mixer("mango"));
        System.out.println(mixer("chiku"));
        System.out.println(mixer("mosambi "+ "peru"));
      drainage();

        System.out.println(mixer("dsd"));
        String coldJuiceJar = mixer("ppp");
        //String gungunaJuiceJar = mixer1();

        System.out.println(calculator (4,5));


    }

    //MethodAndVar
// package = small , method = small letter(camelcase), class= starts with capital(camelcase)

 // void - return type
// " abc"+ " xyz" == abc xyz

    public static String mixer(String fruit){
        System.out.println(StaticNonStatic.badaBhai);
       return fruit + " suger" + " water" + " ice";

    }
    public static void mixer1(){


    }

    public static void drainage(){
        String kachra = "dry " + "wet";    }

    public static int calculator (int i, int j){
                int sum= i + j;
        return sum;
    }


/**
 * create methods for :
 *
 * cooker
 * bike
 * washinmachine
 *
 */




}
