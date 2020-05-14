import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Theater1 room1 = new SmallRoom("Blue room", 20, "2D");
        Theater1 room2 = new SmallRoom("Green room", 25, "2D");
        Theater1 room3 = new MediumRoom("Red room", 50, "3D");

        LargeRoom room4 = new LargeRoom("Golden room", 100, "IMAX 3D");

        List<Theater1> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        for(Theater1 room : rooms) {
            room.getName();
            room.getSeatNr();
            room.getScreenInfo();
            System.out.println("-----------------");
        }
    }
}
