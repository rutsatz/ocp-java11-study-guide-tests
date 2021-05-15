package section3.datatypes;

import org.junit.jupiter.api.Test;

public class BinaryExample {

    @Test
    public void main() {
        //  8-bit 'byte' values:
        byte byte1 = (byte) 0b01111111;  // 127
        byte byte2 = (byte) 0b10000000;  // -128
        byte byte3 = (byte) 0b00100001; // 33

        // A 16-bit 'short' value:
        short short1 = (short) 0b10100001_01000101; // -24251

        // Some 32-bit 'int' values:
        int int1 = 0b10100001_01000101_10100001_01000101;  // -1589272251
        // The B in literal can be upper/lower case.
        int int2 = 0b101; // 5
        int int3 = 0B101;  //5
        // E você não precisa passar os 32 bits se estive declarando o valor em binário. Se você passar um valor menor,
        // como no exemplo acima, ele vai inferir os bits da esquerda como 0.
        int int4 = 0B00000000_00000000_00000000_00000101; // 5
        // A 64-bit 'long' value. Note the "L" suffix:
        // -6825872339779608251
        // Nesse caso, o L é necessário pois o valor em binário extrapola o limite de int (pois todos os literais
        // numéricos inteiros são tratados como int por default).
        long long1 = 0b1010000101000101101000010100010110100001010001011010000101000101L;
        // 5
        // Nesse caso não precisou colocar o L pois o valor cabe dentro de um int.
        long long2 = 0b0000000_000000000_00000000_00000000_00000000_00000000_00000000_00000101;

        System.out.println("byte1=" + byte1);
        System.out.println("byte2=" + byte2);
        System.out.println("byte3=" + byte3);

        System.out.println("short1=" + short1);

        System.out.println("int1=" + int1);
        System.out.println("int2=" + int2);
        System.out.println("int3=" + int3);
        System.out.println("int4=" + int3);

        System.out.println("long1=" + long1);
        System.out.println("long2=" + long2);

    }

    static int i;
    public static void main(String[] args) {

        int i, j=0, k= 10; // Line 1
        i = BinaryExample.i+k; // Line 2
        k = i+++k;  // Line 3
        BinaryExample.i = j+i; // Line 4
        System.out.println(i+" " +k);
    }

}
