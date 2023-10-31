//classe Admin che rappresenta un amministratore del sito
//ADMIN - Crea, Modifica, Visualizza, Elimina prodotti

public class Admin{

    private String name;
    private String surname;
    private String email;
    private String password;
    private String username;
    
    public Admin(String name, String surname, String email, String password){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.username = name + surname;
    }


}