package ClinicAppointmentSystem ;

public class Appointment   {

    
   private Clinic clinic;
   private int Year;
   private int Month;
    private int Day;
   private int AppointmentTime;
  private  boolean Available=true;
    

    
public Appointment(Clinic clinic, int Year, int Month, int Day, int AppointmentTime ) {
        this.clinic = clinic;
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
        this.AppointmentTime = AppointmentTime;
     //   this.Available = Available;
         
    }

    public Appointment() {
        this(null, 0, 0, 0, 0);//, false);
    }

    

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getAppointmentTime() {
        return AppointmentTime;
    }

    public void setAppointmentTime(int AppointmentTime) {
        this.AppointmentTime = AppointmentTime;
    }

    public boolean isAvailable() {
        return this.Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    @Override
    public String toString() {
        return " Clinic: Number  " + this.clinic.getClinic_Number() + " Floor: " +
                this.clinic.getClinic_Floor()                    + "  Date: " +this.Day + "/" +this.Month +
                "/" + this.Year + " Time: " + this.AppointmentTime + ":00  \n";
    }

     
    
    

}
