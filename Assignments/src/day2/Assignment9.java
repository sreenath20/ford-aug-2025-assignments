package day2;

public class Assignment9 {
    public static void main(String[] args) {
        char[][] attendance={
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };

        for(int i=0;i<attendance.length;i++){
            Integer present=0,absent=0,leave=0;
            for(char day:attendance[i]){
                if(day=='P'){
                    present++;
                }
                else if(day=='A'){
                    absent++;
                }
                else if(day=='L'){
                    leave++;
                }
            }
            System.out.println("Employee "+(i+1)+"-> P: "+present+",A: "+absent+",L: "+leave);
        }
    }
}
