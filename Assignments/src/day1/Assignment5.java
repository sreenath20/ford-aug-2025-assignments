package day1;

public class Assignment5 {
    public static void main(String[] args) {
        String[] patientAges = {"10", "20", "55", "67", "33"};
        int patientCount = patientAges.length;
        Integer countChild = 0;
        Integer countAdult = 0;
        Integer countSenior = 0;

        for (int i = 0; i < patientCount; i++) {
            Integer checkCategory = Integer.parseInt(patientAges[i]);
            if (checkCategory < 18) {
                countChild++;
            } else if (checkCategory >= 18 && checkCategory < 55) {
                countAdult++;
            } else {
                countSenior++;
            }
        }
        System.out.println("Number of children in patients are :"+countChild);
        System.out.println("Number of adults in patients are :"+countAdult);
        System.out.println("Number of seniors in patients are :"+countSenior);
        System.out.println("Percentage of each patient category: \n"+"Children:"+((countChild*100)/patientCount)+"%");
        System.out.println("Adults:"+((countAdult*100)/patientCount)+"%");
        System.out.println("Seniors:"+((countSenior*100)/patientCount)+"%");
    }
}
