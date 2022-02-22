public class Quadrado{
    // Faça um programa que solicita para o usuário inserir o tamanho do lado de
    // um quadrado e, então, exibe um quadrado vazio desse tamanho com
    // asteriscos nas bordas. Seu programa deve trabalhar com quadrados de
    // todos os comprimentos de lado possíveis entre 1 e 20. 
    private int qtd_lados;

    void print(String text){
        System.out.print(text);
    }

    void pularLinha(){
        print("\n");
    }

    void setQuantidadeDeLados(int n){
        if(n<0 || n>20){
            n = 1;
            this.print("O tamanho de lado escolhido é indisponível, escolha um número inteiro entre 1 e 20");
            this.pularLinha();
        }
        this.qtd_lados = n; 
    }

    void mostrarQuadrado(){
        for(int i=0;i<this.qtd_lados;i++){
            if(i==0 || i==this.qtd_lados-1){
                for(int o=0; o<this.qtd_lados; o++){
                    print("*");
                }
                pularLinha();   
            }
            else{
                for(int l=0; l<qtd_lados; l++){
                    if(l==0||l==qtd_lados-1){
                        print("*");
                    }
                    else{
                        print(" ");
                    }
                }
                pularLinha();   
            }
        }
    }
}