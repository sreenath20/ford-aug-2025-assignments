

public class EmployeeAttendanceSummary {
    public static void main(String[] args) {
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };

        for (int i = 0; i < attendance.length; i++) {
            int p = 0, a = 0, l = 0;
            for (int d = 0; d < attendance[i].length; d++) {
                char c = Character.toUpperCase(attendance[i][d]);
                switch (c) {
                    case 'P': p++; break;
                    case 'A': a++; break;
                    case 'L': l++; break;
                    default:  break;
                }
            }
            System.out.println("Employee " + (i + 1) + " → P: " + p + ", A: " + a + ", L: " + l);
        }
    }
}
