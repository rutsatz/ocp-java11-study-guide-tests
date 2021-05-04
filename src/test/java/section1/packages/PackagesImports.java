package section1.packages;

import org.junit.jupiter.api.Test;

// single-static-import para uma variável estática
import static java.lang.Math.PI;

// single-static-import para um método estático
import static java.lang.Math.sqrt;

// static-import-on-demand para variáveis e métodos
//import static java.lang.Math.*;

public class PackagesImports {

    /*
    java.lang.{classname} é implicito quando utilizada qualquer classe do pacote java.lang. Exemplo: String.
    Os imports estáticos não importam classes, mas sim atributos ou métodos.

    Package deve ser a primeira instrução da classe, excluindo comentários. Ela pode ter 0 ou 1 declarações de package.
    Um pacote pode ter várias classes ou interfaces.

    Executando um arquivo .java
    java -cp out/production/GettingStarted garden.vegetable.VineVegetable
    O parâmetro de -cp é a pasta raiz, onde estão os pacotes da aplicação. Depois específicamos a classe que queremos
    executar passando o full qualified name.


    Compilando a classe
    javac -d build src/garden/vegetable/VineVegetable.java
    -d é o diretório onde os arquivos .class serão gerados. Nesse caso, a pasta build.
    depois passamos a classe que queremos compilar.
    Se não informar o -d, o .class será gerado no mesmo diretório que o arquivo .java.

    Referênciando tipos de outros pacotes
    FQCN - se tivermos duas classes com o mesmo nome, pelo menos uma dela deverá usar FQCN
    single-type-import - Se tivermos somente um tipo, podemos declarar no import.
    type-import-on-demand - exemplo: java.util.*; Essa forma é desencorajada, mas ainda é válida para a prova. Se usar
        essa forma para tudo, quem for ler meu código vai ficar perdido em qual dos pacotes a classe pertence. Usando
        o *, ele somente importa os membros do mesmo nível. Ele não importa membros de pacotes filhos. E isso também
        implica que não posso criar uma classe com esse mesmo nome dentro do arquivo, pois estou dizendo que
        quero usar a classe daquele pacote. Se por acaso eu mudar para o import-on-demand, eu posso criar a classe
        com o mesmo nome dentro do arquivo, pois a classe local vai ter a precedência.
    single-static-import - exemplo: import static java.lang.Math.PI; inclui uma referência ao nome do membro, sem
        precisar incluir uma referencia ao tipo declarado.
    static-import-on-demand - exemplo: import static java.lang.Math.*; importa TODOS os membros estáticos (variáveis
        e métodos) e referenciá-los sem precisar referenciar o tipo declarado.

     single-type-import tem precedência sobre o import-on-demand. Também não vai permitir criar uma classe com o mesmo
        nome da classe que está sendo importada (por exemplo, importo import static nursery.VineVegetable e dentro do
        mesmo arquivo tento declarar classe VineVegetable). Também vai prevenir você de criar uma referência
        ambígua (duas classes com nomes iguais mas em pacotes diferentes sendo importado na mesma classe).
     */

    @Test
    public void testImportStatic() {
        int radius = 2;

        // Podemos usar a variável estática da classe Math para obter o valor de PI.
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        // Podemos usar um método estático da classe Math para calcular a raiz quadrada de um número.
        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }

}
