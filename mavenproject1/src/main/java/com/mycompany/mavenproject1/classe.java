package com.mycompany.mavenproject1;
public class classe {
    private Integer nStudenti;
    private Studente Studenti[];
    private String nome;

    public Integer getnStudenti() {
        return nStudenti;
    }

 public void setnStudenti(Integer nStudenti) {
        this.nStudenti = nStudenti;
    }

  public Studente[] getStudenti() {
        return Studenti;
    }

 public void setStudenti(Studente[] Studenti) {
        this.Studenti = new Studente[this.nStudenti];
    }

 public String getNome() {
        return nome;
    }

public void setNome(String nome) {
        this.nome = nome;
    }

 public void addStudente(int i, String n,String c,Integer a, int m){
     this.Studenti[i].setNome(n);
     this.Studenti[i].setCognome(c);
     this.Studenti[i].setMatricola(m);
     this.Studenti[i].setAnni(a);    
 }
}
