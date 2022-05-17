package oopSConcepts.polymorphism.ovrride;

public class Child extends Parent{


    @Override
    public void naukri() {
        System.out.println("private");
    }


    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.naukri();
        Child child= new Child();
        child.naukri();
        Parent parent1= new Child();
        parent1.naukri();

    }

}
