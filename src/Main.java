import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto ("Detergente", 10, 60);
        Produto produto2 = new Produto("Creme Dental", 5, 50);
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Queijo", 60, 1, "20/04/2025");

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Primeiro produto da lista: " + listaDeProdutos.get(0).getNome());

        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }


    }
}