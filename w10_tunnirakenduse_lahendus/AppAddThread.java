import java.util.Scanner;

public class AppAddThread implements Runnable {

    private String tName;
    private AppSystem appSystem;

    private Thread thread;

    public AppAddThread(String name, AppSystem aSystem) {
        tName = name;
        appSystem = aSystem;
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);

        try {
            while (appSystem.isRunning()) {
                String newNumber;
                System.out.print("ADD: Enter new number: ");
                newNumber = in.nextLine();
                if (newNumber.equals("")) {
                    appSystem.end();
                    in.close();
                } else {
                    System.out.println("ADD: Number added: " + newNumber);
                    Integer memory = Integer.valueOf(newNumber);
                    appSystem.getNumbers().add(memory);
                }
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("ADD: Thread " + tName + " dead");
        }

    }

    public void start() {
        System.out.println("ADD: Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }
}