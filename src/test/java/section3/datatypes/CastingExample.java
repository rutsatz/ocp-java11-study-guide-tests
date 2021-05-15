package section3.datatypes;

import org.junit.jupiter.api.Test;

/*
Você pode forçar o narrowing ou widening se souber será uma operação segura pois conhecerá os valores que existirão
em tempo de execução. O widening é mais comum, pois é uma operação mais segura (não há perda de dados). Porém o narrowing
também é permitido, porém podem surgir resultados inesperados, como perda informações. Nesse caso, talvez seja melhor
criar um método separado, com o tipo especifico, para garantir que o valor correto caberá dentro desse tipo.
 */
public class CastingExample {

    @Test
    public void main() {

        // Set up some local variables.  Note that s2 is a short.
        short s2;
        int loopIterations = 0;

        // Forçamos o loop a ficar dentro dos limites de short.
        int minValue = Short.MIN_VALUE;  // our loop condition variable is an int, so this is widening
        int maxValue = Short.MAX_VALUE;

        // Ao simplesmente fazer essa alteração inocente (-1 e +1), temos uma saída inesperada. Temos uma iteração a mais e o
        // minValue tem o valor de Short.MAX_VALUE e o maxValue tem o valor de Short.MIN_VALUE. Porque isso aconteceu?
        // O problema com o casting é que se o seu valor não estiver dentro do range válido, os valores podem sofrer um
        // underflow ou overflow. Underflow é quando estamos definindo ou fazendo um casting para um valor menor que
        // o mínimo permitido para aquele tipo. Overflow é quando estamos definindo ou fazendo casting para um valor
        // maior que o máximo permitido para aquele tipo.
        // Nesse caso, o minValue recebeu o Short.MAX_VALUE porque quando ocorre o underflow, o bit de sinal é invertido,
        // ou seja, passou de menos para mais. E além disso, ele também faz o cálculo. Nesse caso foi somente 1.
        // Mas se colocar um valor maior, por exemplo 10, ele vai inverter o sinal e fazer a operação. No caso do 10,
        // ele iria inverter o sinal e somar/subtrair 9.
//        minValue = Short.MIN_VALUE - 1;
//        maxValue = Short.MAX_VALUE + 10;

        // We are forcing the for loop to stay in the valid range of a short
        for (int i = minValue; i <= maxValue; i++) {

            // We know because of the way we've written the code that i will never be outside
            // the range of a short, so we confidently cast i to s2 as a short.
            s2 = (short) i;  // we cast an int to a short

            // We'll print stuff out at the first and last increment of loop.
            if (i == minValue) System.out.println("Minimum Short value = " + s2);
            if (i == maxValue) System.out.println("Maximum Short value = " + s2);

            // We need to pass a short to the method we've created
            // so we pass s2, not our loop variable i.
            callAMethodWithParameter((loopIterations + 1), s2);
            loopIterations++;
        }
        System.out.println("loopIterations = " + loopIterations);
    }

    private static void callAMethodWithParameter(int i, short s) {
        // Do something here with your short that you would not do with an int or long for example

        // Really only want this to print once, though it's called in a loop...
        if (s == Short.MAX_VALUE) System.out.println("Iteration " + i + " had the max value, my type is short");
    }
}
