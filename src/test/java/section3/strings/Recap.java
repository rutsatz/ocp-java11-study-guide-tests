package section3.strings;

/*
 */
public class Recap {

    public static void main(String[] args) {
        EqualLiteralReferences();
        StringConstructors();
        StringConstructorsInterned();
    }

    /*
    Strings inicializadas de forma literal, se comparadas com o ==, retornam true, pois são internalizadas e são uma
    instância única dentro do string pool.
     */
    public static void EqualLiteralReferences() {
        // String literals automatically interned so all "hello" literals
        // point to same reference in memory, in the string pool
        String s1 = "hello";

        String s2 = "hello";
        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

    }

    /*
    O mesmo não é válido quando a String é inicializada através do construtor, com a palavra new, pois as string não
    são internalizadas no pool de strings e temos dois objetos diferentes.
     */
    public static void StringConstructors() {
        String s1 = new String("hello");
        String s2 = new String("hello");

        // Now evaluates to false, strings do not point to same reference,
        // and are not stored in the string pool
        System.out.println("s1 and s2 are constructed String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

    /*
    Porém se criarmos com o construtor mas chamarmos o método intern, a string será internalizada
    e a refência será atualizada e passará a apontar para a mesma instância do do string pool e dessa forma
    a comparação com == passará a retornar true.
     */
    public static void StringConstructorsInterned() {
        //**** Add intern() method:  intern checks the string pool
        // and returns the string pool reference to s1.
        String s1 = new String("hello").intern();

        //**** Add intern() method: s2 also gets the string pool
        // reference for "hello"
        String s2 = new String("hello").intern();

        // Now evaluates to true
        System.out.println("s1 and s2 are interned String objects " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

}
