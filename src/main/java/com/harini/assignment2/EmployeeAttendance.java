package com.harini.assignment2;

public class EmployeeAttendance {
    public static void main(String[] args) {
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };

        for(int i=0;i<attendance.length;i++){
            int cntP=0;
            int cntL=0;
            int cntA=0;
            for(int j=0;j<attendance[i].length;j++){
                if(attendance[i][j]=='P'){
                    cntP++;
                }
                if(attendance[i][j]=='L'){
                    cntL++;
                }
                if(attendance[i][j]=='A'){
                    cntA++;
                }
            }
            System.out.println("Employee "+(i+1)+" attendance summary for the week :");
            System.out.println("Present: "+cntP+"; Absent: "+cntA+"; Leave: "+cntL);
        }
    }
}
