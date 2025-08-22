package javatopic.day2.assignments;

public class Assignment5 {
        public static void main(String[] args) {
            // 1. Input list of patient ages as strings
            String[] ageStrings = {"5", "12", "15", "18", "25", "30", "45", "65", "80", "17", "13", "59", "61"};

            // 2. Initialize counters
            int childCount = 0, teenCount = 0, adultCount = 0, seniorCount = 0;
            int totalPatients = ageStrings.length;

            // 3. Process each age
            for (String ageStr : ageStrings) {
                int age = Integer.parseInt(ageStr); // wrapper conversion

                // Categorize using logical + relational operators
                if (age < 13) {
                    childCount++;
                } else if (age >= 13 && age < 20) {
                    teenCount++;
                } else if (age >= 20 && age < 60) {
                    adultCount++;
                } else {
                    seniorCount++;
                }
            }

            // 4. Calculate percentages
            double childPercent = (childCount * 100.0) / totalPatients;
            double teenPercent = (teenCount * 100.0) / totalPatients;
            double adultPercent = (adultCount * 100.0) / totalPatients;
            double seniorPercent = (seniorCount * 100.0) / totalPatients;

            // 5. Output results
            System.out.println("---- Patient Age Group Analytics ----");
            System.out.println("Total Patients: " + totalPatients);
            System.out.println("Children (<13): " + childCount + " (" + String.format("%.2f", childPercent) + "%)");
            System.out.println("Teens (13-19): " + teenCount + " (" + String.format("%.2f", teenPercent) + "%)");
            System.out.println("Adults (20-59): " + adultCount + " (" + String.format("%.2f", adultPercent) + "%)");
            System.out.println("Seniors (60+): " + seniorCount + " (" + String.format("%.2f", seniorPercent) + "%)");
        }
    }


