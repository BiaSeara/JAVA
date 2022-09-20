// FOREACH
package Default;

public class Programa10 {
    public static void main(String[] args) {
        String bts = "Magic Shop";

        // PARA CADA UM DOS CARACTERES DA STRING, IMPRIMA O CARACTERE 
        for (char letra : bts.toCharArray()) {
            System.out.print(letra);
            // System.out.println(letra);
        }
    }
}