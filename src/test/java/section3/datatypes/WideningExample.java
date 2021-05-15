package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
Atribuir um tipo de literal ou variável menor para outra de um tipo maior. (Alargar o valor).
Na maioria dos casos isso pode ser feito sem casting.
 */
public class WideningExample {

    @Test
    public void main() {

        // isso é um inteiro com valor 97
        char myChar = 'a';

        // isso é narrowing. 0 é um literal inteiro que é narrowed para byte.
        byte myByte = 0;
        short myShort;

        // Atribuindo os tipos literais exatos para cada tipo.
        int myInt = 0;
        float myFloat = 0.0f;
        double myDouble = 0.0;

        // Fazendo widening.
        // Faz o widening do int 0 para long.
        long myLong = 0;
        // Faz o widening de um literal float para um double.
        myDouble = 0.0f;

        // Since assignments are right to left..
        //      value in myByte is widened to short when assigned to myShort
        //      value in myShort is widened to int when assigned to myInt
        //      value in myInt is widened to long when assigned to myLong
        //      value in myLong is widened to float when assigned to myFloat
        //      value in myFloat is widened to double when assigned to myDouble;

        myDouble = myFloat = myLong = myInt = myShort = myByte;

        System.out.println("Happy Widening");


        myByte = 'a';  // literal char is widened to int then narrowed to byte so ok

        // The following conversions combine both widening and narrowing primitive conversions:
        // First, the byte is converted to an int via widening primitive conversion (§5.1.2),
        // and then the resulting int is converted to a char by narrowing primitive conversion (§5.1.3).
        // So... This does not work for variables, compiler does not have enough information to determine if the narrowing is ok.
//        myChar = myByte;

        // short and char are the same width but char is unsigned so conversion is not allowed
//        myShort = myChar;
//        myChar = myShort;

        System.out.println("myByte = " + myByte);

    }

}
