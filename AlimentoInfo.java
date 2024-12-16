class AlimentoInfo {
    private String dataValidade;
    private double peso;
    private String ingredientes;

    public AlimentoInfo(String dataValidade, double peso, String ingredientes) {
        this.dataValidade = dataValidade;
        this.peso = peso;
        this.ingredientes = ingredientes;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public double getPeso() {
        return peso;
    }

    public String getIngredientes() {
        return ingredientes;
    }
}