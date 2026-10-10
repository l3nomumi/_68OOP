public class Piano extends MusicalInstrument {

    public Piano(String name) {
        super(name, "Piano");
    }

    @Override
    public void play() {
        System.out.println("Sound : Ting Ting!");
    }

    @Override
    public void action() {
        System.out.println("Action : Piano is playing.");
        System.out.println("Action : Piano is plucking the keys.");
    }

}