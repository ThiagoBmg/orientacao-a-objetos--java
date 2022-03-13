public class Aluno {
    private String nome;
    private String RA;
    private String curso;

    void setNome(String nome) {
        this.nome = nome;
    }

    void setRA(String RA) {
        this.RA = RA;
    }
    
    String getRA() {
        return RA;
    }

    String getNome() {
        return nome;
    }

    String getCurso() {
        return curso;
    }

    void setCurso(String curso) {
        this.curso = curso;
    }

    void create_response() {
        Disciplina disciplina = new Disciplina();
        Professor professor = new Professor();
        professor.setNome("Ricardo Stefan");
        professor.setDepartamento("Professor");
        disciplina.setNome("Fisica");
        disciplina.setCodigo("20");
        System.out.print("O aluno "+this.getNome()+" - RA: "+this.getRA()+"\nCom o curso: "+this.getCurso()+"\n");
        System.out.print("Disciplina: "+disciplina.getNome()+"-"+disciplina.getCodigo()+"\nCom o professor "+professor.getNome()+"-"+professor.getDepartamento()+"\n");
    }
}