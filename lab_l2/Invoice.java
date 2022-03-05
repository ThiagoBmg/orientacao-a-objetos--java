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
        if(quantidade < 0){
            quantidade = 0;
        }
        this.quantidade = quantidade;
    }
    public double getPreco() {
        
        return preco;
    }
    public void setPreco(double preco) {
        if(preco < 0){
            preco = 0;
        }
        this.preco = preco;
    }

    public void mostrarDetalhes(){
        System.out.print("O produto "+this.descricao +" "+"com o valor "+ this.preco+" "+" e quantidade em estoque de "+ quantidade);
    }
}