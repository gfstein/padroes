import model.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        var homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);

        homeTheater.watchMovie("Filmin");
        System.out.println("\n");
        homeTheater.endMovie();

    }

}
