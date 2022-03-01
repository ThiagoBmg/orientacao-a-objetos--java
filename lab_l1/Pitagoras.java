public class Pitagoras {
    void run(){
        for(int a = 1; a<=500 ; a++){
            for(int b = 1 ; b<= 500; b++){
              for (int c = 1; c<=500 ; c++){
                if ((a*a)+(b*b)==(c*c)){
                  System.out.printf("a = %d, b = %d, c =%d \n", a,b,c);
                }
              }
            }
          }
    }
}
