package javatopic.day2.assignments;

public class Assignment2 {
    public static void main(String[] args) {

        byte maskLightSensor = 0b00000100;// 3 bit for light , 4 bit for motion
        byte maskMotionSensor = 0b00001000;
        int sensorSignal = 0b00000000;

        boolean isLightOn= (sensorSignal & maskLightSensor) !=0;
        boolean isMotionDetected=(sensorSignal & maskMotionSensor)!=0;
        if (!isLightOn && isMotionDetected) {
            System.out.println("turn on light");
        } else {
            System.out.println("no action needed");
        }
    }
}
