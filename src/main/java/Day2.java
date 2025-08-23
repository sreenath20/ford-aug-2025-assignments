import java.util.Scanner;



public class Day2 {
    public static void main(String[] args) {

        /*System.out.println(5 == 5);
        System.out.println(5 != 5);
        System.out.println(10 >= 5);
        System.out.println(3 <= 5);
        System.out.println(5 > 5);
        System.out.println(5 > 10);

        Scanner input = new Scanner(System.in);
       System.out.println("whether it is raining or not(yes/no) : ");
        String raining=input.next();
        System.out.println("whether you completed homework  or not(yes/no) : ");
        String homework=input.next();
        boolean israining;
        if(raining.equals("yes")){
            israining=true;
        }
        else {
            israining=false;
        }
        boolean ishomework;
        if(homework.equals("yes")){
            ishomework=true;
        }
        else {
            ishomework=false;
        }
        if (israining || ishomework){
            System.out.println("you cannot go out and play");
        }
        else {
            System.out.println("you can go out and play");
        }
        System.out.println("enter the phone percentage: ");
        int  batteryPercent=input.nextInt();
        System.out.println("whether you have network  or not(yes/no) : ");
        String network=input.next();
        //boolean networkStatus=network.equals("yes");
        Boolean networkStatus=network.equals("yes") ? true : false;
        if((networkStatus==true) && batteryPercent>20) {
            System.out.println("No need to charge use your phone  ");
        }
        else {
            System.out.println("please put Recharge to your phone  ");
        }
        Boolean a=false;
       System.out.println(a instanceof Boolean);
        System.out.println(a instanceof Integer);

        Integer number=0b0000;
        Integer number2=~number;
        System.out.println(number);
        System.out.println(number2);
        Integer number3=7;
        System.out.println(number3>>2);
        System.out.println(number3<<1);


        Integer totalLights = 0b00000100;
        Integer testLights = 0b00000100;
        if ((totalLights & testLights) == 0b00000100) {
            System.out.println("3 rd light is on ");
        } else {
            System.out.println("3 rd light is off ");
        }*/

        Byte User1Permission = 0b0000;
        Byte User2Permission = 0b1111;
        Byte testmask = 0b0010;
        if ((User1Permission & testmask) == testmask) {
            System.out.println("User has write permission");
        } else {
            System.out.println("User has no write permission");
            System.out.println("now user write permission is modified");
            User1Permission = (byte) (User1Permission | testmask);
            System.out.println("User write permission is modified : "+User1Permission);
        }

    }
}
