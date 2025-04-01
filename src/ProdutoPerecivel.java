public class ProdutoPerecivel extends Produto {

    private String validade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;

    }

    @Override
    public String toString() {
        return super.toString() + "| Data de Validade: " + validade;
    }

}