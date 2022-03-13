class HeartRates{
    private String name;
    private String last_name;
    private int birth_date_day, birth_date_month, birth_date_year;
    private int  d, m, y, age, fmax, fa;
    
    public int getD(){
        return d;
    }
    public int getM(){
       return m;
    }
    public int getY(){
        return y;
    }
    public int getage(){
        return age;
    }
    public int getFmax(){
        return fmax;
    }
    public int getFa(){
        return fa;
    }

    public String getName(){
        return name;
    }
    public String getlast_name(){
        return last_name;
    }
    public int getbirth_date_day(){
        return birth_date_day;
    }
    public int getbirth_date_month(){
        return birth_date_month;
    }
    public int getbirth_date_year(){
        return birth_date_year;
    }

    public HeartRates(String pacienteN, 
                    String pacienteS, 
                    int pacienteD, 
                    int pacienteM, 
                    int pacienteA, 
                    int DC, 
                    int MC, 
                    int AC){
        this.name = pacienteN;
        this.last_name = pacienteS;
        this.birth_date_day = pacienteD;
        this.birth_date_month = pacienteM;
        this.birth_date_year = pacienteA;
        this.d = DC;
        this.m = MC;
        this.y = AC;

        this.apply();
        this.apply_formula1();
        this.apply_formula2();
    }
   
    public void apply(){ 
        if(this.y > this.birth_date_year){
            if(this.m > this.birth_date_month){
                this.age = this.y - this.birth_date_year;
            }
            else if(this.m == this.birth_date_month){
                if(this.d >= this.birth_date_day){
                    this.age = this.y - this.birth_date_year;
                }
                else{
                    this.age = this.y - this.birth_date_year - 1;
                }
        }
        else if(this.m < this.birth_date_month){
            this.age = this.y - this.birth_date_year - 1;
        }
       }
    }
    
    public int apply_formula1(){
        this.fmax = 220 - this.age;
        return fmax;
    }
    
    public void apply_formula2(){
        this.fa = this.fmax * 100 / 220;
    }  

    void get_result(){
        System.out.printf("Nome: %s %s", this.getName(), this.getlast_name());
        System.out.print("\n");
        System.out.printf("Data de nascimento: %d/%d/%d", this.getbirth_date_day(), this.getbirth_date_month(), this.getbirth_date_year());
        System.out.print("\n");
        System.out.printf("Idade: %d", this.getage());
        System.out.print("\n");
        System.out.printf("Frequencia Maxima: %d", this.getFmax());
        System.out.print("\n");
        System.out.printf("Frequencia cardiaca Alvo: %d" , this.getFa());
        System.out.print("\n");
    }
 }