package section3.strings;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Concatenation Operator
*/

/*
O resultado da concatenação retorna uma nova String que não está no string pool, pois não é uma string literal. Podemos
testar isso comparando o resultado do método: System.indentityHashCode() e comparar com as duas variáveis.
Então se comparar duas strings que foram concatenadas, e que apesar de terem os mesmos valores, elas são variáveis
diferentes. Então se compararmos elas com == o resultado será false.

O operador de + é o operador de concatenação. Se você estiver concatenando e tiver uma string, o restante dos objetos
da equacação são convertidos para string, inclusive se você concatenar null, ele irá gerar a string "null". Se você
concatenar uma string a uma variável de referência, se for uma variável de um tipo de referência (ex: Integer), então
o método .toString() é chamado. Se concatenar uma String com um tipo primitivo, então ele é boxed para o seu wrapper
correspondente e o método .toString() é executado.
Se você tiver uma classe e concatenar uma string a ela, o método toString() dessa classe será executado.
A concatenação somente entra em ação a partir do momento que tenho uma string. Então se tiver mais operações matemáticas
a esquerda, elas são calculadas normalmente. A partir do momento que tenho uma string, ele começa a concatenar e tudo
que estiver a direita será concatenado (mesmo que tenham mais números após a operação contendo a string).
 */
public class StringConcat {
    public static void main(String[] args) {
        String helloString = "hello";
        String worldString = "world";

        // firstString will be “hello world”, concats 3 literals..
        String firstString = helloString + " " + worldString;
        System.out.println("firstString = " + firstString);

        Object nullObject = null;
        // secondString will be “null hello"
        String secondString = nullObject + " " + helloString;
        System.out.println("secondString = " + secondString);

        int i = 10;
        // thirdString will be “10 hello"
        String thirdString = i + " " + helloString;
        System.out.println("thirdString = " + thirdString);

        // concatenating to an object (not null)
        Object ourObject = new OurSimpleClass();

        // fourthString will be "hello Our Simple Class"
        String fourthString = helloString + " " + ourObject;
        System.out.println("fourthString = " + fourthString);

        /*
        Nesse caso, a primeira operação de mais é calculada, pois temos duas valores inteiros e o operador de soma é
        calculado e resulta em 20 (10 + 10). Já no segundo operador +, o lado direito da operação é uma string (" = "),
        então a sobrecarga entra em ação e começa a concatenar tudo o que vier depois. Por isso, a segunda operação de +
        resulta em 1010, pois ele concatenou as duas strings 10.
         */
        int j = 10;
        String resultString = i + j + " = " + i + j;
        System.out.println("resultString is: " + resultString);

        /*
        Para evitar o efeito acima, é necessário adicionar parenteses na segunda operação de soma, para que ela seja
        executado com uma precedencia maior que a concatenação.
         */
        String resultStringCorrectedForIntegerMath = i + j + " = " + (i + j);
        String resultStringCorrectedForStringConcat = "" + i + j + " = " + i + j;
        System.out.println("resultStringCorrectedForIntegerMath is: " +
                resultStringCorrectedForIntegerMath);
        System.out.println("resultStringCorrectedForStringConcat is: " +
                resultStringCorrectedForStringConcat);
    }
}

class OurSimpleClass {
    public String toString() {
        return "Our Simple Class";
    }
}
