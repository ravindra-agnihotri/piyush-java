package oopSConcepts.inheritance;

public class Son extends Father{

    public static void main(String[] args) {
        System.out.println(color);
        Father father = new Father();
        System.out.println(father.car);

        father.kheti("cooton");
        gramoPhone();
        Son son= new Son();
        System.out.println( son.car);
        son.kheti("ache rice");
        son.job();


    }

    public void job(){

    }





}
