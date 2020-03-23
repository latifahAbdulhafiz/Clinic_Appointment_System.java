
package ClinicAppointmentSystem ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClinicAppointmentSystem {

    public static int id = -1;

    public static void main(String[] args) throws FileNotFoundException {
        //system should first check if the file [input.txt] exists or not 
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        if (!inputFile.exists() && !outputFile.exists()) {
            System.out.println("File doesn't exist");
            System.exit(0);
        }

        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile);
// Stat the program 
        output.println("\nWelcome to the Clinic Appointment System!\n");

        //create arrays and the aize for physician 
        int size_Of_Physicians = input.nextInt();
        physician[] araay_Of_Physicians = new physician[size_Of_Physicians];

        //create arrays and the aize for Nurse 
        int size_Of_Nurse = input.nextInt();
        Nurse[] araay_Of_Nurse = new Nurse[size_Of_Nurse];

        //create arrays and the aize for patient 
        int size_Of_patient = input.nextInt();
        patient[] araay_Of_patient = new patient[size_Of_patient];

        //create arrays and the aize for Clinic 
        int size_Of_Clinic = input.nextInt();
        Clinic[] araay_Of_Clinic = new Clinic[size_Of_Clinic];

        //create arrays and the aize for Appointment 
        int size_Of_Appointment = input.nextInt();
        Appointment[] araay_Of_Appointment = new Appointment[size_Of_Appointment];

        while (input.hasNext()) {
            String command = input.next();

            switch (command) {

                case "SET_physician": {
                    //invok the mathod
                    SET_Physician(araay_Of_Physicians, input, output);

                }
                break;
                case "SET_nurse": {
                    //invok the mathod

                    SET_Nurse(araay_Of_Nurse, input, output);

                }
                break;
                case "SET_patient": {
                    //invok the mathod

                    SET_Patient(araay_Of_patient, input, output);

                }
                break;
                case "SET_Clinic": {
                    //invok the mathod

                    SET_Clinic(araay_Of_Clinic, input, output);

                }
                break;
                case "SET_Appointment": {
                    //invok the mathod

                    SET_Appointment(araay_Of_Appointment, araay_Of_Clinic, input, output);
                }
                break;
                case "RSRVAppointment": {
                    //invok the mathod

                    ReserveAnAppointment(araay_Of_Appointment, araay_Of_patient, input, output);

                }
                break;
                case "CancelAppointment": {
                    //invok the mathod

                    cancelAppointment(araay_Of_Appointment, araay_Of_patient, input, output);
                }
                break;
                case "PrintPatientRecord": {
                    //invok the mathod

                    printPatientRecord(araay_Of_patient, input, output);
                }
                break;
                case "Quit": {
                    output.println();
                    output.println("------------------------------------------------------------------------------------------------------\n");
                    output.println();

                    output.println("\nThank you for using the clinic appointment System, Good Bye!\n");
                    break;
                }

            }//end switch
        }//end while

        input.close();
        output.close();
        output.flush();

        for (int i = 0; i < araay_Of_patient.length; i++) {
            output.println("Name: " + araay_Of_patient[i].getName() + " Id:  " + araay_Of_patient[i].getId());
            for (int j = 0; j < araay_Of_patient[i].getNumberOfAppointment(); j++) {

                output.println("index is " + j + araay_Of_patient[i].getappointmentAT(j));
            }// end for2
        }//end for 1
    }//end main

    
//This command will add the details of all the physicians to the system
    public static void SET_Physician(physician[] araay_Of_Physicians, Scanner input, PrintWriter output) {
//Ahmed_Ali saudi 1980 2 13 M 0555777999 AZahra false Dermatology
        for (int i = 0; i < araay_Of_Physicians.length; i++) {
// details of require parameters
            String nameOfPhysician = input.next();
            String NationalityfPhysician = input.next();
            int yearfPhysician = input.nextInt();
            int monthfPhysician = input.nextInt();
            int dayfPhysician = input.nextInt();
            char genderfPhysician = input.next().charAt(0);
            String phonefPhysician = input.next();
            String addressfPhysician = input.next();
            Boolean onLeavefPhysician = input.nextBoolean();
            String specialtyfPhysician = input.next();

            physician phy = new physician(id++, specialtyfPhysician, nameOfPhysician, NationalityfPhysician, yearfPhysician,
                    monthfPhysician, dayfPhysician, genderfPhysician, phonefPhysician, addressfPhysician, onLeavefPhysician);
            araay_Of_Physicians[i] = phy;

        }
        output.println();
        output.println("COMMAND: SET PHYSICIANS\n");
        for (int i = 0; i < araay_Of_Physicians.length; i++) {
            output.println("Name: " + araay_Of_Physicians[i].getName() + " Id:  " + araay_Of_Physicians[i].getId());
        }

        output.println("\n------------------------------------------------------------------------------------------------------");
        output.println();
    }

    
    //This command will add the details of all the nurses to the system
    public static void SET_Nurse(Nurse[] araay_Of_Nurse, Scanner input, PrintWriter output) {
//Layla_Ali egyptian 1980 2 1 F 0555777888 Alfaisaliyah false 5
        for (int i = 0; i < araay_Of_Nurse.length; i++) {
            //details of require parameters
            String nameOfNurse = input.next();
            String nationalityOfNurses = input.next();
            int YearOfNurse = input.nextInt();
            int MonthOfNurse = input.nextInt();
            int DayOfNurse = input.nextInt();
            char GenderOfNurse = input.next().charAt(0);
            String PhoneOfNurse = input.next();
            String AddressOfNurse = input.next();
            Boolean onLeaveOfNurse = input.nextBoolean();
            int experienceYears = input.nextInt();

            Nurse n = new Nurse(id++, experienceYears, nameOfNurse, nationalityOfNurses, YearOfNurse,
                    MonthOfNurse, DayOfNurse, GenderOfNurse, PhoneOfNurse, AddressOfNurse, onLeaveOfNurse);
            araay_Of_Nurse[i] = n;

        }
        output.println();
        output.println("COMMAND: SET NURSES\n");
        for (int i = 0; i < araay_Of_Nurse.length; i++) {
            output.println("Name: " + araay_Of_Nurse[i].getName() + " Id:  " + araay_Of_Nurse[i].getId());
        }

        output.println("\n------------------------------------------------------------------------------------------------------");
        output.println();

    }

    
    //This command will add the details of all the patients to the system
    public static void SET_Patient(patient[] araay_Of_patient, Scanner input, PrintWriter output) {
//Omar_Anwar saudi 1984 5 13 M 0544477999 AZahra Pain
        for (int i = 0; i < araay_Of_patient.length; i++) {
            //details of require parameters
            String nameOfPatient = input.next();
            String nationalityOfPatient = input.next();
            int yearOfPatient = input.nextInt();
            int monthOfPatient = input.nextInt();
            int dayOfPatient = input.nextInt();
            char genderOfPatient = input.next().charAt(0);
            String phoneOfPatientt = input.next();
            String addressOfPatientt = input.next();
            String DiagnosisOfPatient = input.next();

            patient patient = new patient(id++, DiagnosisOfPatient, nameOfPatient, nationalityOfPatient, yearOfPatient, monthOfPatient, dayOfPatient, genderOfPatient, phoneOfPatientt, addressOfPatientt);

            araay_Of_patient[i] = patient;

        }
        output.println();
        output.println("COMMAND: SET PATIENTS\n");
        for (int i = 0; i < araay_Of_patient.length; i++) {
            output.println("Name: " + araay_Of_patient[i].getName() + " Id:  " + araay_Of_patient[i].getId());
        }

        output.println("\n------------------------------------------------------------------------------------------------------");
        output.println();

    }

    
    //This command will add the details of all the clinics to the system
    public static void SET_Clinic(Clinic[] araay_Of_Clinic, Scanner input, PrintWriter output) {
// 1 2 
        for (int i = 0; i < araay_Of_Clinic.length; i++) {

            int Clinic_Number = input.nextInt();
            int Clinic_Floor = input.nextInt();
            Clinic clinic = new Clinic(Clinic_Number, Clinic_Floor);
            araay_Of_Clinic[i] = clinic;

        }
        output.println();
        output.println("COMMAND: SET CLINICS\n");
        for (int i = 0; i < araay_Of_Clinic.length; i++) {

            output.println("Clinic: " + araay_Of_Clinic[i].getClinic_Number() + "   Floor: " + araay_Of_Clinic[i].getClinic_Floor());
        }
        output.println("\n------------------------------------------------------------------------------------------------------\n");
        output.println();
    }

    
    //This command will add the details of all the appointment slots to the system
    public static void SET_Appointment(Appointment[] araay_Of_Appointment, Clinic[] Clinic, Scanner input, PrintWriter output) {
        //1 2 2020 3 12 10 
        output.println("COMMAND: SET APPOINTMENTS\n");
        for (int i = 0; i < araay_Of_Appointment.length; i++) {
            int NumberOfclinic = input.nextInt();
            int clinicFloor = input.nextInt();
            int yearOfAppointment = input.nextInt();
            int monthOfAppointment = input.nextInt();
            int dayOfAppointment = input.nextInt();
            int startTimeOfAppointment = input.nextInt();

            Appointment app = new Appointment(Clinic[NumberOfclinic - 1], yearOfAppointment, monthOfAppointment, dayOfAppointment, startTimeOfAppointment);
            araay_Of_Appointment[i] = app;

            output.println("	 Clinic: Number  " + Clinic[NumberOfclinic - 1].getClinic_Number() + " Floor: " + Clinic[NumberOfclinic - 1].getClinic_Floor() + "  Date: " + dayOfAppointment + "/" + monthOfAppointment + "/" + yearOfAppointment + " Time:  " + startTimeOfAppointment + ":00");
        }

    }

    
    //This command will Reserve an appointment for the patient based on the entry data  
    public static void ReserveAnAppointment(Appointment[] araay_Of_Appointment, patient[] patient, Scanner input, PrintWriter output) {
        //RSRVAppointment Omar_Anwar 1 2 2020 3 12 11 
        //details of require parameters
        String patientName = input.next();
        int NomberOfclinic = input.nextInt();
        int clinicFloor = input.nextInt();
        int yearOfAppointment = input.nextInt();
        int monthOfAppointment = input.nextInt();
        int dayOfAppointment = input.nextInt();
        int startTimeOfAppointment = input.nextInt();
        int IndexOfpatient = searchForPatient(patient, patientName);

        int IndexOFAppointmen = searchForAppointment(araay_Of_Appointment, patientName, NomberOfclinic, clinicFloor, monthOfAppointment, startTimeOfAppointment, yearOfAppointment, dayOfAppointment);
        output.println();
        output.println("------------------------------------------------------------------------------------------------------");
        output.println();
        output.println("COMMAND: RESERVE APPOINTMENT\n");
        if (IndexOfpatient != -1) {
            if (IndexOFAppointmen != -1) {
                Appointment aa = araay_Of_Appointment[IndexOFAppointmen];
                if (aa.isAvailable()) {
                    patient patien = patient[IndexOfpatient];
                    if (patien.getNumberOfAppointment() < 2) {

                        Clinic cc = aa.getClinic();
                        aa.setAvailable(patien.addappointment(cc, yearOfAppointment, monthOfAppointment, dayOfAppointment, startTimeOfAppointment));
                        output.println("Appointment for paitient " + patientName + " is done");
                    } else {
                        output.println("Appointment  for paitient " + patientName + " can not be added as he has 2 appointment  registered");
                    }
                } else {
                    output.println("Appointment is taken by other patient");
                }
            } else {
                output.println("Appointment  not found in the clinic appointment list");
            }

        } else {
            output.println("Patient " + patientName + " is not registered");
        }

    }

    
    // This  command  will  cancel a  particular  appointment of a patient based on the provided entry data 
    public static void cancelAppointment(Appointment[] araay_Of_Appointment, patient[] patient, Scanner input, PrintWriter output) {
        //CancelAppointment Adel_Mustafa 1 2 2020 3 12 17
//details of require parameters
        String patientName = input.next();
        int NumberOfclinic = input.nextInt();
        int clinicFloor = input.nextInt();
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        int startTime = input.nextInt();
        int IndexOfpatient = searchForPatient(patient, patientName);
        int IndexOFAppointmen = searchForAppointment(araay_Of_Appointment, patientName, NumberOfclinic, clinicFloor, month, startTime, year, day);
        output.println();
        output.println("\n------------------------------------------------------------------------------------------------------");
        output.println();
        output.println("COMMAND: CANCEL APPOINTMENT\n");
        if (IndexOfpatient != -1) {
            if (IndexOFAppointmen != -1) {

                patient pat = patient[IndexOfpatient];
                int index = pat.SearchappointmentAT(year, month, day, startTime);
                if (index != -1) {
                    Appointment aa = araay_Of_Appointment[IndexOFAppointmen];
                    aa.setAvailable(true);
                    pat.addappointment(null, 0, 0, 0, 0);
                    pat.setNumberOfAppointment(pat.getNumberOfAppointment() - 1);
                    output.println("Appointment for paitient " + patientName + " is Canceled \n"
                            + "Appointment is Canceled from the clinic appointment list and available for other patient");
                } else {
                    output.println("\n------------------------------------------------------------------------------------------------------");
                    output.println();
                    output.println("COMMAND: RESERVE APPOINTMENT\n");
                    output.println();
                    output.println("Appointment not found in paitient " + patientName + " records");
                }
            }

        } else {
            output.println("Patient " + patientName + " is not registered");
        }

    }

    
    // it is a saerch method for the Appointment 
    private static int searchForAppointment(Appointment[] araay_Of_Appointment, String name, int clinic_num, int clinic_floor, int month, int time, int year, int Day) {

        for (int i = 0; i < araay_Of_Appointment.length; i++) {
            if (time == araay_Of_Appointment[i].getAppointmentTime()
                    && clinic_num == araay_Of_Appointment[i].getClinic().getClinic_Number()
                    && clinic_floor == araay_Of_Appointment[i].getClinic().getClinic_Floor()
                    && month == araay_Of_Appointment[i].getMonth()
                    && Day == araay_Of_Appointment[i].getDay()
                    && year == araay_Of_Appointment[i].getYear()) {
                return i;
            }
        }
        return -1;
    }

    
    // it is a search method for the patient 
    private static int searchForPatient(patient[] patient, String name) {
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    
    //This command will print patient APPOINTMENTS record for a specific patient
    public static void printPatientRecord(patient[] patient, Scanner input, PrintWriter output) {

        output.println();
        output.println("\n------------------------------------------------------------------------------------------------------");
        output.println();
        output.println("COMMAND: PRINT PATIENT APPOINTMENTS RECORD\n");
        String name = input.next();
        int IndexOfpatient = searchForPatient(patient, name);
        if (IndexOfpatient == -1) {
            output.println("Patient " + name + " is not registered");
        } else {
            output.println("Appointment for " + name + " are: \n");
            patient pat = patient[IndexOfpatient];
            int numOfAppointment = pat.getNumberOfAppointment();
            if (numOfAppointment > 0) {
                for (int i = 0; i < pat.getNumberOfAppointment(); i++) {
                    if (pat.getappointmentAT(i) != " ") {
                        // .println("  Appointment number: " + (i + 1) + pat.getappointmentAT(i));
                        output.println("  Appointment number: " + (i + 1) + pat.getappointmentAT(i));
                    } else {
                        output.println("  Patient " + name + " has no appointent ");
                    }
                }
            } else {
                output.println("  Patient " + name + " has no appointent ");

            }

        }
    }
}
