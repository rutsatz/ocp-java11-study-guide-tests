package section1.packages.a;

/*
Importa a classe StaticImportTest1
 */
import section1.packages.a.d.StaticImportTest1;

/*
Importa os membros estáticos de StaticImportTest1.
 */
import static section1.packages.a.d.StaticImportTest1.*;

/*
Importa a classe StaticImportTest2.
 */
import section1.packages.a.e.StaticImportTest2;

// Vai dar erro, pois a variável APP_NAME e o método log já estão definidos pelo import estático acima.
//import static section1.packages.a.e.StaticImportTest2.*;

// Nesse caso não vai dar erro, mas ele vai resolver para o import mais específico, então o import static StaticImportTest1.*
// não vai importar a variável APP_NAME, pois ela está sendo sobrescrita por um import mais específico.
// E nesse caso, estamos importando somente a variável APP_NAME, e não a classe em si. Se eu remover o
// import a.e.StaticImportTest2, eu não vou conseguir instanciar new StaticImportTest2(), pois ela não vai estar definida.
import static section1.packages.a.e.StaticImportTest2.APP_NAME;

public class TestStatic {

    public static void main(String[] args) {

        /*
        APP_NAME pode ser usado sem referenciar o nome da classe por causa do import estático.
         */
        System.out.println("APP_NAME = " + APP_NAME);

        /*
        O método log pode ser usado sem referenciar a classe por causa do import estático
         */
        log("This is StaticImportTest");

        // Instânciamos StaticImportTest1 e executamos o método dele
        new StaticImportTest1().printUniqueStatement();

        // Variável estática agora acessando de forma qualified
        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);

        // Método log qualificado pelo nome da classe
        StaticImportTest2.log("This is StaticImportTest");

        // instânciamos StaticImportTest2 e executamos um método nele
        new StaticImportTest2().printUniqueStatement();
    }

}
