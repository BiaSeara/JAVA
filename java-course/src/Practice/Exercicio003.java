package Practice;

public class Exercicio003 {
    public static void main(String[] args) {
        double num = 3.0;
         if (num % 2 == 0) {
            double result = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é " + result);
         } else {
            double result = Math.pow(num, 2);
            System.out.println("A potência de " + num + " é " + result);
         }
    }
}
