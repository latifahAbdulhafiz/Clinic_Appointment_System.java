package gbr_1815769_p3_ocas;

public class physician extends HealthcarePractitioner {

    private String Spetiality;

    public physician(int id,String Spetiality, String Name, String Nationality, int Year, int Month,
            int Day, char Gender, String Phone, String Address, boolean onLeave) {
        super( id ,Name, Nationality, Year, Month, Day, Gender, Phone, Address, onLeave);  
        this.Spetiality = Spetiality;
    }

    public physician() {
        this(0,null,  null, null, 0, 0, 0, 'a', null, null, false);
    }

    public physician(String Spetiality) {
        this.Spetiality = Spetiality;
    }

    public String getSpetiality() {
        return Spetiality;
    }

    public void setSpetiality(String Spetiality) {
        this.Spetiality = Spetiality;
    }

}
