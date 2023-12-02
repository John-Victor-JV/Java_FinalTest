public class Temporary extends Contract{
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getAccumulatedHours() {
        return accumulatedHours;
    }

    public String toString(){
        String info =". He/She is a temporary employee with " +
                getHourlySalary() + " hourly salary and he worked for " +
                getAccumulatedHours() + " hours";
        return info;
    }
}
