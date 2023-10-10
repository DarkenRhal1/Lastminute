package pclab;

public class PC {

    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public PC() {

    }

    public void drawLogo(){
        monitor.drawPixel(5,20, "BLUE");
    }

    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();

        Motherboard.loadProgram("Photoshop");
    }

    public void description() {
        System.out.println("Welcome to Worst Buy below is the description of the pc on sale today:" + "\n" + monitor + "\n" + pcCase.toString() + monitor.toString() + motherboard.toString());

    }


    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase=" + pcCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
}
