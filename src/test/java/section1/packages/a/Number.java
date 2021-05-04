package section1.packages.a;

/*
É OK criar uma classe que existe em java.lang. Pacotes em java não podem conter palavras reservadas.
import example.another.package.ThisClass; irá gerar um erro de compilação, pois package é uma palavra reservada.
 */

/*
Esse import do pacote java.lang é desnescessário. E agora, também é um problema, pois causa um erro de compilação, pois
Number agora é uma entidade declarada e não podemos criar outra definição de Number.
Isso acontece, pois o compilador avalia o arquivo de cima para baixa, e quando ele encontra o import de Number, ele
registra como uma classe. Quando ele processa public class Number {, ele verifica que Number já é uma classe registrada.
 */
//import java.lang.Number;

public class Number {

    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor for java.lang.Number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Constructor for a.Number");
    }

    public static void main(String[] args) {
        // o construtor int 10 foi fornecido e foi feito um outboxing para java.lang.Number. Por isso, é
        // executado o primeiro construtor nesse caso.
        Number n = new Number(10);

        // Como n é uma instância de a.Number, o segundo construtor é executado.
        // O tipo é definido em tempo de compilação.
        // então para n, referencia java.lang.Number e o objeto new Number(10)
        // então em tempo de compilação, é isso que acontece: Number n2 = new Number(Number);
        Number n2 = new Number(n);
    }

}
