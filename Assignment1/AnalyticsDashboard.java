package Assignment1;

public class AnalyticsDashboard {
    public static void main(String[] args) {
        String[] ageStrings = {"5", "13", "18", "30", "65", "80", "15", "2", "40", "70"};
        int child = 0, teen = 0, adult = 0, senior = 0;
        for (String ageStr : ageStrings) {
            int age = Integer.parseInt(ageStr);

            if (age >= 0 && age <= 12) {
                child++;
            } else if (age >= 13 && age <= 17) {
                teen++;
            } else if (age >= 18 && age <= 59) {
                adult++;
            } else if (age >= 60) {
                senior++;
            }
        }

        int total = ageStrings.length;
        System.out.println("Child: " + (child * 100.0 / total));
        System.out.println("Teen: " + (teen * 100.0 / total));
        System.out.println("Adult: " + (adult * 100.0 / total));
        System.out.println("Senior: " + (senior * 100.0 / total));


    }
}

