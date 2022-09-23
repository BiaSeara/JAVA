// TIPOS DE DADOS
// NÚMERICOS (INTEIROS)
package Default;

public class Programa11 {
    public static void main(String[] args) {
        // TIPOS PRIMÁRIOS || PRIMINITOVOS
        //quanto maior, mais espaço
        int num1 = 4; //inteiro
        short num2 = 2; //inteiro (curto/menor/baixo)
        byte num3 = -5; 

        // TIPOS NÃO PRIMÁRIOS || NÃO PRIMITIVOS
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = -9;

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

        System.out.println("int/Integer " + Integer.SIZE + " bits");
        System.out.println("short/Short " + Short.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
    }
}