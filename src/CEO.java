public class CEO extends AdminUnit {

    private double staff;

    public double getStaff() {
        return staff;
    }

    public void setStaff(double staff) {
        this.staff = staff;
    }

    public CEO(staffId, dept, experience, name, age, title, activity, grade, double staff) {
        super(staffId, dept, experience, name, age, title,activity, grade);
        this.staff = staff;
    }

    @Override
    public void doWork() {
        System.out.println("I am CEO");
    }
}
