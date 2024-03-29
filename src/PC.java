public class PC {

    private Case  theCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        loadCode();
    }

    private void drawLogo(){
         //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    private void loadCode(){
        motherboard.loadProgram("JAVA RULES");
    }
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherboard;
//    }
}
