public class Funcionario {
    private String nome, sobrenome;
    private double salario_mensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        //Se o salário mensal não for positivo, conﬁgure-o como 0 (zero).
        if(salario_mensal<0){
            salario_mensal = 0; 
        }
        this.salario_mensal = salario_mensal;
    }

    public double getSalarioAnual(){
        return this.salario_mensal * 12; 
    }

    public double setNewSalario(){
        this.salario_mensal = this.salario_mensal * 1.10;
        return this.salario_mensal;
    }
}
