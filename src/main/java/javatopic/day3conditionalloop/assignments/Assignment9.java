package javatopic.day3conditionalloop.assignments;
// employee attendance summary
public class Assignment9 {
    public static void main(String[] args) {
     char[][] attendance = {
             {'P','P','A','P','L','P','P'},
             {'P','A','A','P','P','P','L'},
             {'P','P','P','P','P','P','P'}

     };

     for(int i=0;i<attendance.length;i++){
         int present=0;
         int absent=0;
         int leave=0;
        for(int j=0;j<attendance[i].length;j++){
            if(attendance[i][j]=='P'){
                present++;
            }
            else if(attendance[i][j] =='A'){
                absent++;
            }
            else{
                leave++;
            }

        }
        System.out.println("Employee"+(i+1)+":");
        System.out.println("Present "+present);
        System.out.println("Absent "+absent);
        System.out.println("Leave "+leave);
     }

    }
}
