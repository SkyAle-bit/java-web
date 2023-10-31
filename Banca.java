/*1 solo entry point: chiedere il PIN (Codice a 4 cifre). Se l'utente inserisce il pin giusto entra. Se l'utente colleziona almeno 3 tentativi sbagliati, chiudere il programma
Se l'utente entra nel programma via pin corretto, fornire la stampa di un menu di opzioni come segue:
1 - Visualizza saldo
2 - Deposita denaro
3 - Ritira denaro
4 - Esci
1) Visualizza saldo: se l'utente preme 1, riceverà la stampa del quantitativo di denaro presente sul suo conto (ovviamente inizializzato da voi a zero o ad una cifra a piacere)
2) Deposita denaro: se l'utente preme 2, dovrà inserire un importo (inserire tutti i controlli per verificare che l'utente inserisca una cifra realistica e quindi composta da soli numeri). La cifra verrà aggiunta al saldo
3) Ritira denaro: se l'utente preme 3, dovrà inserire un importo (inserire tutti i controlli per verificare che l'utente inserisca una cifra realistica e quindi composta da soli numeri). La cifra verrà sottratta al saldo
4) Esci: se l'utente preme 4, il programma stamperà un messaggio di saluto e terminerà l'esecuzione
BONUS: Se riuscite con i tempi, inserire una opzione che permetta di effettuare un bonifico inserendo l'iban di un destinatario (IBAN da inizializzare a piacere) ed una cifra da inviare. Se l'iban è corretto e si ha disponibilità economica, la cifra verrà sottratta al saldo */

import java.util.Scanner;

public class Banca {
    static final int PIN_CORRETTO = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinTentativi = 0;
        int saldo = 1000; // Saldo iniziale

        while (pinTentativi < 3) {
            System.out.println("Inserisci il PIN: ");
            int pinInput = scanner.nextInt();

            if (pinInput == PIN_CORRETTO) {
                System.out.println("Accesso consentito!");
                break;
            } else {
                pinTentativi++;
                System.out.println("PIN errato. Tentativi rimanenti: " + (3 - pinTentativi));
            }
        }

        if (pinTentativi == 3) {
            System.out.println("Tentativi massimi raggiunti. Riprova più tardi.");
        } else {
            int scelta = 0;

            while (scelta != 4) {
                System.out.println("Seleziona un'opzione:");
                System.out.println("1 - Visualizza saldo");
                System.out.println("2 - Deposita denaro");
                System.out.println("3 - Ritira denaro");
                System.out.println("4 - Esci");

                scelta = scanner.nextInt();

                switch (scelta) {
                    case 1:
                        System.out.println("Il tuo saldo è: " + saldo);
                        break;
                    case 2:
                        System.out.println("Inserisci l'importo da depositare: ");
                        int deposito = scanner.nextInt();
                        saldo += deposito;
                        break;
                    case 3:
                        System.out.println("Inserisci l'importo da prelevare: ");
                        int prelievo = scanner.nextInt();
                        if (prelievo <= saldo) {
                            saldo -= prelievo;
                        } else {
                            System.out.println("Fondi insufficienti!");
                        }
                        break;
                    case 4:
                        System.out.println("Grazie e arrivederci!");
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                }
            }
        }
    }
}
