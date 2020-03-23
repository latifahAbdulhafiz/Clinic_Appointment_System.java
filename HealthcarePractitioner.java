
package ClinicAppointmentSystem ;

public class HealthcarePractitioner extends Person{
    
   private boolean onLeave;

    
    public HealthcarePractitioner( int id,String Name, String Nationality, int Year, int Month, int Day, char Gender,
            String Phone, String Address ,boolean onLeave) {
        super(id, Name, Nationality, Year, Month, Day, Gender, Phone, Address);
        super.setId();
        this.onLeave = onLeave;
    }

    public HealthcarePractitioner() {
        this(0, null, null, 0, 0, 0, 'a', null, null ,false);
    }

    public boolean isOnLeave() {
        return onLeave;
    }

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
