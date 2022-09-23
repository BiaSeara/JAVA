package Practice;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        int num1, num2, result;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        result = Math.abs(num1 - num2); 

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1 + ", e a diferença entre os números é de: " + result);
        } else {
            System.out.println("O maior número é: " + num2 + ", e a diferença entre os números é de: " + result);
        }

        input.close();
    }
}
