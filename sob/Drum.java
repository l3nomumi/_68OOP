public class Drum extends MusicalInstrument {

    public Drum(String name) {
        super(name, "Drum");
    }

    @Override
    public void play() {
        System.out.println("Sound : Boom Boom!");
    }

    @Override
    public void action() {
        System.out.println("Action : Drum is playing.");
        System.out.println("Action : Drum is hitting.");
    }

}