package com.mycompany.mavenproject1;

import java.util.Date;
public class Studente {
    private String nome;
    private String cognome;
    private Integer  matricola;
    private Integer anni;
    private Date d;
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
public Studente(String nome,String cognome){
   this.nome=nome; 
   this.cognome=cognome;
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

}
