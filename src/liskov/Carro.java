package liskov;

public class Carro extends Veiculo{

    @Override
    public void ligarMotor() {
        System.out.println("O motor do carro está ligado!");
    }

    public void abrirPortaMalas() {

        System.out.println("O porta malas do carro está aberto!");

    }
}
