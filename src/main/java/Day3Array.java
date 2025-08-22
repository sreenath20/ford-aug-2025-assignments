import java.util.Scanner;

public class Day3Array {
    public static void main(String[] args) {
        //Array
        int[] num = new int[10]; //declaration
        Integer[] wrappedNum = new Integer[10];
        int[] num2 = {1, 2, 3}; //initialization
        //2D Array
        Integer[][] attendance = {
                {1, 2, 3},
                {3, 4, 5},
                {5, 6, 7}
        };
        //3D Array
        Integer[][][] threeDarr = new Integer[2][2][2];
        //4D Array - cube of cube..how many cubes u want.
        // Scanner class - To get Input from the user
        Scanner scan = new Scanner(System.in);
//        Integer inScan = scan.nextInt();
//        Double doubleScan = scan.nextDouble();
        //create Array of double and store the values
        // total percentage of a student for 7 subjects , store and processing it.
        System.out.println("Calculating the percentage os a student");
        System.out.println("Enter the number of subjects ");
        Integer numOfSubjects = scan.nextInt();
        Double[] marks = new Double[numOfSubjects];
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Enter the marks of subject " + (i + 1));
            marks[i] = scan.nextDouble();
        }
        Double totalMarks = 0.0;
        for (Double mark : marks) {
            System.out.println("All Subject marks " + mark);
            totalMarks = totalMarks + mark;
            System.out.println("Total Marks: " + totalMarks);
        }
        // Temp Monitoring system ; Store daily temp of city for "n" number of days.
        // FInd number of days exits less than 40 degree.(colder days)
        //find average temp for the n days.
        Double thersholdTemp = 40.0;
        Double averageTemp = 0.0;
        Double averagePercentTemp = 0.0;
        int countFortyDegree = 0;
        int countHighDegree = 0;

        System.out.println("Temp Monitoring System");
        System.out.println("Enter the number of days to monitor the Temp");
        Integer numOfDays = scan.nextInt();
        Double[] userTemp = new Double[numOfDays];
        for (int i = 0; i < numOfDays; i++) {
            System.out.println("Enter the temp for day " + (i + 1));
            userTemp[i] = scan.nextDouble();
            averageTemp = averageTemp + userTemp[i];
            if (userTemp[i] <= thersholdTemp) {
                countFortyDegree++;
            } else {
                countHighDegree++;
            }
        }
        System.out.println("Colder Temp days (<40Degree) :" + countFortyDegree);
        System.out.println("Higher Temp days (>40Degree) :" + countHighDegree);
        System.out.println("Average Temp for " + numOfDays + " Days is " + (averageTemp / numOfDays));
    }
}


