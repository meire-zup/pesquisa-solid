package responsabilidade_unica;

public class Main {

    public static void main(String[] args) {

       Calculadora calculadora = new Calculadora();

       PrintResultado printResultado = new PrintResultado();


       printResultado.resultadoOperacao(calculadora.somaNumeros(4,6));


    }
}
