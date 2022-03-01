import java.util.Scanner;

public class Fliper {
    Scanner input = new Scanner(System.in);
    int portaR, portaP; 

    public void run(){
        this.serPortaP();
        int p = this.getPortaP();

        if (p == 0){
          System.out.printf("Saída C");
        }
        else{        
            this.serPortaR();
            int r = this.getPortaR();
            if(r == 1){
            System.out.printf("Saída A");
            }
          else{
            System.out.printf("Saída B");
          }
        }     
    }

    void serPortaP(){
        System.out.printf("Digite 0 ou 1 para a porta P: ");
        int p = input.nextInt();
        this.portaP = p;
    }

    int getPortaP(){
        return this.portaP;
    }

    void serPortaR(){
        System.out.printf("Digite 0 ou 1 para a porta R: ");
        int p = input.nextInt();
        this.portaR = p;
    }

    int getPortaR(){
        return this.portaR;
    }
}
