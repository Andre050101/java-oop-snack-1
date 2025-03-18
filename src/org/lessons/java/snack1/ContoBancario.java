package org.lessons.java.snack1;

import java.math.BigDecimal;

/*Crea una classe ContoBancario con attributi per numero di conto e saldo. 
  Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
  Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.*/
public class ContoBancario {
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal(0);
    }

    //Getter (setter non necessari perche non ha senso cambiare numero di conto o saldo(quest'ultimo manualmente non ha senso))
    public int getNumeroConto(){
        return this.numeroConto;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    //Other methods
    public void deposit(BigDecimal soldiDaDepositare){
        if(soldiDaDepositare.compareTo(new BigDecimal(0)) == 1){
            this.saldo = this.saldo.add(soldiDaDepositare);
            System.out.println("Deposito di "+soldiDaDepositare+"€ effettuato. Saldo attuale: "+this.saldo+"€");
        }
        else{
            System.out.println("Errore in fase di deposito");
        }
    }

    public void withdrawal(BigDecimal soldiDaPrelevare){
        if(soldiDaPrelevare.compareTo(this.saldo) == 1){
            System.out.println("Disponibilità insufficiente");
        }
        else{
            this.saldo = this.saldo.subtract(soldiDaPrelevare);
            System.out.println("Prelievo di "+soldiDaPrelevare+"€ effettuato! Saldo rimanente: "+this.saldo+"€");
        }
    }
}
