package basics;

public class StaticNonStatic {

    public String chotaBhai= "golu";

    public static String  badaBhai= "uamesh";



    public static void mehmanLog(){
        StaticNonStatic staticNonStatic = new StaticNonStatic();
        System.out.println(staticNonStatic.chotaBhai);
        System.out.println(badaBhai);

    }


    public void chotoKaKamra(){
        System.out.println(badaBhai);
        System.out.println(chotaBhai);


    }






}
