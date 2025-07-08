package $03_controlFlowStatement;

import java.util.Scanner;

class $09_printTable {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for print table");
        int num = sc.nextInt();
        int i =1;
        int table;
        while(i<=10){
            table = i*num;
            System.out.println(num+" * "+i +" = "+ table);
            i++;
        }
     }
    
}