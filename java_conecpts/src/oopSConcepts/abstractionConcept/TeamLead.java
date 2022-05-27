package oopSConcepts.abstractionConcept;

public abstract class TeamLead {
    /**
     * 1. we cannot create object of abstract class
     * 2. it can have constructor( to initialize element)
     * 3. abstract class can have abstract as well as moethod with body
     *
     * team lead is similar to a abstract class who do own work also(method with body)
     * and who get done work from team also(abstract method)
     */

    public abstract void testcasewriting();

    public abstract void regression();

    public abstract void defectLog();


    public static void reportSend(){
        System.out.println(" in tL");
    }


    public static String leave="no";
    public void attendance(){
        System.out.println("attend");
    }

}
