package segregacao_por_interface;

public class Main {
    public static void main(String[] args) {

        ImpressoraSimples impressoraSimples = new ImpressoraSimples();
        impressoraSimples.print();

        ImpressoraMultiFuncional impressoraMultiFuncional = new ImpressoraMultiFuncional();
        impressoraMultiFuncional.enviaFax();


    }
}
