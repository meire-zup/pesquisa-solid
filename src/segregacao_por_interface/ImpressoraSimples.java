package segregacao_por_interface;

public class ImpressoraSimples implements Impressora{
    @Override
    public void print() {
        System.out.println("Imprimindo documentos na impressora simples!");
    }
}
