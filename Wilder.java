public class Wilder {
    String firstname;
    boolean aware;


    // Constructors
    public Wilder(String firstname) {
        this.firstname = firstname;
        aware= false;
    }
    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }
    // Instance method
    public String WhoIam(){
       return "Je m'appelle "+ getFirstname() + (aware ? " et je suis aware":" et je ne suis pas aware");
    }
    // Getters (Accesseurs)
    public String getFirstname(){
        return this.firstname;
    }
    public boolean isAware(){
        return aware;
    }
    // Setters (Mutateurs)
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setAware(boolean aware){
        this.aware = aware;
    }
}
