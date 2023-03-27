package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Studente stu= new Studente();
        classe c= new classe();
        System.out.println("inserire il nome: ");
        c.setNome(sc.nextLine());
        System.out.println("inserisci il nome dello studente");
        stu.setNome(sc.nextLine());
        System.out.println("inserisci il cognome dello studente");
        stu.setCognome(sc.nextLine());
        stu.setAnni(17);
        if(stu.isMaggiorenne())
        {
            System.out.println("Lo studente "+stu.getNome()+" "+ stu.getCognome()+
                    " e' maggiorenne");
        }
        else
        {
                   System.out.println("Lo studente "+stu.getNome()+" "+stu.getCognome()+
                    " non e' maggiorenne");
         }  
        System.out.println(stu.getFullName());
        System.out.println(stu.getEmail());
    }
}
