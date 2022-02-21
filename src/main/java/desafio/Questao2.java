package desafio;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Questao2 {
    public static void main(String[] args) {

        String entrada;
        String caracteresEspeciais = "!@#$%^&*()-+";
        boolean flagCaracterEspecial = false;
        boolean flagCaixaAlta = false;
        boolean flagCaixaBaixa = false;
        boolean flagNumerico = false;
        int contadorPendentes = 0;

        System.out.println("Digite a senha: ");
        Scanner in = new Scanner( System.in );

        entrada = in.nextLine();
        System.out.println(entrada);

        for (char c : entrada.toCharArray()) {
            if (caracteresEspeciais.contains(valueOf(c))){
                flagCaracterEspecial = true;
            }
            if (Character.isUpperCase(c)){
                flagCaixaAlta = true;
            }
            if (Character.isLowerCase(c)){
                flagCaixaBaixa = true;
            }
            if (Character.isDigit(c)){
                flagNumerico = true;
            }
        }

        if  (!flagCaracterEspecial){
            contadorPendentes++;
        }
        if  (!flagCaixaAlta){
            contadorPendentes++;
        }
        if  (!flagCaixaBaixa){
            contadorPendentes++;
        }
        if  (!flagNumerico){
            contadorPendentes++;
        }

        System.out.println(" ");
        System.out.println(Math.max(contadorPendentes, 6 - entrada.length()));

    }

}
