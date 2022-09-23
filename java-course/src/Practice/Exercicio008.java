package Practice;

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        float h;
        String sexo;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        h = Float.parseFloat(input.nextLine());

        System.out.println("Digite seu gênero (F = Femenino; M = Masculino)");
        sexo = input.nextLine();

        switch (sexo) {
            case "F":
                double result = (62.1 * h) - 44.7;
                System.out.println(result);
                break;
            case "M":
                result = (72.7 * h) - 58;
                System.out.println(result);
                break;
            default:
                break;
        }

        input.close();
    }
}
