package $03_controlFlowStatement;
import java.util.*;
class NumberToWords
{
    public static void numberToWords (int num)
    {
        if (num < 0)
        {
        	System.out.println ("-1");
	        return;
        }
        int temp = num;
        ArrayList < String > list = new ArrayList < String > ();
        String arr[] ={ "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine" };
        while (temp != 0)
        {
    	    list.add (arr[temp % 10]);
	        temp = temp / 10;
        }
    
        for (int i = list.size () - 1; i >= 0; i--)
            System.out.print (list.get (i) + " ");
        System.out.println ();
    }
    public static void main (String[]args)
    {
        numberToWords (123);
        numberToWords (3456);
        numberToWords (-7);
    }
}

// same work but diffrente program by me

// public class $19_numberToWords  {
//     public static void main(String[] args) {
//         numberToWords(3456);
//     }
//     public static void numberToWords(int number){
//         int count = 1;
//         int num = number;
//         while(num > 9){
//            num = num/10;
//            count = count *10;
//         }
//         System.out.println(count);
//           for(int i=count; i>=1; i=i/10 ){
//            int digit = number/i;
//            int rem = number%i;
//            number = rem;
//            switch (digit) {
//             case 1:
//                   System.out.print("one ");
//                 break;
//             case 2:
//                   System.out.print("two ");
//                 break;
//             case 3:
//                   System.out.print("three ");
//                 break;
//             case 4:
//                   System.out.print("four ");
//                 break;
//             case 5:
//                   System.out.print("five ");
//                 break;
//             case 6:
//                   System.out.print("six ");
//                 break;
           
//             default:
//                 break;
//            }
          

          
//         }
//     }
// }
