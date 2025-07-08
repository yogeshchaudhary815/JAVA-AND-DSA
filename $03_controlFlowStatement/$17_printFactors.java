package $03_controlFlowStatement;

public class $17_printFactors {
    public static void main(String[] args) {
        printFactors(32);
    }
    public static void printFactors(int num){
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
