public class ChocolateBoiler {

    private Boolean empty;
    private Boolean boiled;
    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler() {
        this.empty = Boolean.TRUE;
        this.boiled = Boolean.FALSE;
    }

    public static ChocolateBoiler getInstance(){
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null){
                    instance = new ChocolateBoiler();
                }
            }
        }

        return instance;
    }

    public void fill(){
        if (isEmpty()){
            System.out.println("fill");
            empty = Boolean.FALSE;
            boiled = Boolean.FALSE;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            System.out.println("drain");
            empty = Boolean.TRUE;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            System.out.println("boil");
            boiled = Boolean.TRUE;
        }
    }

    public Boolean isEmpty() {
        return empty;
    }

    public Boolean isBoiled() {
        return boiled;
    }
}
