package assignment2.assignment2Part2;

public class EmployeeAttendanceSummary {
    public static void main(String[] args){
   char[][] attendance = {
        {'P','P','A','P','L','P','P'},
        {'P','A','A','P','P','P','L'},
        {'P','P','P','P','P','P','P'}
    };
   int presentCount = 0;
   int absentCount = 0;
   int leaveCount = 0;

    for(int i=0;i<attendance.length;i++){
        for(int j=0;j<attendance[i].length;j++){

            if(attendance[i][j]=='P'){
                presentCount++;
            }
            if(attendance[i][j]=='A'){
                absentCount++;
            }
            if(attendance[i][j]=='L'){
                leaveCount++;
            }

        }
        System.out.println("Employee " +(i+1) +"-> P: " +presentCount+" , A: " +absentCount+" , L: " +leaveCount );
        presentCount=0;
        absentCount=0;
        leaveCount=0;

    }
}
}
