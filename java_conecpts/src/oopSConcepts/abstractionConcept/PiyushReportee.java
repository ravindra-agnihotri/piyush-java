package oopSConcepts.abstractionConcept;

public class PiyushReportee extends TeamLead{
    @Override
    public void testcasewriting() {
        System.out.println("testcase");
    }

    @Override
    public void regression() {
        System.out.println("regression");
    }

    @Override
    public void defectLog() {
        System.out.println("defect log");
    }


    public static void main(String[] args) {
        TeamLead teamLead= new PiyushReportee();
        teamLead.attendance();
        TeamLead.reportSend();

        PiyushReportee piyushReportee= new PiyushReportee();

    }
}
