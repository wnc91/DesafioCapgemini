import java.util.Scanner;

public class Questao1 {

        private static final String SPACE = " ";
        private static final String ASTERISK = "*";

       public int questao_1(int num) {
            int numberOfStairs = num;
            int steps = 0;

            for (int i = 1; i <= numberOfStairs; i++) {
                var isLastIteration = numberOfStairs == i;
                for (int space = numberOfStairs; space > i; space--) {
                    System.out.print(SPACE);
                }
                for (int asterisk = 0; asterisk < i; asterisk++) {
                    System.out.print(ASTERISK);
                }

                if (!isLastIteration)
                    System.out.println("");
                steps=steps+1;
            }
            return  steps;
        }
    }
