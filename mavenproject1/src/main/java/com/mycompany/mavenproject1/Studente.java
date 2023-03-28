package com.mycompany.mavenproject1;

import java.util.Date;
public class Studente {
    private String nome;
    private String cognome;
    private Integer  matricola;
    private Integer anni;
    private Date d;
    private double voti[];
public String getNome() {
        return nome;
    }
public void setNome(String nome) {
        this.nome = nome;
    }
public String getCognome() {
        return cognome;
    }
public void setCognome(String cognome) {
        this.cognome = cognome;
    }
public Integer getMatricola() {
        return matricola;
    }
public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }
public Integer getAnni() {
        return anni;
    }
public void setAnni(Integer anni) {
        this.anni = anni;
    }
    public Studente(String n,String c,Integer a, int m){
     this.nome=n;
     this.cognome=c;
     this.anni=a;
     this.matricola=m;    
     this.voti= new double [100];
}
public Studente(){

}
public Date getD() {
        return d;
    }
public void setD(Date d) {
        this.d = d;
    }
public boolean isMaggiorenne(){
    if (anni>=18)
    {
            return true;
    }
    return false;
}
public String getFullName(){
    return this.nome+" "+ this.cognome;
}
public  String getEmail(){
    return this.nome+"_"+this.cognome+"@gmail.com";
}

}
