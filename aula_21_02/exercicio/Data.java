public class Data{
    private String ano, mes, dia;  

    void setAno(String ano){
        this.ano = ano; 
    }

    String getAno(){
        return this.ano;
    }

    void setMes(String mes){
        this.mes = mes; 
    }

    String getMes(){
        return this.mes;
    }

    void setDia(String dia){
        this.dia = dia; 
    }

    String getDia(){
        return this.dia;
    }

    void mostrarData(){
        System.out.println(this.dia + "/" +this.mes + "/"+this.ano);
    }

}