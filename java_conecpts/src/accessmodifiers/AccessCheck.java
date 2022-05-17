package accessmodifiers;

public class AccessCheck {

    //public = which can be called any where in whole project/or in another project

    public static String aPublic= "har jagah";

    //private - it can be called only inside class not outside anywhere
    private static String aPrivate= "50 KG gold" ;


    //protected - it can be called inside packacge but if someone from outside package wants to call then relation must be there
    // extend karna chaiye
    protected static String aProtected= "beti";

    //default - only inside package bahar kahi nahi kaise bhi nahi
    static String aDefault = "pet dog";


    public static void main(String[] args) {

    }
}
