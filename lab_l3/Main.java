public class Main {
    public static void main(String[] arg){
        // Exercicio 1
        // No primeiro caso, o construtor deve receber 3 valores inteiros.
        Data op1 = new Data(11,02,30);
        op1.saida1();
        // No segundo caso deve receber uma String e dois valores inteiros
        Data op2 = new Data(02,"Março",30);
        op2.saida2();
        //  No terceiro caso deve receber dois valores inteiros, o primeiro sendo o número de dias no ano.
        Data op3 = new Data(123, 2000);
        op3.saida3();
    }
}
