public class Retangulo {
    private int lado1, lado2; 
    void setLado1(int n){
        this.lado1 = n;
    }

    void setLado2(int n){
        this.lado2 = n;
    }

    int getLado1(){
        return this.lado1;
    }

    int getLado2(){
        return this.lado2;
    }

    int area(){
        return this.lado1 * this.lado2;
    }

    int perimetro(){
        return 2 * (this.lado1 + this.lado2);
    }
}

