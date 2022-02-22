import java.util.Scanner;

public class Main{

    private static void print(String text){
        System.out.print(text+"\n");
    }

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Scanner input = new Scanner(System.in);
        
        // modo errado: 
        // pessoa.nome = "Thiago";
        // pessoa.cpf = "12345";
        // pessoa.idade = 21;

        // modo correto: 
        print("Digite um nome");
        pessoa.setNome(input.nextLine());
        print("Digite um cpf válido");
        pessoa.setCpf(input.nextLine());
        print("Digite a sua idade");
        pessoa.setIdade(Integer.parseInt(input.nextLine()));
        
        pessoa.digaOi();
        pessoa.apresentacao();
        pessoa.despedida();

        //print(pessoa.getCpf());   
    }

}