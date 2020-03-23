
package ClinicAppointmentSystem ;

public class Clinic {
   private int Clinic_Number;
   private int Clinic_Floor;

    public Clinic() {
        this(0, 0);
    }

    public Clinic(int Clinic_Number, int Clinic_Floor) {
        this.Clinic_Number = Clinic_Number;
        this.Clinic_Floor = Clinic_Floor;
    }

    public int getClinic_Number() {
        return Clinic_Number;
    }

    public void setClinic_Number(int Clinic_Number) {
        this.Clinic_Number = Clinic_Number;
    }

    public int getClinic_Floor() {
        return Clinic_Floor;
    }

    public void setClinic_Floor(int Clinic_Floor) {
        this.Clinic_Floor = Clinic_Floor;
    }

    @Override
    public String toString() {
        return "Clinic{" + "Clinic_Number=" + Clinic_Number + ", Clinic_Floor=" + Clinic_Floor + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
}
