package study.designpattern.facade;

import study.designpattern.facade.hometheater.*;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper poper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper poper) {
        this.amp = amp;
        this.tuner = tuner;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.poper = poper;
    }

    public void watchMove(String move) {
        System.out.println("Get ready to watch a movie...");
        poper.on();
        poper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStereoSound();
        amp.setVolume(5);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        poper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
    }
}
