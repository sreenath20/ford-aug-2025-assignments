import java.sql.SQLOutput;

public class Day2OperatorsCond {
    public static void main(String[] args) {
        Double data = 107.0;
        System.out.println("modulus of 10=" + data % 2);
        Double result = data / 2;
        System.out.println("result =" + result);
        Integer value = 100;
        System.out.println(value);
        value--;
        System.out.println(value);
        Boolean isActive = true;
        System.out.println(!isActive);
        System.out.println(isActive);
        Double numberOne = 500.0;
        Double numberTwo = 505.0;
        //urnary operator
        Boolean isNotRain = true;
        Boolean isHWDone = true;
        Boolean goForPlay = !isNotRain && isHWDone;
        System.out.println("Go for Play or not?" + goForPlay);
        int batteryPowerPercent = 20;
        // Boolean lowBatteryPower = batteryPowerPercent <= 20;
        Boolean hasNetwork = true;
        Boolean chargeTheMobile = (batteryPowerPercent < 20) || !hasNetwork;
        System.out.println("Charge your battery as power is 20% and no network");

//        if(IsNotRain && IsHWDone){
//            System.out.println("Go for Play");
//        }
//        else{
//            System.out.println("Don't Go for Play");
//        }
        //Ternary operators
        System.out.println("is Greater : " + ((50 > 40) ? "Im Greater Value" : "I'm A Lesser Value"));
        Boolean toUppercase = true;
        String caseConversion = "ford";
        System.out.println("Convert to Uppercase :" + ((toUppercase) ? caseConversion.toUpperCase() : caseConversion.toLowerCase()));
        //instanceof operator ; its only for Wrapper class(Integer) not for datatypes (int,short)
        Integer finalResult = 100;
        if (finalResult instanceof Integer) {
            System.out.println("this is an integer");
        }
        String output = (finalResult instanceof Integer) ? "Im an Integer" : "Not an integer";
        System.out.println(output);
        //Bitwise operators; Used in masking in realtime
        Integer binary = 0b1111;
        Integer binaryResult = ~binary;
        System.out.println(Integer.toBinaryString(binaryResult));
        System.out.println(binary);
        System.out.println(binaryResult);
        //Left and right shift bitwise operator
        Integer sampleData = 2;
        System.out.println(sampleData << 2);
        System.out.println("Im leftshift: " + sampleData);
        System.out.println(sampleData >> 1);
        System.out.println("IM rightshift: " + sampleData);
        //Bitwise & operator ; compares each bit
        Integer binaryOne = 0b0001;
        Integer binaryTwo = 0b0010;
        Integer binaryAnd = binaryOne & binaryTwo;
        System.out.println("Int value " + binaryAnd);
        System.out.println("Binary and & is " + binaryAnd);
        Integer binaryOr = binaryOne | binaryTwo;
        System.out.println("Int Value " + binaryOr);
        System.out.println("Binary OR | is " + Integer.toBinaryString(binaryOr));
        //Assignment 8 lights in bit format; check whether 3rd light in on
        Integer eightBit = 0b0001;
        //Right shift eight bit
        int thirdRightShift = eightBit >> 1 ;
        System.out.println("Im shifted value: " + Integer.toBinaryString(thirdRightShift));
        System.out.println("Now my int value is " + thirdRightShift);
        int thirdLightOn = eightBit | thirdRightShift;
        System.out.println("Light is " + (thirdLightOn == 1 ? "ON" : "OFF"));
        // Add write permission to a user if he dont have it.
        //consider read operation 8; write 4 ;execute as 2
        Integer readPermission = 0b1000;
        Integer writePermission = 0b0100;
        Integer executePermission = 0b0010;
        Integer user1ReadAccess = 0b1000;
        if (user1ReadAccess == readPermission) {
            System.out.println("User do not have write permission, Giving Writing access to user");
        }
        //do rightshift of user1REadAccess
        Integer user1WriteAccess = user1ReadAccess >> 1;
        System.out.println("write access is(binary) " + Integer.toBinaryString(user1WriteAccess));
        System.out.println("Access is " + (user1WriteAccess == writePermission ? "Granted" : "Not Granted"));
    }
}