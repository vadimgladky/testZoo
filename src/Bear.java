public class Bear extends ZooUnit{

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Go Russia!");
    }
}
