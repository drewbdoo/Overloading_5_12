public class Animal {
    private String name;
    private Boolean isDog;

    public  Animal(String name) {
        this.name = name;

    }
    public Animal(Boolean isDog){
        this.isDog = isDog;
    }
    public Animal(){

    }

    public Animal(String name, boolean isDog) {
        this.name=name;
        this.isDog=isDog;
    }
    public String getName(){
        return name;
    }

    public Boolean getIsDog(){
        return isDog;
    }

    public String toString(){
        return getName() + " is a dog = " + getIsDog();
    }

    public void setName(String x){name=x;}
    public void setIsDog(Boolean x){
        isDog=x;
    }


}
