import java.util.Scanner;

public class Adjacentes {
    Scanner input = new Scanner(System.in);

    void setList(){
        int[] list = new int[5];
        for(int i=0 ; i<5 ; i++){
            list[i] = input.nextInt();
        }

        for(int i=0 ; i<5 ; i++){
            for(int o =0; o< list[i]; o++){
                System.out.print("*");
            }
            System.out.print("\n");
        } 
    }
}
