package Practice;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
    double num;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Insira um número: ");
    num = input.nextDouble();

    if (num % 2 == 0) {
        double result = Math.sqrt(num);
        System.out.println(result);
    } else {
        System.out.println("Número inválido");
    }

    input.close();
    }
}
