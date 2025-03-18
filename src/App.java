import org.lessons.java.snack1.Studente;

import java.math.BigDecimal;

import org.lessons.java.snack1.ContoBancario;
public class App {
    public static void main(String[] args) throws Exception {
        ContoBancario contoDiProva = new ContoBancario(0);
        System.out.println(contoDiProva.getNumeroConto());
        System.out.println(contoDiProva.getSaldo());
        contoDiProva.deposit(new BigDecimal(5000));
        System.out.println(contoDiProva.getSaldo());
        contoDiProva.withdrawal(new BigDecimal(2000));
        System.out.println(contoDiProva.getSaldo());
    }
}
