package oopSConcepts.abstractionConcept;

public class Piyush implements Manager{

    static final boolean picnicJauKya=true;
    @Override
    public void scrum() {
        System.out.println("piyush ki scrum");
    }

    public static void main(String[] args) {
        Manager.withBody();
        Manager manager= new Piyush();
        manager.scrum();

       // Manager.appraisal=15;
        int piyushTeamAppraisal=Manager.appraisal;


    }
}
