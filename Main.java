package pclab;

public class Main {

    public static void main(String[] args) {
        Dimensions dimension = new Dimensions(2,3,9);
        Resolution resolution = new Resolution(10,20);
        Case pccase = new Case("EA FC","Amps","UNknown",dimension);
        Monitor monitor = new Monitor(resolution, "Amps", 1121123);

        Motherboard motherBoard = new Motherboard();
        motherBoard.MotherBoard("model x", "Amps", 5, 5, "Bios");
        PC pc = new PC();
        pc.setPcCase(pccase);
        pc.setMotherboard(motherBoard);
        pc.setMonitor(monitor);
        //System.out.println(monitor);
        pc.description();
        pc.powerUp();
    }
}
