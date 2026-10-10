public abstract class MusicalInstrument {

    protected String name;
    protected String type;

    public MusicalInstrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void play() {
        System.out.println("Instrument is playing.");
    }

    public void action() {
        System.out.println("Instrument is performing.");
    }
}