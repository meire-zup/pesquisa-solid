package inversao_de_dependenccia;

public class PenDrive implements DispositivoDeArmazenamento{
    @Override
    public void salvarDados() {
        System.out.println("Salvando os dados em um pen drive!");
    }
}
