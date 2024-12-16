public class Program {
    public static void main(String[] args) {
        Inventario<Eletronico> invEletronico = new Inventario<>();
        Inventario<Roupa> invRoupa = new Inventario<>();
        Inventario<Alimento> invAlimento = new Inventario<>();

        // Adicionando produtos
        invEletronico.adicionarProduto(new Eletronico("Smartphone", new EletronicoInfo("Samsung", "Galaxy S20", 999.99)));
        invRoupa.adicionarProduto(new Roupa("Camiseta", new RoupaInfo("M", "Azul", "Algodão")));
        invAlimento.adicionarProduto(new Alimento("Leite", new AlimentoInfo("2024-12-23", 1.0, "Leite Pasteurizado")));

        // Consulta de produtos
        System.out.println("Produtos Eletrônicos:");
        for (Eletronico produto : invEletronico.listarProdutos()) {
            EletronicoInfo info = produto.getAtributoEspecifico();
            System.out.println(produto.getNome() + " - " + info.getMarca() + ", " + info.getModelo() + ", Preço: " + info.getPreco());
        }
        
        System.out.println("\nProdutos de Roupa:");
        for (Roupa produto : invRoupa.listarProdutos()) {
            RoupaInfo info = produto.getAtributoEspecifico();
            System.out.println(produto.getNome() + " - Tamanho: " + info.getTamanho() + ", Cor: " + info.getCor() + ", Material: " + info.getMaterial());
        }

        System.out.println("\nProdutos Alimentícios:");
        for (Alimento produto : invAlimento.listarProdutos()) {
            AlimentoInfo info = produto.getAtributoEspecifico();
            System.out.println(produto.getNome() + " - Data de Validade: " + info.getDataValidade() + ", Peso: " + info.getPeso() + "kg, Ingredientes: " + info.getIngredientes());
        }

    }
}