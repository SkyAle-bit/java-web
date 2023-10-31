//Utilizza ArrayList per memorizzare una lista di nomi e stampa ciascun nome.

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        
    
    ArrayList<String> nomi = new ArrayList<String>();
    nomi.add("Mario");
    nomi.add("Luigi");
    nomi.add("Alessandro");
    

    for (int i = 0; i < nomi.size(); i++) {
        System.out.println(nomi.get(i));
    }

    }
}
