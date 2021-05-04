package section1.packages.a.d;

public class StaticImportTest1 {

    /*
    Variável estática
     */
    public static final String APP_NAME = "First";

    /*
    Método estático.
     */
    public static void log(String statement) {
        System.out.println("First Logging statement: " + statement);
    }

    /*
    Método público.
     */
    public void printUniqueStatement() {
        System.out.println("I am First");
    }

}
