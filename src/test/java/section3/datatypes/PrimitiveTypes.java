package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
O Java suporta tipos de dados e tipos de dados primitivos.
O valor de um tipo primitivo é salvo na memória e não é uma referência ao dado.
Isso faz com que acessar dados primitivos seja muito mais rápido e leva a melhor performance quando isso é importante.
    Como os tipos primitivos não herdam da classe Object (ao contrário de C#), Java não é considerada uma linguagem
orientada a objetos pura.
 */
public class PrimitiveTypes {

    @Test
    public void foo() {

        /*
        Um inteiro literal é considerado um int de 32 bits.
        Um valor decimal literal é considerado um double de 64 bits.
         */

        // 8 tipos de variáveis primitivas do java
        boolean myBoolean;
        byte myByte;

        // Podemos declarar várias variáveis do mesmo tipo na mesma linha. Não podemos fazer isso com tipos diferentes.
        // (a não ser que separe as declarações com ;.)
        char myFirstChar, mySecondChar;
        short myShort;
        int myInt;
        long myLong;
        float myFloat;
        double myFirstDouble, mySecondDouble;

    }

    @Test
    public void foo2() {

        // Vote pode setar todos os tipos primitivos com números literais de 0 a 127 (exceto boolean).
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;

        // Boolean somente pode ser atribuido true ou false.
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);

        // usando sufixo para especificar o tipo
        long l2 = 127l;
        long l3 = 127L;
        System.out.println("l2 = " + l2);
        System.out.println("l3 = " + l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        double d2 = 127d;
        double d3 = 127D;
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // Usando a forma exponencial literal
        float f4 = 1.27e02f;
        double d4 = 1.27e02;
        System.out.println("f4 = " + f4);
        System.out.println("d4 = " + d4);

        // literal binário 127 (binário usa prefixo 0b)
        byte b4 = 0b1111111;
        System.out.println("b4 = " + b4);

        // literal octal 127 (octal usa prefixo 0)
        short s4 = 0177;
        System.out.println("s4 = " + s4);

        // literal hexadecimal 127 (hexadecimal usa prefixo 0x)
        int i4 = 0x007F;
        System.out.println("i4 = " + i4);

        // literal char
        byte b5 = 'a';
        char c5 = 'a';
        double d5 = 'a';

        System.out.println("b5 = " + b5);
        System.out.println("c5 = " + c5);
        System.out.println("d5 = " + d5);

        // Podemos usar unicode para qualquer valor numérico (usa o prefixo \\u)
        byte b6 = '\u007F';
        char c6 = '\u007F';

        System.out.println("b6 = " + b6);
        System.out.println("c6 = " + c6);


        // podemos usar _ em valores numéricos, desde que não sejam o primeiro e nem o último caracter.
        byte b7 = 0b0000_0001;
        char c7 = 0x0_07F;
        short s7 = 011_11;
        int i7 = 1_000_000;
        long l7 = 1_000_000L;
        float f7 = 1_000.000_000F;
        double d7 = 1.000_0000e10;

        System.out.println("b7 = " + b7);
        System.out.println("c7 = " + c7);
        System.out.println("s7 = " + s7);
        System.out.println("i7 = " + i7);
        System.out.println("l7 = " + l7);
        System.out.println("f7 = " + f7);
        System.out.println("d7 = " + d7);

        // Literals que não são válidos, com _ no inicio ou fim de literals e dos sufixos
        /*
        byte b8 = 0b_0000001; // Não pode ter um _ logo depois de 0b
        char c8 = 0x_007F; // Não pode ter um _ logo depois de 0x
        int i8 = 1000000_; // _ não pode ser no fim do literal
        long l8 = 1000000_L; // _ não pode ser antes do sufixo (L/F,D) ou (l/f/d)
        float f8 = _1000.000000; // _ não pode ser no inicio de um literal
        double d8 = 1.000000_e10; // _ não pode vir antes do exponencial
        */


        // primitivos não podem ser nulos
        /*
        byte b9 = null;
        char c9 = null;
        short s9 = null;
        int i9 = null;
        long l9 = null;
        float f9 = null;
        double d9 = null;
        */


        // boolean não pode ser nulo e nem setado com 0 ou 1
        /*
        boolean aBoolean = 0;
        boolean bBoolean = null;
        */
    }

}
