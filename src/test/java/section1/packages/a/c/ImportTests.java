package section1.packages.a.c;

import java.lang.*; // Isso é redundante mas OK. Esse import é incluído por default pelo compilador

import section1.packages.a.c.ImportTests; // isso é redundante mas OK, o códigido irá compilar.

/*
Apesar de parecer hierárquico, uma classe que é membro do pacote a.b não é membro do pacote pai a.
 */
//import section1.packages.a.*; // Isso inclui classes contidas em a mas não em a.b.

/*
Isso não corrige o erro de importação, pois assim estamos importando os atributos e métodos, mas não a classe em si.
 */
import section1.packages.a.b.PackageTests.*;

/*
Usar wildcards em java não funciona.
 */
//import section1.packages.a.b.Package*;

/*
Import correto da classe.
 */
import section1.packages.a.b.PackageTests;

public class ImportTests {

    public static void main(String[] args) {
        System.out.println("Import Tests");

        // O import a.* não inclui a classe PackageTests, que está dentro de a.b.
        PackageTests.main(args); // compile error because wrong import of a.*;
    }

}
