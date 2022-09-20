// DO WHILE
package Default;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        int idade;
        String nome;

        // RECEBER DADOS DO USUÁRIO VIA TECLADO;
        Scanner teclado = new Scanner(System.in);

        // PRIMEIRO EXECUTA UM BLOCO, DEPOIS FAZ A CHECAGEM;
        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
    
            System.out.println("Informe sua idade: ");
            // idade = teclado.nextInt(); //BUG => string - inteiro - string  
            idade = Integer.parseInt(teclado.nextLine());
            
            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        } while (idade > 0);

        teclado.close();
    }
}
