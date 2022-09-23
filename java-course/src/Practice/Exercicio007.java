package Practice;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        float nota1, nota2, media;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite suas notas: ");
        // nota1 = input.nextFloat();
        // nota2 = input.nextFloat();
        nota1 = Float.parseFloat(input.nextLine());
        nota2 = Float.parseFloat(input.nextLine());

        if (nota1 >= 0.0 && nota2 >= 0.0) {
            if (nota1 <= 10.0 && nota2 <= 10.0) {
                media = (nota1 + nota2) / 2;
                System.out.println("Sua média foi " + media);
            } else {
                System.out.println("Notas inválidas.");
            }
        }
        input.close();
    }
}
