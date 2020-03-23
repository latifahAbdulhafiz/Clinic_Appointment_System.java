
package ClinicAppointmentSystem ;

public class Nurse extends HealthcarePractitioner {
   private int experianceYear;

    public Nurse(int id,int experianceYear,  String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address, boolean onLeave) {
        super( id,Name, Nationality, Year, Month, Day, Gender, Phone, Address, onLeave);   
        this.experianceYear = experianceYear;
    }

    
    public int getExperianceYear() {
        return experianceYear;
    }

    public void setExperianceYear(int experianceYear) {
        this.experianceYear = experianceYear;
    }
   
   

    
    
    
    
}
