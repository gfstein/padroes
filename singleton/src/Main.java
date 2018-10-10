public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
            System.out.println(chocolateBoiler1 + " - 1");
            chocolateBoiler1.fill();
            chocolateBoiler1.boil();
            chocolateBoiler1.drain();
        });

        Thread thread1 = new Thread(() -> {
            ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
            System.out.println(chocolateBoiler1 + " - 2");
            chocolateBoiler1.fill();
            chocolateBoiler1.boil();
            chocolateBoiler1.drain();
        });

        thread.start();
        thread1.start();

    }

}
