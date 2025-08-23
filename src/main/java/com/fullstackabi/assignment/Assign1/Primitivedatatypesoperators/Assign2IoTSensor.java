package com.fullstackabi.assignment.Assign1.Primitivedatatypesoperators;//        Concepts: Primitive types, bitwise operators, logical operators, wrapper methods
//        A smart sensor sends 8-bit integers. Each bit has a signal. Use bitwise & logical operators to extract
//        values and take actions (e.g., motion + light off = turn on light). Use wrapper methods like
//        Integer.toBinaryString(). Output human-readable statuses and alerts.

public class Assign2IoTSensor {
    public static void main(String[] args) {

        System.out.println("IoT Sensor Normalization");

        byte sensorSignal = 0b00001010;

        boolean isFirstBitLightOff = (sensorSignal & 1) == 0;
        boolean isSecondBitMotionOn = (sensorSignal & (1 << 1)) != 0;
        boolean isThirdBitAcOff = (sensorSignal & (1 << 2)) == 0;
        boolean isFourthBitSoundOn = (sensorSignal & (1 << 3)) != 0;

        if (isFirstBitLightOff && isSecondBitMotionOn) {
            System.out.println("There is a movement in the room, turning on the lights");
        }
        if (isSecondBitMotionOn && isThirdBitAcOff) {
            System.out.println("There is a movement in the room, turning on the AC");
        }
        if (isFirstBitLightOff && isFourthBitSoundOn) {
            System.out.println("There is a sound in the room, turning on the lights");
        }
    }
}
