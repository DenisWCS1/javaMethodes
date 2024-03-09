public class Duck {
    //attributes
    private String name;
    private int age;
    private boolean swimming;

    // constructors
    public Duck(String name){
        this.name = name;
        age = 0;
        this.swimming = false;
    };
    public Duck(String name,int age){
        this.name = name;
        age = this.age;
        this.swimming = false;
    };
    public Duck(String name, int age, boolean swimming){

        this.name = name;
        this.age = age;
        this.swimming = swimming;
    }
    // Static method
    public static String quack(){
        return "Quack";
    }
    // Instance method
    public String nameAndAge(){
        return "My Name is " + this.getName() + " and i'm " + String.valueOf(this.getAge());
    }
    // Getters (Accesseurs)
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isSwimming() {
        return this.swimming;
    }
    // Setter (Mutateurs)
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSwimming(boolean swimming){
        this.swimming = swimming;
    }


}