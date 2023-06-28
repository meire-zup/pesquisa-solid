package inversao_de_dependenccia;

public class ProcessadorService {

    private DispositivoDeArmazenamento dispositivoDeArmazenamento;

    public void salvandoDados(DispositivoDeArmazenamento dispositivoDeArmazenamento) {
        System.out.println("PREPARANDO PARA SALVAR DADOS!");
        dispositivoDeArmazenamento.salvarDados();

    }

}
