package com.demo.day2;

public class Day2 {

    public static void main(String[] args) {

        //Operators

        int a=10;
        int b=2;

        System.out.println(a==b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        //program to see if a person can go out
        boolean isRaining = false;
        boolean isCompletedHomeWork = true;
        if(!isRaining && isCompletedHomeWork){
            System.out.println("You can go out and play");
        }
        else if(!isCompletedHomeWork){
            System.out.println("You can't go out and play because you didnt complete your homework");
        }
        else if(isRaining){
            System.out.println("You can't go out and play because its raining");
        }
        else{
            System.out.println("You can't go out and play because you didnt complete your homework and its raining");
        }


        // the phone needs to recharge if the battery % is below 20 and there is no network
        int batteryPercentage = 20;
        boolean isNetwork = false;
        boolean isBatteryLow = batteryPercentage<=20 ? true : false;
        if(!isNetwork || isBatteryLow){
            System.out.println("You shld recharge your phone");
        }
        else{
            System.out.println("No need to recharge");
        }

        boolean result = 50>10 ? true : false;
        System.out.println(result);

        //instance of
        Integer finalresult=100;
        if(finalresult instanceof Integer){
            System.out.println("Its an integer");
        }
        else{
            System.out.println("Its not an integer");
        }


        //complement of binary
        Integer binary = 0b0001;
        Integer binaryResult = ~binary;
        System.out.println(Integer.toBinaryString(binaryResult));

        Integer sampledata=8;
        System.out.println(sampledata<<2);
        System.out.println(sampledata>>1);

        //BINARY AND OR
        Integer binaryOne = 0b0001;
        Integer binaryTwo = 0b0011;
        Integer binaryAnd = binaryOne & binaryTwo;
        System.out.println("BINARY AND "+Integer.toBinaryString(binaryAnd));
        Integer binaryOr = binaryOne |binaryTwo;
        System.out.println("BINARY OR "+Integer.toBinaryString(binaryOr));


        //8 lights check whether the 3rd light is one or off
        Integer lights=0b01111011;
        Integer lightnumber=3;
        Integer lighton= lights & (lightnumber+1);
        boolean isLightOn = (lighton == lightnumber+1) ? true : false;
        System.out.println(isLightOn);


        //check whether a file has write operation if not give it
        //8 4 2 1
        //  r w e
        byte file = 0b0100;
        byte checkforwrite = (byte) (file >> 1);
        byte result1 = (byte) (checkforwrite & 1);
        if(result1==0){
            System.out.println("The file has no write permission");
            byte finalresult1= (byte) (file | 2);
            System.out.println("Write permission given");
            System.out.println(Integer.toBinaryString(finalresult1));
        }
        else{
            System.out.println("The file already has write permission");
        }




    }

}
