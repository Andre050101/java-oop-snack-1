package org.lessons.java.snack1;
/*Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
  Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
  Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).*/
  public class Studente {
    private String nome, cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    //Getter e setter
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome == null){
            this.nome = "nome sconosciuto";
        }
        this.nome = nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public void setCognome(String cognome){
        if(cognome == null){
            this.cognome = "cognome sconosciuto";
        }
        this.cognome = cognome;
    }

    public int getEta(){
        return this.eta;
    }

    public void setEta(int eta){
        if(eta < 0){
            this.eta = 0;
        }
        this.eta = eta;
    }

    //Other methods

    public String concatenatedValues(){
        char space = ' ';
        char comma = ',';
        String concatenated = this.nome+space+this.cognome+comma+space+this.eta+space;
        if(this.eta == 1){
            concatenated +="anno";
        }
        else{

        concatenated +="anni";
        }
        return concatenated;
    }
}
