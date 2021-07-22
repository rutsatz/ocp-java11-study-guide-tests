package section3.strings;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Strings and the Compound Concatenation Operator
*/

/*
Operação de +=, uma variação do operado +.
Tem o mesmo comportamento que o +.
Se o lado esquerdo da operação não for uma string, o objeto da esquerda é convertido para string e depois concatenado.
Por exemplo:
    compoundString4 += someOtherObject;

Pode ser pensado como:
    compoundString4 = compoundString4 + someOtherObject;
    compoundString4 = "object " + someOtherObject;
    compoundString4 = "object " + ImmutableString@4cb2c100;



 */
public class StringCompoundConcat {
    public static void main(String[] args) {

        String helloString = "hello";
        String worldString = " world";

        // Use the compound concatenator on string literals
        String compoundString = "hello";
        compoundString += " world";
        System.out.println("compoundString = " + compoundString);

        // Use the compound concatenator on String objects
        String compoundString2 = helloString;
        compoundString2 += worldString;
        System.out.println("compoundString2 = " + compoundString2);

        // Use a null String on the left
        String nullString = null;
        nullString += helloString;
        System.out.println("nullString = " + nullString);

        // Use a null String on the right...
        nullString = null;
        String compoundStringWithNull = helloString;
        compoundStringWithNull += nullString;
        System.out.println("compoundStringWithNull = " + compoundStringWithNull);

        // String concatenation when right hand object is not a String, but is a CharSequence
        Object charSequenceObject = new StringBuilder("testing");
        String compoundString3 = "charSequenceObject ";
        compoundString3 += charSequenceObject;
        System.out.println("compoundString3 = " + compoundString3);

        // String concatenation when left hand object is not a String, but is a CharSequence
        charSequenceObject = new StringBuilder("testing");
        charSequenceObject += helloString;
        System.out.println("charSequenceObject = " + charSequenceObject);

        /*
        Nesse casos em que temos a concatenação de objetos, eles são convertidos para string e depois concatenados.
         */

        // String concatenation when right hand object is not a String,
        // or CharSequence.  We created ImmutableString class in the last topic.
        Object someOtherObject = new ImmutableString();
        String compoundString4 = "object ";
        compoundString4 += someOtherObject;
        System.out.println("compoundString4 = " + compoundString4);

        /*
        Mesmo que o lado esquerdo não seja string, ele é convertido para string e depois concatenado com o lado direito.
         */

        // String concatenation when left hand object is not a String
        // We created ImmutableString class in the last topic.
        someOtherObject = new ImmutableString();
        someOtherObject += helloString;
        System.out.println("someOtherObject = " + someOtherObject);
        System.out.println("someOtherObject.toString() = " +
                someOtherObject.toString());

        int anInt = 100;

        // Valid...
        String compoundString5 = helloString;
        compoundString5 += anInt;
        System.out.println("compoundString5 = " + compoundString5);

        /*
        Não podemos ter tipos primitivos no lado esquerdo.
        Sobre operações matemáticas, vale a mesma regra do + sozinho. É avaliado da esquerda para a direita e assim
        que encontra uma string, ele começa a concatenar ao invés de somar.
         */

        // Invalid...
//        anInt += helloString;
//        System.out.println("anInt = " + anInt);
        String mathString1 = "The value is ";
        mathString1 += 5 + 7;
        System.out.println("mathString1 = " + mathString1);

        // Now we'll replace the compound concatenation operator with the
        // code it represents, we think...
        String mathString2 = "The value is ";
        mathString2 = mathString2 + 5 + 7;
        System.out.println("mathString2 =" + mathString2);

        // Adding parentheses when expanding out the compound concatenation
        // operator fixes the issue, so the right hand operand of the compound
        // concatenation operator is wrapped with an implied parentheses set
        String mathString3 = "The value is ";
        mathString3 = mathString3 + (5 + 7);
        System.out.println("mathString3 =" + mathString3);

    }
}