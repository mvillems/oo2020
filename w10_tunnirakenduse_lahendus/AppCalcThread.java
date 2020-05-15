public class AppCalcThread implements Runnable {

    private String tName;
    private AppSystem aSystem;

    private int memory;

    private Thread thread;

    public AppCalcThread(String name, AppSystem aSystem) {
        tName = name;
        this.aSystem = aSystem;
        memory = 0;
    }

    @Override
    public void run() {
        try {
            while (aSystem.isRunning()) {
                if (aSystem.getNumbers().size() > memory) {
                    System.out.println("CALC: Sum of the numbers added is " + AppSystem.sum());
                    memory = aSystem.getNumbers().size();
                }
                Thread.sleep(8000);
            }
        }catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Thread " + tName + " dead");
        }
    }


    public void start() {
        System.out.println("CALC: Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }
}