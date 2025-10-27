public class SalariedEmployee extends Empolyee{

    protected double annualSalary;
    protected boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary,
            boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() { 
        double payCheck = annualSalary / 30;
        double adjustedPaycheck = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPaycheck;

    }
    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }


    @Override
    public String toString() {
        return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + ", toString()="
                + super.toString() + "]";
    }

    
}
