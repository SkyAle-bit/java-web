//devo creare una classe che rappresenta un utente

public class User{
    private String name;
    private String surname;
    private String email;
    private String password;
    private String username;

    public User(String name, String surname, String email, String password){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.username = name + surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public String getUsername(){
        return this.username;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //Modifica e visualizza prodotti

    public void modifyProduct(Product product, String name, String description, double price, int quantity){
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setQuantity(quantity);
    }

}