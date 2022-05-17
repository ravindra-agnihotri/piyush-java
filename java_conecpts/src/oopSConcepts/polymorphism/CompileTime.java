package oopSConcepts.polymorphism;

import accessmodifiers.AccessCheck;

public class CompileTime {
    /**
     * overloading is having more than 1 method with same name and different parameters
     * @param username
     * @param password
     */

    public void login(String username, String  password){

    }

    public static String login(int username, String  password){
        System.out.println(AccessCheck.aPublic);
return "asd";
    }
}
