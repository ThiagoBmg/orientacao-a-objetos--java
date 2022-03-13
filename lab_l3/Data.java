import java.util.Dictionary;
import java.util.Hashtable;

public class Data {
    private int day, month_int, year, ddd;
    private String month_string;
    private Dictionary months_dict = createStaticDictionary();
   
    private Dictionary createStaticDictionary(){
        // essa função é responsável por gerar um dicionário com os meses do ano
        Dictionary<String, Integer> months = new Hashtable<>();
        months.put("Janeiro", 1);
        months.put("Fevereiro", 2);
        months.put("Março", 3);
        months.put("Abril", 4);
        months.put("Maio", 5);
        months.put("Junho", 6);
        months.put("Julho", 7);
        months.put("Agosto", 8);
        months.put("Setembro", 9);
        months.put("Outubro", 10);
        months.put("Novembro", 11);
        months.put("Dezembro", 12);
        return months;
    }

    public Data(int day, int month, int year){
        this.setDay(day);
        this.setMonth_int(month);
        this.setYear(year);
        this.createStaticDictionary();
    }

    public Data(int day, String month, int year){
        this.setDay(day);
        this.setMonth_string(month);
        this.setYear(year);
        this.createStaticDictionary();
    }

    public Data(int year, int ddd){
        this.setDdd(ddd);
        this.setYear(year);
        this.createStaticDictionary();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth_int() {
        return month_int;
    }

    public void setMonth_int(int month_int) {
        this.month_int = month_int;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getMonth_string() {
        return month_string;
    }

    public void setMonth_string(String month_string) {
        this.month_string = month_string;
    }

    void saida1(){
        // essa função é responsável por gerar o seguinte formato de data:
        // MM/DD/YYYY
        System.out.print(this.getMonth_int()+"/"+this.getDay()+"/"+this.getYear());
        System.out.println();
    }
    
    void saida2(){
        // essa função é responsável por gerar o seguinte formato de data:
        // Março 02, 2019
        System.out.print(this.getMonth_string()+" "+this.getDay()+" "+this.getYear());
        System.out.println();

    }
    
    void saida3(){
        // essa função é responsável por gerar o seguinte formato de data:
        // DDD YYYY
        System.out.print(this.getDdd()+" "+this.getYear());
        System.out.println();
    }
}
