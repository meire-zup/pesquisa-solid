package inversao_de_dependenccia;

public class Nuvem implements DispositivoDeArmazenamento {

    @Override
    public void salvarDados() {
        System.out.println("Salvando os dados na nuvem!");
    }
}
