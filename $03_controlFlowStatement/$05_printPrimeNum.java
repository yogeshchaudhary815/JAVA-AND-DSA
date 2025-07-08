package $03_controlFlowStatement;

import java.util.Scanner;

public class $05_printPrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter starting number of the range : ");
        int startNum = sc.nextInt();
        System.out.print("enter last number of the range :");
        int lastNum = sc.nextInt();
        printPrime(startNum , lastNum);
    }
    public static void printPrime(int startNum , int lastNum){
        for(int i = startNum;i<= lastNum;i++){
             int count = 0;
        for(int j = 2; j<=(i/2);j++){
          if(i%j == 0){
            count++;
          }
        }
        if (count == 0) {
            System.out.println(i +" is a prime number");
        }
        }
        // same work but different approach by me

        //  for(startNum = startNum;startNum<= lastNum;startNum++){
        //      int count = 0;
        // for(int j = 2; j<=(startNum/2);j++){
        //   if(startNum%j == 0){
        //     count++;
        //   }
        // }
        // if (count == 0) {
        //     System.out.println(startNum +" is a prime number");
        // }
        // }
    }
}
