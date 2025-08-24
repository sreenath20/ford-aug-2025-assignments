package day7.Assignment5;

public class Driver {
    public static void main(String[] args) {
        ExamEligibility examEligibility = new ExamEligibility();
        try{
            examEligibility.checkEligibility("ABC",73.9);
        }catch(LowAttendanceException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End of the application");
        }
    }
}
