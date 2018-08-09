public abstract class Direction {

    private int staffId;
    private String dept;
    private double experience;
    private String name;
    private int age;



    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Direction(int staffId, String dept, double experience, String name, int age) {
        this.staffId = staffId;
        this.dept = dept;
        this.experience = experience;
        this.name = name;
        this.age = age;
    }

}
