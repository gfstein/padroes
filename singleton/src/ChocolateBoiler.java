public class ChocolateBoiler {

    private Boolean empty;
    private Boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        this.empty = Boolean.TRUE;
        this.boiled = Boolean.FALSE;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if (instance == null) {
            instance = new ChocolateBoiler();
        }

        return instance;
    }

    public void fill(){
        if (isEmpty()){
            empty = Boolean.FALSE;
            boiled = Boolean.FALSE;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = Boolean.TRUE;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = Boolean.TRUE;
        }
    }

    public Boolean isEmpty() {
        return empty;
    }

    public Boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        return "Empty: " + empty + " - Boiled: " + boiled;
    }
}
