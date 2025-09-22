package javatopic.day3conditionalloop.assignments;

public class Assignment5 {
    public static void main(String[] args) {
        Integer northSales[]=new Integer[4];
        northSales[0]=1000;
        northSales[1]=2000;
        northSales[2]=3000;
        northSales[3]=4000;
        Integer southSales[]=new Integer[4];
        southSales[0]=1100;
        southSales[1]=1700;
        southSales[2]=1900;
        southSales[3]=2000;
        Integer westSales[]=new Integer[4];
        westSales[0]=2100;
        westSales[1]=2700;
        westSales[2]=1000;
        westSales[3]=5000;
        Integer eastSales[]=new Integer[4];
        eastSales[0]=2150;
        eastSales[1]=3100;
        eastSales[2]=1800;
        eastSales[3]=5000;
        Integer totalNorthSales=0;
        Integer totalSouthSales=0;
        Integer totalWestSales=0;
        Integer totalEastSales=0;
       for(Integer sale:northSales){
           totalNorthSales=totalNorthSales+sale;

        }
       if(totalNorthSales>10000){
           System.out.println("N :sales is high");
       }
       else if(totalNorthSales>5000){
           System.out.println("N: sales is medium");
       }
       else{
           System.out.println("N: sales is low");
       }
       for(Integer sale:southSales){
           totalSouthSales=totalSouthSales+sale;
       }
        if(totalSouthSales>10000){
            System.out.println("S: sales is high");
        }
        else if(totalSouthSales>5000){
            System.out.println("S: sales is medium");
        }
        else{
            System.out.println("S: sales is low");
        }
       for(Integer sale:westSales){
           totalWestSales=totalWestSales+sale;
       }
        if(totalWestSales>10000){
            System.out.println("W: sales is high");
        }
        else if(totalWestSales>5000){
            System.out.println("W: sales is medium");
        }
        else{
            System.out.println("W: sales is low");
        }
       for(Integer sale:eastSales){
           totalEastSales=totalEastSales+sale;
       }
        if(totalEastSales>10000){
            System.out.println("E: sales is high");
        }
        else if(totalEastSales>5000){
            System.out.println("E: sales is medium");
        }
        else{
            System.out.println("E: sales is low");
        }



    }
}
