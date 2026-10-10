public class Guitar extends MusicalInstrument implements ElectricInstrument {

    public Guitar(String name) {
        super(name, "Guitar");
    }

    @Override
    public void play() {
        System.out.println("Sound : Strum Strum!");
    }

    @Override
    public void action() {
        System.out.println("Action : Guitar is playing.");
        System.out.println("Action : Guitar is plucking the strings.");
    }

    @Override
    public void useElectricity() {
        System.out.println("Electric Guitar can use electricity.");
    }
}