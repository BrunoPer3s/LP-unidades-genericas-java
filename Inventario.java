import java.util.ArrayList;
import java.util.List;

class Inventario<T extends Produto<?>> {
    private List<T> produtos = new ArrayList<>();

    public void adicionarProduto(T produto) {
        produtos.add(produto);
    }

    public List<T> listarProdutos() {
        return new ArrayList<>(produtos);
    }
}