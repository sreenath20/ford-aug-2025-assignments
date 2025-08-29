import java.util.Scanner;

public class ageGroupCategorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of patient ages: ");
        int size = sc.nextInt();
        String[] ageOfPatients = new String[size];
        System.out.println("Enter the patient ages: ");
        for (int i = 0; i < size; i++) {
            ageOfPatients[i] = sc.next();
        }

        int countOfChildren = 0;
        int countOfTeen = 0;
        int countOfAdults = 0;
        int countOfSeniors = 0;
        for (String age : ageOfPatients) {
            int patientage = Integer.parseInt(age);
            if (patientage >= 13 && patientage <= 19) {
                countOfTeen++;
            } else if (patientage >= 0 && patientage <= 12) {
                countOfChildren++;
            } else if (patientage >= 20 && patientage < 60) {
                countOfAdults++;
            } else if (patientage >= 60) {
                countOfSeniors++;
            }
        }
        double chilePercentage = (countOfChildren * 100.0) / size;
        double teenPercentage = (countOfTeen * 100.0) / size;
        double adultpercentage = (countOfAdults * 100.0) / size;
        double seniorspercentage = (countOfSeniors * 100.0) / size;
        System.out.printf("Number of Children : %d\n", countOfChildren);
        System.out.printf("Percentage of Children: %.2f%%\n", chilePercentage);

        System.out.printf("Number of Teens    : %d\n", countOfTeen);
        System.out.printf("Percentage of Teens: %.2f%%\n", teenPercentage);

        System.out.printf("Number of Adults   : %d\n", countOfAdults);
        System.out.printf("Percentage of Adults: %.2f%%\n", adultpercentage);

        System.out.printf("Number of Seniors  : %d\n", countOfSeniors);
        System.out.printf("Percentage of Seniors: %.2f%%\n", seniorspercentage);


    }
}
