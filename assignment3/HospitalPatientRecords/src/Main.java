//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //patient object is created

        Patient john = new Patient(1234,"John",19);
//        john.setName("John");
//        john.setAge(19);
//        john.setPatientId(1234);
        john.displayPatientInfo();
        System.out.println("------------------");


//        inpatient object
        Inpatient alex= new Inpatient(98789,"Alex",21,204,"2/9/2024");
        alex.displayPatientInfo();
        System.out.println("------------------");

//        outatient object
        Outpatient betty = new Outpatient(23432,"betty",30,"2/5/2024",600.0);
        betty.displayPatientInfo();


    }
}