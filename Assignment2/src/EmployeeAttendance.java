public class EmployeeAttendance {
    public static void main(String[] args) {
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };
        System.out.println("Employee Attendance Summary:");
        for(int i = 0; i < 3; i++){
            System.out.println("---------------------------------------");
            System.out.println("Employee "+(i+1)+" Attendance Summary");
            System.out.println("---------------------------------------");
            int presentcount=0;
            int absentcount=0;
            int leavecount=0;
            for(int j = 0; j < 7; j++){
                if(attendance[i][j]=='P'){
                    presentcount++;
                }
                else if(attendance[i][j]=='A'){
                    absentcount++;
                }
                else if(attendance[i][j]=='L'){
                    leavecount++;
                }

            }
            System.out.println("Present count of employee "+(i+1)+": "+presentcount+" days");
            System.out.println("Absent count of employee "+(i+1)+": "+absentcount+" days");
            System.out.println("Leave count of employee "+(i+1)+": "+leavecount+" days");

        }

    }
}
