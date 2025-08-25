package assignment_01;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----    Analytics Dashboard — Age Group Categorization    -----\n");
        System.out.print("Enter the Ages of the Patients (separated by spaces): ");
        String patientAges=sc.nextLine();
        Integer childCount=0;
        Integer teenCount=0;
        Integer maturedCount=0;
        Integer seniorCount=0;
        Integer wrongInputCount=0;

        // Split the string into individual ages
        String[] ageArray = patientAges.split(" ");
        Integer totalPatients = ageArray.length;

        // Process each age
        for(int i=0; i<totalPatients; i++){
            Integer age = Integer.parseInt(ageArray[i]);

            if(age<=0){
                System.out.println("Patient "+(i+1)+"'s age is given as "+age+" which is a wrong input.");
                wrongInputCount++;
            }
            else if(age<=12){
                childCount++;
            } else if (age<=19) {
                teenCount++;
            } else if (age<=59) {
                maturedCount++;
            }
            else{
                seniorCount++;
            }
        }

        // Print summary header based on wrong inputs
        if(wrongInputCount > 0){
            System.out.println("Leaving out the wrong inputs, the age categorization summary is--");
        } else {
            System.out.println("The age categorization summary is--");
        }

        Integer validPatients = totalPatients - wrongInputCount;

        // Print results with 2 decimal places
        System.out.printf("Child Count: %d & ChildCountPercent: %.2f%%\n", childCount, (childCount*100.0/validPatients));
        System.out.printf("Teen Count: %d & TeenCountPercent: %.2f%%\n", teenCount, (teenCount*100.0/validPatients));
        System.out.printf("Senior Count: %d & SeniorCountPercent: %.2f%%\n", seniorCount, (seniorCount*100.0/validPatients));
        System.out.printf("Matured Count: %d & MaturedCountPercent: %.2f%%\n", maturedCount, (maturedCount*100.0/validPatients));

    }
}
