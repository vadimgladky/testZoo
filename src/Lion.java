public class Lion extends ZooUnit {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void doWork() {
        System.out.println("I am the King");
    }
}
