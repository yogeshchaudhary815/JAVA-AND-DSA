package $03_controlFlowStatement;

public class $12_sumFirstAnsLastDigit {
    public static void main(String[] args) {
         int number = 564;
        
        System.out.println(calcu(number));
    }
    public static int calcu(int num){
        int temp = num;
        int lastDigit = num%10;
        int count = 0;
        int firstDigit = num;
        int sum =0;
        while(temp != 0){
            temp = temp/10;
            count++;
            System.out.println("count"+ count);
        }
       for(int i=count;i>1;i--){
          firstDigit = firstDigit/10;
             if(i == 2){
                 sum = firstDigit+lastDigit;
                }
       }
       return sum;
    }
}

// same work with different approach and better way


// public class $12_sumFirstAnsLastDigit {
//     public static int sumFirstAndLastDigit (int num)
//     {
//         if (num < 0)
//             return -1;
//         int first = 0, last = num % 10;
//         num = num / 10;
        
//         while (num != 0)
//         {
//         	if (num / 10 == 0)
// 	            first = num % 10;
// 	        num = num / 10;
//         }
//         return first + last;
//     }

//     public static void main (String[]args)
//     {
//         System.out.println (sumFirstAndLastDigit (352));
//         System.out.println (sumFirstAndLastDigit (1));
//         System.out.println (sumFirstAndLastDigit (-7));
//     }
// }