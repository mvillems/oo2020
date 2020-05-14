public class LargeRoom extends Theater1 {

    public LargeRoom(String name, int seats, String screen) {
        this.name = name;
        this.seats = seats;
        this.screen = screen;
        this.occupation = "Renovating";
    }

    @Override
    public void action() {
        System.out.println("Mahutab küllaga");
    }
}