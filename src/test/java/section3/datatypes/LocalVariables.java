package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
Uma variável local não é inicializada com um valor padrão.
    Você precisa inicializar completamente uma variável do tipo primitivo (não dentro de uma expressão condicional/if,
    etc) se estiver usando essa variável local em algum lugar no código (isso irá gerar um erro de compilação)
Se a variável local não for inicializada, mas também não for usada, isso não gerará erros.
 */
public class LocalVariables {

    @Test
    public void bar2() {

        // variáveis locais para todos os tipos primitivos (não inicializadas)
        byte mainByte;
        char mainChar;
        short mainShort;
        int mainInt;
        long mainLong;
        float mainFloat;
        double mainDouble;
        boolean mainBoolean;

        // Somente podemos usar nossas variáveis locais se elas forem inicializadas.
        mainByte = 0;
        mainChar = 'a';
        mainShort = 1;
        mainInt = 2;
        mainLong = 3L;
        mainFloat = 1.0f;
        mainDouble = 2.0d;
        mainBoolean = false;

        // Se tentarmos usar variáveis locais sem inicializa-las, isso será um erro de compilação.
        System.out.println("Local variables in the main method");
        System.out.println("------ São variáveis locais setadas para valores default? -------");
        System.out.println("mainByte = " + mainByte);
        System.out.println("mainChar = " + mainChar);
        System.out.println("mainShort = " + mainShort);
        System.out.println("mainInt = " + mainInt);
        System.out.println("mainLong = " + mainLong);
        System.out.println("mainFloat = " + mainFloat);
        System.out.println("mainDouble = " + mainDouble);
        System.out.println("mainBoolean = " + mainBoolean);
    }

    /*
    Também vai ser um erro de compilação de declararmos uma variável local porém fizermos uma inicialização parcial.
    Por exemplo: Inicializar dentro de um if sem else, um switch sem default, um loop while (o do while funcionaria,
    pois seria executado pelo menos uma vez.)
     */
    @Test
    public void fooBar() {

        int p; // p é uma variável local não inicializada

        boolean myBoolean = true;

        // erro de compilação, pois não satisfaz a condição de inicialização completa do compilador.
//        if (myBoolean) {
//            p = 1;
//        }

        // bloco de if/else satisfaz a verificação do compilador pelo inicialização completa
        if (myBoolean) {
            p = 1;
        } else {
            p = 2;
        }

        System.out.println("p is " + p);

        int q; // q é uma variável local não inicializada

        // Uma instrução if com um booleano estático satisfaz a verificação de inicialização completa do compilador
        // Isso pq a expressão do if é totalmente conhecida durante o tempo de compilação e por isso, isso é permitido.
        if (true) {
            q = 1;
        }

        System.out.println("q is " + q); // q foi totalmente inicializado


        // Um bloco switch com um bloco default satisfaz a verificação de inicialização completa do compilador
        int testInt = 5; // variável de teste para a expressão do switch
        int r; // r é a variável local não inicializada
        switch (testInt) {
            case 0:
            case 1:
            case 2:
                r = 1;
                break;
            case 3:
            case 4:
            case 5:
                r = 2;
                break;
            // Se comentar o default do switch, todos as possibilidades do switch não podem ser resolvidas pelo
            // compilador, então ele assume que a variável pode não ser inicializada e não podemos executar o código,
            // pois isso é um erro de compilação.
            default:
                r = 3;
        }
        System.out.println("r is " + r); // r é agora totalmente inicializado.


        // do while loop satisfaz completamente o compiler full initialization check
        int s, t = 0; // s é uma variável local não inicializada
        do {
            // Não é um erro de compilação, pois o bloco do é executado pelo menos uma vez
            s = t++;
        } while (t < 1);
        System.out.println("s is " + s);

        // while loop somente satisfaz completamente o compiler full initialization check se a condição for
        // staticly know (a expressão if for conhecida durante o tempo de compilação)
        // Podemos ter esse mesmo problema com os loops for
        int u, v = 0; // u é uma variável local não inicializada
        while (true) {
            // Não é um erro de compilação, pois o bloco do é executado pelo menos uma vez
            u = v++;
            break;
        }
        System.out.println("u is " + u); // u é agora completamente inicializado
    }

}
