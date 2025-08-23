package com.assignment2_loopandswitch;

import java.util.*;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] attendance={{'P','P','P','P','P','P','P'},
                {'a' ,'A','A','A','p','P','L', 'L'},
                {'A', 'A' ,'A' ,'A', 'A', 'A', 'A' }};

        for(int i=0;i<3;i++){
            int present=0;
            int absent=0;
            int leave=0;
            for(int j=0;j<7;j++){
                switch(Character.toUpperCase(attendance[i][j])) {
                    case 'P'  :
                        present++;
                        break;
                    case 'A':
                        absent++;
                        break;
                    case 'L':
                        leave++;
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
            System.out.println("employee "+(i+1)+" -> P:"+present+" ,A: "+absent+" ,L: "+leave);
        }
    }

}
