package javatopic.day2;

public class Day2 {
    public static void main(String[] args) {
        // Boolean isHomeworkDone =false;
        // Boolean isRaining =false;
        // if(isHomeworkDone &&!isRaining){
        //     System.out.println("you can go out and play :)");
        // }
        // else if(isHomeworkDone && isRaining){
        //     System.out.println("you can not go out  and play :(");
        // }
        //
        // else{
        //     System.out.println("you can not go out and play :(");
        // }
        //
        Integer chargePercentage=90;
        Boolean networkConnection=false;

        if(!networkConnection || chargePercentage<20){
            System.out.println("Recharge your phone");
        }
        else {
            System.out.println("Your phone is good");
        }

        Boolean isGrater=(50>40) ? true:false;

        System.out.println("Grater value  "+isGrater);

        Integer finalResult = 100;

        System.out.println(finalResult instanceof Integer);

        if(finalResult instanceof Integer){ // check whether finalResult is instance of Integer
            System.out.println("It is integer");

        }
        else{
            System.out.println("It is not integer");
        }
        boolean result=(finalResult instanceof Integer) ? true : false;
        System.out.println(result);

        int binary =0b0001;
        int binaryResult=~binary;
        System.out.println("decimal form :"+binaryResult);
        System.out.println(Integer.toBinaryString(binaryResult)); // to print the binary form we use toBinaryString

        // left and right shift
        Integer sampleData =10;
        System.out.println(sampleData << 1 ); // multiply sampleData with 2 power the time of shift
        System.out.println(sampleData >> 1); // divide sampleData with 2 power the time of shift


        Integer binaryOne=0b0011;
        Integer binaryTwo=0b0010;
        Integer binaryAnd= binaryOne & binaryTwo;
        System.out.println(binaryAnd);
        System.out.println(Integer.toBinaryString(binaryAnd));



        Byte binaryOne1=0b0001;
        Byte binaryTwo1=0b0001;
        Integer binaryAnd1= binaryOne1 & binaryTwo1;
        System.out.println(Integer.toBinaryString(binaryAnd1));


        Byte light=0b00000100;
        Integer checkLight=light>>1;

        //if(checkLight==2){
          //  System.out.println(" light is on");
        //}
        //else {
          //  System.out.println(" light is off");
        //}

        Byte checkingConstant=0b00000100;
        int check=light & checkingConstant;
        System.out.println(check);
        if(check==4){

            System.out.println("3rd Light on ");
        }
        else{
            System.out.println("3rd Light off ");
        }

       // file permission
        Integer userPermisson=0b00000010;
        Integer checkPermission=userPermisson >> 1;
        if(checkPermission==1){
            System.out.println("File permission is write already ");
        }
        else{
            System.out.println("File permission modified to write");
        }


      // there logic for above
        byte userAccess=0b0000;
        byte writeMask=0b0010;
        int heCanWrite=userAccess & writeMask;
        if(heCanWrite==2){
                System.out.println("Write permission is write already ");
        }

    }
}
