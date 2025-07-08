package $03_controlFlowStatement;

public class $11_isPalindrome {
    public static void main(String[] args){
        int number = 122;
        
        System.out.println(calcu(number));
    }
    public static boolean calcu(int num){
        int revNumber = 0;
         int temp = num;
        while(temp!= 0){            
           revNumber = revNumber*10 + temp%10;
           temp /=10;
        } if(num == revNumber){
            return true;
        }else{
            return false;
        }
    }
}
