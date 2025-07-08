package $03_controlFlowStatement;
public class $10_sumOfNum {
  public static void main(String[] args) {
     Integer n = 12345;
     int rem;
     int sum =0;
     while(n != 0){
        rem = n%10;
        sum += rem;
        n = n/10; 
     }
     System.out.println(sum);
  }
    
}