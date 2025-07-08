package $03_controlFlowStatement;

public class $16_getGreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int num1, int num2) {
        int greatest = 0;

        if(num1 > 10 && num2 > 10){

            for(int i = 1; ((i <= num1) && (i <=num2)); i++ ){
                if((num1 % i == 0) && (num2 % i == 0)){
                    greatest = i;
                }
            }
            return greatest;
        } 
        else
            return -1;
    }
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}