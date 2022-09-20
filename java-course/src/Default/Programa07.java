// WHILE
package Default;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        // RECEBER DADOS DO USUÁRIO VIA TECLADO;
        Scanner teclado = new Scanner(System.in);

        // SEMPRE CHECA O VALOR ANTES DE EXECUTAR O BLOCO;
        while (idade > 0) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
    
            System.out.println("Informe sua idade: ");
            // idade = teclado.nextInt(); //BUG => string - inteiro - string  
            idade = Integer.parseInt(teclado.nextLine());
    
            System.out.println(nome + " tem " + idade + " anos.");
        }

        teclado.close();
    }
}