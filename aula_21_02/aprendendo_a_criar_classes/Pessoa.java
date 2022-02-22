// para cada atribuo de uma classe é recomendado criar dois metodos 
// o setAtributo para definir um valor para o atributo 
// o getAtributo para buscar o valor de um determinado atributo

// o motivo disso é podermos controlar o valor que esta sendo atribuido para o parametro em questão
// por exemplo, validar um input para o cpf
// -> ver se o cpf tem 8 caracteres, caso não, definir um padrão 

public class Pessoa{
    // Atributos
    private String nome, cpf;
    private int idade; 

    // Métodos:
    void setNome(String n){
        this.nome = n; 
    }

    String getNome(){
        return this.nome; 
    }

    void setCpf(String n){
        if(n.length() < 8){
            this.cpf = "INVALID CPF";
        }
        else{
            this.cpf = n; 
        }
    }

    String getCpf(){
        return this.cpf; 
    }

    void setIdade(int n){
        if(n<0){
            this.idade = 0;
        }
        else{

            this.idade = n;
        }
    }

    int getIdade(){
        return this.idade; 
    }

    void digaOi(){
        System.out.print("Oi, é um prazer falar com você! \n");
    }

    void apresentacao(){
        System.out.print("Meu nome é "+ this.nome + "\n");
    }

    void despedida(){
        System.out.print("Ate logo! \n");
    }   
}