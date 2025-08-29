//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ExamEligibility exam = new ExamEligibility();
        try{
            exam.checkEligibility("trishanth",75);
        } catch (LowAttendanceException e) {
            System.out.println("Error: "+e.getMessage());
        }

        try{
            exam.checkEligibility("ravi",65);

        }
        catch (LowAttendanceException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}