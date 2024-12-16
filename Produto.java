abstract class Produto<T> {
    private String nome;
    protected T atributoEspecifico;

    public Produto(String nome, T atributoEspecifico) {
        this.nome = nome;
        this.atributoEspecifico = atributoEspecifico;
    }

    public String getNome() {
        return nome;
    }

    public T getAtributoEspecifico() {
        return atributoEspecifico;
    }
}
