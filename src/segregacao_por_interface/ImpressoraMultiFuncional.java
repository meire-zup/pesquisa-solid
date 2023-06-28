package segregacao_por_interface;

public class ImpressoraMultiFuncional implements Impressora, Scanner, MaquinaDeFax  {


    @Override
    public void print() {
        System.out.println("Função 1: imprimindo na impressora multifuncional!");
    }

    @Override
    public void scan() {
        System.out.println("Função 2: scaneando na impressora multifuncional!");

    }

    @Override
    public void enviaFax() {
        System.out.println("Função 3: enviando fax na impressora multifuncional!");
    }
}
