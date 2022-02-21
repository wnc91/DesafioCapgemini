package desafio;
import java.util.Scanner;

public class Questao1 {

    private static final String SPACE = " ";
    private static final String ASTERISK = "*";

    public static void main(String[] args) {
        System.out.print("Digite o número de degraus: ");
        Scanner input = new Scanner(System.in);
        int numberOfStairs = input.nextInt();

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

        }
    }
}