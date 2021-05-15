package section3.datatypes;

import org.junit.jupiter.api.Test;

public class ClassVariables {

    // Valores static são inicializados com 0 para tipos primitivos numéricos
    static byte staticBarByte;
    static char staticBarChar;
    static short staticBarShort;
    static int staticBarInt;
    static long staticBarLong;
    static float staticBarFloat;
    static double staticBarDouble;

    // E false para boolean
    static boolean staticBarBoolean;

    // Para membros de classe não estáticos que são primitivos numéricos, o default também é 0 e false para boolean
    byte barByte;
    char barChar;
    short barShort;
    int barInt;
    long barLong;
    float barFloat;
    double barDouble;

    // E false para boolean
    boolean barBoolean;

    @Test
    public void bar() {
        ClassVariables bar = new ClassVariables();

        System.out.println("------- Class variables set to default values --------");
        System.out.println("Bar.staticByte = " + ClassVariables.staticBarByte);
        System.out.println("Bar.staticChar = " + ClassVariables.staticBarChar);
        System.out.println("Bar.staticShort = " + ClassVariables.staticBarShort);
        System.out.println("Bar.staticInt = " + ClassVariables.staticBarInt);
        System.out.println("Bar.staticLong = " + ClassVariables.staticBarLong);
        System.out.println("Bar.staticFloat = " + ClassVariables.staticBarFloat);
        System.out.println("Bar.staticDouble = " + ClassVariables.staticBarDouble);

        System.out.println("------- Instance variables set to default values --------");
        System.out.println("barByte = " + bar.barByte);
        System.out.println("barChar = " + bar.barChar);
        System.out.println("barShort = " + bar.barShort);
        System.out.println("barInt = " + bar.barInt);
        System.out.println("barLong = " + bar.barLong);
        System.out.println("barFloat = " + bar.barFloat);
        System.out.println("barDouble = " + bar.barDouble);
    }

}
