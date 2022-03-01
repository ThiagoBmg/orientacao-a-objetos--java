import java.util.Scanner; 


public class Main{
    


    public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in);
        // EXERCICIO 1: 
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();

        System.out.print("Digite o valor do lado a do retangulo 1: ");
        ret1.setLado1(input.nextInt());
        System.out.print("Digite o valor do lado b do retangulo 1: ");
        ret1.setLado2(input.nextInt());
        System.out.print("Digite o valor do lado a do retangulo 2: ");
        ret2.setLado1(input.nextInt());
        System.out.print("Digite o valor do lado b do retangulo 2: ");
        ret2.setLado2(input.nextInt());
        
        System.out.print("\n");
 
        System.out.printf("O retangulo 1 com os lados a %d, e lado b %d\n", ret1.getLado1(), ret1.getLado2());
        System.out.printf("Tem a area igual a %d e o perimetro igual a %d", ret1.area(), ret1.perimetro());
        
        System.out.print("\n\n");
        System.out.printf("O retangulo 2 com os lados a %d, e lado b %d\n", ret2.getLado1(), ret2.getLado2());
        System.out.printf("Tem a area igual a %d e o perimetro igual a %d", ret2.area(), ret2.perimetro());

        // EXERCICIO 2:
    
        // EXERCICIO 3:
      
        // EXERCICIO 4:
        
        // EXERCICIO 5:
        
        // EXERCICIO 6:
    }
}