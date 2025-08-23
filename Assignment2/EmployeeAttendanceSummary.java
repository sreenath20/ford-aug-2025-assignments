package Assignment2;

import java.util.Scanner;

public class EmployeeAttendanceSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        String[][] attendance=new String[row][col];
        System.out.println("-------------------------");
        System.out.println("Enter the attendance data");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                attendance[i][j]=sc.next();
            }
            System.out.println();
        }
        for(int i=0;i<row;i++)
        {
            int p=0,a=0,l=0;
            for(int j=0;j<col;j++)
            {
                if(attendance[i][j].equals("P"))
                {
                    p+=1;
                }
                else if(attendance[i][j].equals("A"))
                {
                    a+=1;
                }
                else
                {
                    l+=1;
                }
                if(j==col-1)
                {
                    System.out.println("Employee "+(i+1)+"->"+"P: "+p+", "+"A: "+a+", "+"L: "+l);
                }
            }
        }
    }
}
