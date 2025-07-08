package $03_controlFlowStatement;

public class $14_hasSharedDigit {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 55;
       System.out.println( hasSharedDigit(num1,num2));
    }
    public static boolean hasSharedDigit(int num1,int num2){
        int remNum1;
            int remNum2;
            boolean shareIt = false;
        if(num1 > 10 && num2 > 10 && num1 < 99 && num2 <99){
        
            while( num1 != 0){
                remNum1 = num1%10;
                num1 = num1/10;
                while (num2 != 0) {
                    remNum2 = num2%10;
                    num2 = num2/10;
                    if (remNum1 == remNum2) {
                        shareIt = true;
                        break;
                    }
                }
            }
            
        }
        return shareIt;
    }
}
