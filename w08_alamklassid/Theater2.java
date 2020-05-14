public class Theater2 extends Company {
    
    public Theater2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void action() {
        System.out.println("Theater is shutdown");
    }
}