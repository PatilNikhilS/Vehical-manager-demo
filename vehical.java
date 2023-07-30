public class vehical {

    public static void main(String[] args) {
        PetroleEngine pE = new PetroleEngine();
        pE.start();
        pE.stop();

        DiselEngine dE = new DiselEngine();
        dE.start();
        dE.stop();

        ElectricEngine eE = new ElectricEngine();
        eE.start();
    }
}