package section1.packages.a.b;

/*
Alguns erros que você não pode cometer com pacotes e imports.
 */

/* isso é um erro de compilação e não é o mesmo que não declarar um pacote. Uma classe sem um pacote definido, faz
parte do pacote default.*/
//package; // compile error
//package default; // compile error

/*
O nome do pacote pode ser o mesmo nome da classe. O intellij reclama pois ele quer criar a mesma estrutura de pacotes
correspondentes aos diretórios, mas isso é algo totalmente válido. Porém é uma boa prática os pacotes corresponderem
a mesma estrutura dos diretórios.
 */
//package PackageTests; // valid
//package a.b; // valid

import org.junit.jupiter.api.Test;

public class PackageTests {

    @Test
    public void test() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        System.out.println("ok");
    }

}
