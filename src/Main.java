import static java.lang.System.*;

public class Main {



    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.setName("Kisa");
        lion.setExperience(10);
        lion.setGrade(3);
        lion.setStaffId(201);
        lion.setTitle("King of animals");
        lion.setDept("Zoo");
        lion.setActivity("Entertain");
        lion.doWork();

        CEO ceo = new CEO();
        ceo.setStaff(20);
        ceo.setActivity("Manage");
        ceo.setDept("Admin Unit");
        ceo.setGrade(1);
        ceo.setName("Voss");
        ceo.setStaffId(101);
        ceo.setTitle("CEO");

        ceo.doWork();

        CEO ceoDeputy = new CEO("CEO DEPUTY", "Manage also", 2, 100);

        ceoDeputy.doWork();


    }

}
