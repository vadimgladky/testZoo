public abstract class AdminUnit extends Direction {

    private String title;
    private String activity;
    private int grade;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public AdminUnit(staffId, dept, experience, name, age, String title, String activity, int grade) {
        super(staffId, dept, experience, name, age);
        this.activity = activity;
        this.grade = grade;
        this.title = title;
    }

    public abstract void doWork();

}
