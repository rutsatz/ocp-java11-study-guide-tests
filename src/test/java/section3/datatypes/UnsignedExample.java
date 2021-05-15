package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
Nós podemos fazer o casting de variáveis, mas como elas são salvas como complemento de 2, e o último bit é para o
sinal, ela pode sofrer um overflow ou underflow do valor. Existe uma feature do Java 8 que tem suporte para unsigned int
e unsigned long.
 */
public class UnsignedExample {

    @Test
    public void main() {

        System.out.println("An int has a range of " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // we are going to purposely overflow our variable in testInt.
        // Our value is Integer.MAX_VALUE+3;
        int testInt = (int) (Integer.MAX_VALUE + 3);  // integer overflows by 3
        System.out.println("Casting to an int, value  = " + testInt);

        // Let's set the value to a long, which will represent our number
        // without overflowing
        long l = (long) Integer.MAX_VALUE + 3;
        System.out.println("What we expected (Integer.MAX_VALUE + 3) to equal " +
                " by widening to long = " + l);

        // As of Java 8, you can evaluate the number as an unsigned int...
        String sInt = Integer.toUnsignedString(testInt);
        System.out.println("Integer.toUnsignedString value = " + sInt);

        // We can also take the same number, wrapped in a String,
        // and pass it to the Integer.parseUnsignedInt value
        int vInt = Integer.parseUnsignedInt(new String("" + ((long) (Integer.MAX_VALUE) + 3)));
        System.out.println("Integer.parseUnsignedInt value = " + vInt); // -1
    }

}
