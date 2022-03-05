public class Invoice {
    String identiﬁcador, descricao;
    int quantidade;
    double preco;
    
    public String getIdentiﬁcador() {
        return identiﬁcador;
    }
    public void setIdentiﬁcador(String identiﬁcador) {
        this.identiﬁcador = identiﬁcador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}