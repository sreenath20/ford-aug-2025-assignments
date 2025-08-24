package Day1;

public class AgeGroupCategorisation {
    public static void main(String[] args) {
        String[] patientAge = {"18","20","3","80","78","45","9"};
        Integer childGroup = 0;
        Integer teenGroup = 0;
        Integer adultGroup = 0;
        Integer seniorGroup = 0;

        for (String age : patientAge) {
            int convertedAge = Integer.parseInt(age);

            if (convertedAge >= 0 && convertedAge <= 11) {
                childGroup +=1;
            } else if (convertedAge >= 12 && convertedAge <= 19) {
                teenGroup +=1;
            } else if (convertedAge >= 20 && convertedAge <= 65) {
                adultGroup +=1;
            }
            else if (convertedAge >= 66) {
                seniorGroup +=1;
            }

        }
        System.out.println("The child group count         : " + childGroup);
        System.out.println("The Teenage group count       : " + teenGroup);
        System.out.println("The count of adults are       : " + adultGroup);
        System.out.println("The count of senior citizens  : " + seniorGroup);

    }
}
