package lesson1;

public class Competitor {
    private String name;
    private double runSpeed;
    private double swimSpeed;
    private double runTime;
    private double swimTime;
    private double resultTime;

    public Competitor(String name, double runSpeed, double swimSpeed){
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    public void showInfo(){
        System.out.println(name + " бежит со скоростью " + runSpeed + "м/с, плывёт со скоростью " + swimSpeed + "м/с");
    }

    public String getName() {
        return name;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public double getRunTime() {
        return runTime;
    }

    public double getSwimTime() {
        return swimTime;
    }

    public double getResultTime() {
        return resultTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    public void setSwimTime(double swimTime) {
        this.swimTime = swimTime;
    }

    public void setResultTime(double resultTime) {
        this.resultTime = resultTime;
    }
}
