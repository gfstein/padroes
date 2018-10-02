package model;

public class Pizza {

    private String name;

    public void prepare(){
        System.out.println("Preparing pizza " + name);
    }

    public void bake(){
        System.out.println("baking pizza " + name);
    }

    public void cut(){
        System.out.println("cutting pizza " + name);
    }

    public void box(){
        System.out.println("boxing pizza " + name);
    }

    @Override
    public String toString() {
        return "Pizza: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
