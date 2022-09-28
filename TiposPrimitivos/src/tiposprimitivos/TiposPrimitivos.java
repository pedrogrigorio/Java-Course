package src.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.printf("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        System.out.printf("A nota de %s é %.1f \n", nome, nota);

        String notaString = Float.toString(nota);
        System.out.printf("Nota em string: %s \n", notaString);

        float notaString2Integer = Float.parseFloat(notaString);
        System.out.printf("String para float: %.1f",notaString2Integer);

        teclado.close();
    }
}
