package section3.lvti;

/*
Local Variable Type Inference é um recurso introduzido no java 10 para diminuir a verbosidade do código. Ele introduziu
a nova palavra var. O var somente pode ser usado em váriáveis locais dentro do corpo de um método.
Mas o var não é um tipo. O compilador precisa conseguir inferir o tipo de dado que está sendo usado.
O var não é uma palavra reservada, ou seja, podemos usar o var como um identificador válido.
Também podemos usar o var para expressões lambda e em loops de for. Podemos usar ele como nome de variáveis (lembre, ele
não é uma palavra reservada), e também podemos criar métodos que se chame var.
Porém ele não pode ser usado para declarar variáveis de instância, variáveis estáticas, retornos de métodos, parâmetros
de métodos ou construtores.
 */
public class AClassWithAVeryLongName {

    String name;

    public AClassWithAVeryLongName() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "AClassWithAVeryLongName{" +
                "name='" + name + '\'' +
                '}';
    }
}
