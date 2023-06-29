package liskov;

public class Moto extends Veiculo{

    @Override
    public void ligarMotor() {

        System.out.println("O motor da moto está ligado!");

    }

    public void ajustarSuspensao() {

        System.out.println("A suspensão da moto está sendo ajustada!");

    }
}
