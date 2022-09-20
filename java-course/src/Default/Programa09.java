// FOR
package Default;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner input = new Scanner(System.in);

        // VÁRIAVEL DE CONTROLE; CONDIÇÃO DE PARADA; FORMA DE INCREMENTO; 
        // i++ => i = i + 1 
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe seu nome: ");
            nome = input.nextLine();
    
            System.out.println("Informe sua idade: ");
            
            idade = Integer.parseInt(input.nextLine());
            
            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }
        input.close();
    }
}
