// INSTRUÇÃO SWITCH
package Default;

public class Programa06 {
    public static void main(String[] args) {
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("Número é 1");
                break;
            case 5:
                System.out.println("Número é 5");
                break;
            default:
                System.out.println("Número é " + num);
                break;
        }
    }
}
