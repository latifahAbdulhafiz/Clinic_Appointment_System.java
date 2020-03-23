package ClinicAppointmentSystem ;

public class patient extends Person {

    private String Diagnosis;
   private  Appointment[] Appointment = new Appointment[2];
    private int numberOfAppointment = 0;
    public static int numberOfpatient;

    public patient(int id, String Diagnosis,
            String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address) {
        super(id, Name, Nationality, Year, Month, Day, Gender, Phone, Address);
        this.Diagnosis = Diagnosis;
        // this.Appointment;
        numberOfpatient++;
    }

    public patient() {
        this(0, null, null, null, 0, 0, 0, 'a', null, null);
    }

    public boolean addappointment(Clinic clini, int Year, int Month, int Day, int AppointmentTime) {
        if (this.numberOfAppointment < 2) {
            Appointment a = new Appointment(clini, Year, Month, Day, AppointmentTime);
            this.Appointment[this.numberOfAppointment] = a;

            this.numberOfAppointment++;
            return false;
        } else {
            return true;
        }

    }

    public void DellappointmentAT(int index) {
       Appointment[index] = null;
    }

    public String getappointmentAT(int indx) {
        if (this.Appointment[indx] != null) {
            return this.Appointment[indx].toString();

        }
        return " ";
    }

    public int SearchappointmentAT(int Year, int Month, int Day, int Time) {
        for (int i = 0; i < this.numberOfAppointment; i++) {
            Appointment a = this.Appointment[i];
            if (a != null) {
                if ((a.getDay() == Day) && (a.getMonth() == Month) && (a.getYear() == Year)) {
                    return i;

                }
            }
        }
        return -1;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public int getNumberOfAppointment() {
        return numberOfAppointment;
    }

    public void setNumberOfAppointment(int numberOfAppointment) {
        this.numberOfAppointment = numberOfAppointment;
    }

}
