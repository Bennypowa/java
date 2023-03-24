package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Studente stu= new Studente();
        Scanner sc= new Scanner(System.in);
        System.out.println("inserisci il nome dello studente");
        stu.setNome(sc.nextLine());
        System.out.println("inserisci il cognome dello studente");
        stu.setCognome(sc.nextLine());
        stu.setAnni(17);
        if(stu.isMaggiorenne())
        {
            System.out.println("Lo studente "+stu.getNome()+
                    " e' maggiorenne");
        }
        else
        {
                   System.out.println("Lo studente "+stu.getNome()+
                    "non e' maggiorenne");
         }  
    }
}
