package study.designpattern.facade;

import study.designpattern.facade.hometheater.*;

public class Main {
    public static void main(String[] args) {
        String livingRoom = "Living Room";
        Amplifier amp = new Amplifier(livingRoom);
        Tuner tuner = new Tuner(livingRoom, amp);
        CdPlayer cd = new CdPlayer(livingRoom, amp);
        Projector projector = new Projector(livingRoom, new StreamingPlayer(livingRoom, amp));
        Screen screen = new Screen(livingRoom);
        TheaterLights light = new TheaterLights(livingRoom);
        PopcornPopper popper = new PopcornPopper(livingRoom);

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, cd, projector, light, screen, popper);
        homeTheater.watchMove("Intern");
        homeTheater.endMovie();
    }
}
