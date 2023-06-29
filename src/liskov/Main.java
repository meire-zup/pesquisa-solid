package liskov;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        Veiculo moto = new Moto();
        Carro carro = new Carro();

        veiculo.ligarMotor();
        moto.ligarMotor();
        carro.ligarMotor();
        carro.abrirPortaMalas();


    }
}
