// public class ReplaceChalk {
//     public static void main(String[] args) {
//         int Chalk[] = { 5, 1, 5 ,4};
//         int n = Chalk.length;
//         int k = 23;
//         int Sum = 0;
//         int Student_Number=0;
//         do {
//             for (int i = 0; i < Chalk.length; i++) {
//             if (Sum >= k) {
//                 Student_Number = i;
//             } else if (Sum < k) {
//                 Sum += Chalk[i];
//             }
//             }
//         } while (k < Sum);
//         System.out.println(Student_Number);

//     }
// }

public class ReplaceChalk {
    public static void main(String[] args) {
        int Chalk[] = { 5, 1, 5, 4 };
        int k = 23;

        int totalChalk = 0;
        for (int chalk : Chalk) {
            totalChalk += chalk;
        }

        // Reduce k to its effective value after full cycles
        k = k % totalChalk;

        // Find the student who will replace the chalk
        for (int i = 0; i < Chalk.length; i++) {
            if (k < Chalk[i]) {
                System.out.println(i);
                return;
            }
            k -= Chalk[i];
        }
    }
}


class Solution {
    class Solution {
        public int chalkReplacer(int[] chalk, int k) {
            long totalChalk = 0; 
            for (int i = 0; i < chalk.length; i++) {
                totalChalk += chalk[i];
            }
    
            k = (int)(k % totalChalk);
    
            for (int i = 0; i < chalk.length; i++) {
                if (k < chalk[i]) {
                    return i;
                }
                k -= chalk[i];
            }
    
            return -1; /
        }
    }
    