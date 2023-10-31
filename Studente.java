/*Crea una classe chiamata Studente
con attributi come nome, cognome, età e voto.
Poi crea oggetti studente e visualizza
le informazioni su di essi.*/

public class Studente {
    String nome;
    String cognome;
    int eta;
    double voto;


    public Studente (String nome, String cognome, int eta, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.voto = voto;
    }

    public void visualizzaInformazioni(){
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);
        System.out.println("Voto: " + voto);
    }

    public static void main(String[] args) {
        Studente studente1 = new Studente("Mario", "Rossi", 20, 27.5);
        studente1.visualizzaInformazioni();

        Studente studente2 = new Studente("Luigi", "Verdi", 21, 28.5);
        studente2.visualizzaInformazioni();
    }
}
