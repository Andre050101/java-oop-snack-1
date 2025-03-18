import org.lessons.java.snack1.Studente;
public class App {
    public static void main(String[] args) throws Exception {
        Studente andrea = new Studente("Andrea", "Giancristiano", 24);

        System.out.println(andrea.concatenatedValues());
    }
}
