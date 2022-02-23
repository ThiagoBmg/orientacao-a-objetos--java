import java.util.Scanner;

public class Produtos {
    Scanner input = new Scanner(System.in);

    void mostrarProdutos(){
        for(int i=1; i<=5;i++){
            System.out.print("Produto "+ i + " Valor: "+ this.getValor(i)+"\n");
        }
    }

    void consultarValorPorQuantidade(){
        int produto, quantidade;
        System.out.print("Digite o valor do produto que deseja usar: ");
        produto = input.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = input.nextInt();
        double resultado =  getTotalPorQuantidade(produto, quantidade);
        System.out.print("Seu valor total é de: " + resultado);
    }

    double getTotalPorQuantidade(int produto, int quantidade){
        double valor = this.getValor(produto);
        double resultado = quantidade * valor;
        return resultado;
    }
    
    double getValor(int produto){
        double val;
        switch(produto){
            case 1:
                val = 2.98; 
                break;
            case 2:
                val = 4.50;
                break;
            case 3:
                val = 3.98;    
                break;
            case 4: 
                val = 4.49;    
                break;
            case 5:
                val = 6.87;    
                break;
            default: 
                val = 0; 
                break;
        }
        return val;
    }
}