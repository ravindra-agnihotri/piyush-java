package basics;

import accessmodifiers.AccessCheck;

public class America extends AccessCheck{


    public static void main(String[] args) {
        System.out.println(StaticNonStatic.badaBhai);
        System.out.println(AccessCheck.aPublic);
        System.out.println(AccessCheck.aProtected);



        //object creation
        //class name,  object reference, new = memory allocate karne, last() = constructor
        StaticNonStatic staticNonStatic = new StaticNonStatic();

        /**
         * first way to call -
         * by class name reference
         * by object reference
         */
StaticNonStatic.mehmanLog();
        System.out.println(StaticNonStatic.badaBhai);

        System.out.println(staticNonStatic.chotaBhai);

       staticNonStatic.chotoKaKamra();
    }









}








































































































































