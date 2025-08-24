package day1;

public class Assignment5 {
    public static void main(String[] args) {
        String[] ageStrings = {"5", "13", "17", "22", "36", "65", "75", "10"};
        int child = 0, teen = 0, adult = 0, senior = 0;

        for (String ageStr : ageStrings) {
            int age = Integer.parseInt(ageStr);
            if (age < 13) child++;
            else if (age >= 13 && age <= 19) teen++;
            else if (age >= 20 && age <= 59) adult++;
            else senior++;
        }

        int total = ageStrings.length;
        System.out.println("Child: " + child + " (" + (child * 100 / total) + "%)");
        System.out.println("Teen: " + teen + " (" + (teen * 100 / total) + "%)");
        System.out.println("Adult: " + adult + " (" + (adult * 100 / total) + "%)");
        System.out.println("Senior: " + senior + " (" + (senior * 100 / total) + "%)");

    }
}
