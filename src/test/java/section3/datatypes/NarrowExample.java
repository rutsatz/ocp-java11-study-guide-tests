package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
Atribuir um tipo de literal ou variável para outra variável com um tipo menor (fazer o estreitamento do valor).
 */
public class NarrowExample {

    @Test
    public void main() {

        // Imprimir os valores mínimos e máximos para cada tipo.
        System.out.println("A byte has range of " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // ranges dos caracteres em unicode e int
        System.out.println("A char has range of " + String.format("\\u%04x to \\u%04x", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE));
        System.out.println("A char has range of " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("A short has range of " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("An int has range of " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("A long has range of " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("A float has range of " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("A double has range of " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // O int literal é um inteiro de 32 bits
        // Os valores menores que int são byte, char, short. Assim, cada literal abaixo é um inteiro de 32 bits.
        // Mas nesse caso, como os valores de cada tipo estão dentro do seu limite máximo de range do tipo que está
        // sendo atribuido, o compilador não tem problemas com essa atribuição. Dessa forma, é feito o downcast para
        // o tipo específico da atribuição.
        byte b = 127;
        char c = 65535;
        short s = 32767;

        // Agora, se o valor exceder o limite do tipo a receber a atribuição, isso causará um erro de compilação, pois
        // o compilador sabe que haverá perda de informação e não permite essa atribuição. Nesse caso, você deve fazer
        // um downcasting de forma explicita, e você deve ter consciência que estará perdendo dados.
//        byte b1 = 128;
//        char c1 = 65536;
//        short s1 = 32768;

        // Cada literal numérico que contém um decimal, é por default, um double. E diferente das conversões de tipos
        // inteiros, a conversão narrowing de um valor decimal sempre requer o casting de forma explicita.
        // Exemplo: O zero certamente está dentro dos ranges de todos os tipos, mas mesmo assim, nenhuma das linhas abaixo
        // compila. Isso confirma que literais com ponto flutuante sempre são double.
//        float f2 = 0.0;
//        byte b2 = 0.0;
//        char c2 = 0.0;
//        short s2 = 0.0;
//        int i2 = 0.0;
//        long l2 = 0.0;

        // Depois dos literais, exemplos de narrowing para outros tipos de variáveis.
        // Criamos uma variável do tipo int com o valor 1, que nesse caso, deve caber dentro dos tipos menores byte,
        // char e short (contanto que não ultrapasse o limite máximo de cada tipo).
        // Mas nesse caso, como estamos atribuindo o literal 1 a uma variável e dai atribuindo a variável aos tipos,
        // ele vai dar um erro de compilação, pois o compilador não executa o código, então ele não sabe que nós
        // colocamos o valor 1 dentro dessa variável. (Se usar o literal 1 direto, ai funcionaria).
        int myVariable = 1;

//        byte b2 = myVariable;
//        char c2 = myVariable;
//        short s2 = myVariable;
    }

}
