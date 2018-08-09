public class Accountant extends AdminUnit {
    private int actionsDone;

    public int getActionsDone() {
        return actionsDone;
    }

    public void setActionsDone(int actionsDone) {
        this.actionsDone = actionsDone;
    }

    @Override
    public void doWork(){
        System.out.println("I am operator of my pocket calculator");
    }
}
