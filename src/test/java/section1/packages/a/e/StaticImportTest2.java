package section1.packages.a.e;

public class StaticImportTest2 {
    /*
    Variável estática
     */
    public static final String APP_NAME = "Second";

    /*
    Método estático.
     */
    public static void log(String statement) {
        System.out.println("Second Logging statement: " + statement);
    }

    /*
    Método público.
     */
    public void printUniqueStatement() {
        System.out.println("I am Second");
    }

}
