import java.util.Scanner;

public class Abc {
    Scanner input = new Scanner(System.in);
    public void run(){
        double resultado = 0;
        double reajuste = 0;
        double porcentual = 0;
        this.mostrarSalarios();
        System.out.printf("Digite o seu salário: ");
        float valor = input.nextFloat();

        if (valor < 400){
            resultado = valor * 1.15;
            reajuste = valor * 0.15;
            porcentual = 15;
        }
        else if (valor > 400 && valor <= 800){
            resultado = valor * 1.12;
            reajuste = valor * 0.12;
            porcentual = 12;
        }
        else if (valor > 800 && valor <= 1200){
            resultado = valor * 1.10;
            reajuste = valor * 0.10;
            porcentual = 10;
        }
        else if (valor > 1200 && valor <= 2000){
            resultado = valor * 1.07;
            reajuste = valor * 0.07;
            porcentual = 7;
        }
        else if (valor > 2000){
            resultado = valor * 1.04;
            reajuste = valor * 0.04;
            porcentual = 4;
        }

        System.out.printf("O seu novo salário é de: %.2f\n", resultado);
        System.out.printf("O seu reajuste é de: %.2f\n", reajuste);
        System.out.printf("O seu porcentual de ganho é de: %.2f por cento\n", porcentual);
    }

    void mostrarSalarios(){
        System.out.printf("Quantidades: \n");
        System.out.printf("Salário 1 ($ 0 - 400.00) \n");
        System.out.printf("Salário 2 ($ 400.01 - 800.00) \n");
        System.out.printf("Salário 3 ($ $ 800.01 - 1200.00) \n");
        System.out.printf("Salário 4 ($ $ 1200.01 - 2000.00) \n");
        System.out.printf("Salário 5 ($ $ acima de 2000.00) \n");
    } 

}
