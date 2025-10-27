public class Empolyee extends Worker {

   private long empolyeeId;
   private String hireDate;
   private static int employeeNo = 1;

   
   public Empolyee() {
}


   public Empolyee(String name, String birthDate, String hireDate) {
    super(name, birthDate);
    this.empolyeeId = Empolyee.employeeNo ++;
    this.hireDate = hireDate;
}


   @Override
public String toString() {
    return "Empolyee [empolyeeId=" + empolyeeId + ", hireDate=" + hireDate + ", toString()=" + super.toString() + "]";
}


   

    
}
