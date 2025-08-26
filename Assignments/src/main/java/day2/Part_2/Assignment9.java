package day2.Part_2;

public class Assignment9 {
    public static void main(String[] args) {
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };

        for (int i = 0; i < attendance.length; i++) {
            int present = 0, absent = 0, leave = 0;
            for (char dayStatus : attendance[i]) {
                switch (dayStatus) {
                    case 'P': present++; break;
                    case 'A': absent++; break;
                    case 'L': leave++; break;
                }
            }
            System.out.println("Employee " + (i+1) + " → P: " + present + ", A: " + absent + ", L: " + leave);
        }
    }
}
