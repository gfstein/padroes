public class Main {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println(chocolateBoiler);
        chocolateBoiler.fill();
        System.out.println(chocolateBoiler);
        chocolateBoiler.boil();
        System.out.println(chocolateBoiler);
        chocolateBoiler.drain();
        System.out.println(chocolateBoiler);

        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        System.out.println(chocolateBoiler);
        chocolateBoiler2.fill();
        System.out.println(chocolateBoiler);
        chocolateBoiler2.boil();
        System.out.println(chocolateBoiler);
        chocolateBoiler2.drain();
        System.out.println(chocolateBoiler);
    }

}
