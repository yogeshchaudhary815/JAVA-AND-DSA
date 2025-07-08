package $03_controlFlowStatement;

public class $18_isPerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int num){
        boolean isPerfect = false;
        int sum = 0;
        if(num < 1){
            return isPerfect;
        }else {
            for(int i=1; i<num; i++){
                if(num%i == 0){
                    sum += i;
                }
            }
        }if(sum == num) isPerfect = true;


        return isPerfect;
    }
}
