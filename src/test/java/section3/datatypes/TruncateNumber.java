package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
Se fizer o casting para um valor com uma precisão menor, por exemplo, de float/double para short/int/long, ele vai
truncar o valor para um valor inteiro, ou seja, vamos perder a precisão (a parte decimal).
 */
public class TruncateNumber {
    @Test
    public void main() {
        // Ao fazer o casting para um tipo menos preciso, a parte decimal será truncada.
        float myFloat = 123.456f;
        Float myFloatWrapper = new Float(myFloat);
        int myNumber = (int) myFloat;

        // Casting with loss of precision..
        System.out.println("myNumber = " + myNumber);

        // We can get the same result using Float.intValue();
        System.out.println("Float.intValue() = " + myFloatWrapper.intValue());
    }
}
