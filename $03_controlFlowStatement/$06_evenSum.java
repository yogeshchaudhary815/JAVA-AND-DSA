package $03_controlFlowStatement;
import java.util.Scanner;
public class $06_evenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the starting number of the range : ");
        int startNum = sc.nextInt();
        System.out.print("enter the starting number of the range : ");
        int endNum = sc.nextInt();
        System.out.print(sumEven(startNum,endNum));

    }
    public static int sumEven(int startNum,int endNum){
        if(endNum >= startNum && startNum > 0){
            int sum = 0;
        for(int i = startNum;i<=endNum;i++){
            
            if(isEven(i)){
                sum = sum +i;
            }
        }
        return sum;
        } else{
            return -1;
        }
    }
    public static boolean isEven(int num){
      if(num%2 == 0){
        return true;
      }else {
        return false;
      }
    }
}
