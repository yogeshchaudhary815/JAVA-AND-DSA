package $03_controlFlowStatement;

public class $20_canPack {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));   // Should return false
        System.out.println(canPack(1, 0, 5));   // Should return true
        System.out.println(canPack(0, 5, 4));   // Should return true
        System.out.println(canPack(2, 2, 11));  // Should return true
        System.out.println(canPack(-3, 2, 12)); // Should return false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (goal > ((bigCount * 5) + smallCount)) {
            return false;
        }
        if ((goal % 5) <= smallCount) {
            return true;
        }
        return false;
    }
}

// same work but different code by me and its too lengthy 

// public class $20_canPack {
//   public static void main(String[] args) {
//     int bigCount = 3;
//     int smallCount = 1;
//     int goal = 14;
//     System.out.println(canPack(bigCount,smallCount, goal));
//   }
//   public static boolean canPack(int bigCount, int smallCount, int goal){
//     int numBigCount = 5 * bigCount;
//     int numSmallCount = 1 * smallCount;
//     if(goal > numBigCount){
//       goal = goal - numBigCount;
//          if(goal > numSmallCount){
//             return false;
//          } else{
//           return true;
//          }
//     }else{ if (goal % 5 == 0) {
//       goal = numBigCount - goal;
//                if (goal > numSmallCount) {
//                 return false;
//                } else{
//                 return true;
//                }
//             }else{ goal = goal - numSmallCount;
//                        if (goal%5 == 0) {
//                            if(numBigCount > goal){
//                             return true;
//                            }else{ return false;}
//                        }else{ return false;}
//                    }
//          }
//    }
// }