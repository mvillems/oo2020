public class AppInfoThread implements Runnable {

    private String tName;
    private Thread thread;

    private int prev;

    private AppSystem aSystem;

    public AppInfoThread(String name, AppSystem aSystem) {
        tName = name;
        this.aSystem = aSystem;
        prev = 0;
    }

    @Override
    public void run() {
        try {
            while (aSystem.isRunning()) {
                if (aSystem.getNumbers().size() > prev) {
                    System.out.println("INFO: Nr of numbers in the list: " + aSystem.getNumbers().size());
                    prev = aSystem.getNumbers().size();
                }
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("INFO: Thread " + tName + " dead");
        }

    }

    public void start() {
        System.out.println("INFO: Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }
}