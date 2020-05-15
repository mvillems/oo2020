public class MyApp {

    private AppSystem aSystem = new AppSystem();
    private AppAddThread addThread;
    private AppInfoThread infoThread;
    private AppCalcThread calcThread;

    public MyApp() {
        addThread = new AppAddThread("Add thread", aSystem);
        infoThread = new AppInfoThread("Info thread", aSystem);
        calcThread = new AppCalcThread("Calc thread", aSystem);
    }

    public void start() {
        addThread.start();
        infoThread.start();
        calcThread.start();
    }
}