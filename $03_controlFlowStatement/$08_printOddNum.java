package $03_controlFlowStatement;

import java.util.Scanner;

public class $08_printOddNum {
    // using while loop aur DoWhile loop
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter starting number of the range : ");
        int startNum = sc.nextInt();
        System.out.print("enter last number of the range :");
        int lastNum = sc.nextInt();
        // for(int i=startNum;i<=lastNum;i++){
        //         if(isOdd(i)){
        //         System.out.println(i +"is a odd number");
        //     }
        // }

        // using while loop

          int i = startNum;
          while(i<=lastNum){
             i++;
                if(isOdd(i)){
                System.out.println(i +" is a odd number");
              }
            }
        }     
    public static boolean isOdd(int num){
        if(num%2 == 0){
            return false;
        }
        return true;
    
    }
}
