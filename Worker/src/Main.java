public class Main {
    public static void main(String[] args) {
        Empolyee Tim = new Empolyee("Tim", "11/11/1996", "23/5/2025");
        SalariedEmployee Joe = new SalariedEmployee("Joe", "11/11/1989", "23/5/2025", 37000, false);
        HourlyEmployee Jonah = new HourlyEmployee("Jonah", "23/10/1892", "28/4/2022", 22);
        System.out.println(Tim);
        System.out.println(Joe);
        System.out.println(Jonah);
        System.err.println("Age = " + Tim.getAge());

        System.out.println("Joe's Paycheck = $" + Joe.collectPay());
        Joe.retire();
        System.err.println("Joe's Pension check = $" + Joe.collectPay());
        System.out.println("Jonah is getting " + Jonah.collectPay() + "$ Per week");
        System.out.println("Jonah's holiday payCehck: $" + Jonah.getDoublePay());
    }

}