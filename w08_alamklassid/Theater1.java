public abstract class Theater1 extends Company {
    String name;
    int seats;
    String screen;
    
    public void getName() {
        System.out.println("This rooms is " + name);
    }

    public void getSeatNr() {
        System.out.println("This room has " + seats + " seats!");
    }

    public void getScreenInfo() {
        System.out.println("This room has " + screen + " screen!");
    }

    @Override
    public void action() {
        System.out.println("Theater is working");
    }
}