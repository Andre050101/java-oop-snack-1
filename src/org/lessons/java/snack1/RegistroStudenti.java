package org.lessons.java.snack1;
import org.lessons.java.snack1.Studente;
import java.util.Arrays;
/*Crea una classe RegistroStudenti che rappresenti un registro di studenti.
  Utilizza un array privato per memorizzare oggetti Studente. 
  Implementa un costruttore senza parametri per inizializzare il registro 
  vuoto e un metodo pubblico per aggiungere studenti al registro. 
  Aggiungi un metodo che stampi la lista degli studenti.*/
public class RegistroStudenti {
    //Variabili di istanza
    private Studente[] arrayStudenti;
    private int nStudenti;

    //Costruttore
    public RegistroStudenti(int dimensioneMassima){
        this.arrayStudenti= new Studente[dimensioneMassima];
        this.nStudenti = 0;
    }

    //Metodo per ridimensionare l'array in caso fosse pieno:
    private void ridimensionaArray(){
        int nuovaDim = arrayStudenti.length * 2;
        arrayStudenti = Arrays.copyOf(arrayStudenti, nuovaDim);
        System.out.println("Registro pieno! Espansione a " + nuovaDim + " posti.");

    }
    //Metodo per aggiungere studente
    public void aggiungiStudente(Studente studente){
        if(this.nStudenti < arrayStudenti.length){
            arrayStudenti[nStudenti] = studente;
            nStudenti++;
        }
        else{
            ridimensionaArray();
        }
    }

    public void stampaStudenti(){
        if(nStudenti == 0){
            System.out.println("Registro vuoto");
        }
        else{
            System.out.println("Lista degli studenti:");
            for(int i = 0; i < nStudenti; i++){
                System.out.println(arrayStudenti[i].concatenatedValues());
            }
        }
    }
}
