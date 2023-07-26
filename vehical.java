public class vehical {

    public static void main(String[] args) {
        PetroleEngine pE = new PetroleEngine();
        pE.start();

        DiselEngine dE = new DiselEngine();
        pE.start();
    }
}