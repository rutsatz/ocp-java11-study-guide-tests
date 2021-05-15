package section3.scopes;

public class NestedScope {

    public static void main(String[] args) {
        // local variable i declared and initialized
        int i = 10;
        // Criamos uma nova classe interna dentro do método main.
        // Uma classe definida de forma local tem um qualifier implicado aplicado para qualquer atributo ou método
        // da classe externa (classe pai). Então podemos acessar suas variáveis e métodos.
        class locallyDefinedClass {
            // Colocado esse { aqui, pq isso defini um código de instância da classe, nesse caso, essa classe interna.
            // O código de instância da classe é executado quando uma nova instância da classe é criada. Se remover
            // esse { e }, o código abaixo não será executado na hora de criar a nova instância.
            {
                // i from method scope still visible in nested local class
                System.out.println("value of i BEFORE LOOP  " + i);
                System.out.println("---------------");

                // Because this for loop is within a local class,this is valid
                for (int i = 0; i < 5; i++) {
                    System.out.println("value of i during FIRST loop " + i);
                }
                System.out.println("---------------");

                // the local variable i from previous loop has gone out of scope
                // so it is ok to create another local variable in the second loop
                // declaration of the same name.
                for (int i = 5; i > 0; i--) {
                    System.out.println("value of i during SECOND loop " + i);
                }
                System.out.println("---------------");

                //  assign local loop variable j to local variable i from the
                // surrounding method of the nested class,
                for (int j = i; j < 15; j++) {
                    System.out.println("value of i,j during THIRD loop " + i + "," + j);
                }
                System.out.println("value of i AFTER LOOP  " + i);
            }
        }
        System.out.println("value of i before local class instantiated " + i);
        new locallyDefinedClass();
        System.out.println("value of i after local class instantiated " + i);
    }

}
