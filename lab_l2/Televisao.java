public class Televisao {
    private String modelo;
    private float preco,tamanho; 
    private int volume,canal;
    private boolean ligada; 

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getTamanho() {
        return tamanho;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public boolean isLigada() {
        if(ligada){
            System.out.print("Sua tv esta ligada");
        }
        else{
            System.out.print("Sua tv esta desligada");
        }
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    void alteraVolume(int n){
        this.volume += n;
    }

    void alteraCanal(int n){
        this.canal += n;
    }
}
