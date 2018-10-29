import model.*;
import org.jetbrains.annotations.NotNull;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new WildDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(@NotNull Duck duck){
        duck.quack();
        duck.fly();
    }

}
