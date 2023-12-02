public class Permanent extends Contract{
    private int nbChildren;
    private boolean married;
    private double monthlySalary;
    private double bonusPerChildPerMonth;
    private int accumulatedDays;

    public Permanent(int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    public int getNbChildren() {
        return nbChildren;
    }

    public String isMarried() {
        if (married){
            return "married";
        }else {
            return "not married";
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public String toString(){
        String info =". He/She is " + isMarried() + " and " +
                    "he/she has " + getNbChildren() + " children." +
                    "\nHe/She has worked for " + getAccumulatedDays() + " days and upon contract his/her" +
                    " monthly salary is " + getMonthlySalary();
        return info;
    }
}
