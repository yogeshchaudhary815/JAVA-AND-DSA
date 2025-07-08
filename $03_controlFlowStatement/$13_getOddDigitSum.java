package $03_controlFlowStatement;

public class $13_getOddDigitSum  {
    public static void main(String[] args) {
        int number =123456789;
        System.out.println(getOddDigitSum(number));
    }
    public static int getOddDigitSum(int num){
        int temp = num;
        int remNum;
        int sum = 0;
        while(temp != 0){
          remNum = temp%10;
          temp = temp/10;
          if(remNum%2 != 0){
            sum += remNum;
          }
        }

        return sum;
    }
}
