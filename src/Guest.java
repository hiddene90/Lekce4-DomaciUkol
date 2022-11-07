import java.time.LocalDate;

public class Guest {
     String firstName;
     String lastname;
     LocalDate dateOfBirth;

    public Guest(String firstName, String lastname, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }
    ///region
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    ///endregion
    public String getDescription(){
      return "Jméno hosta: "+firstName+" "+lastname+"\n"+"Datum narození: "+dateOfBirth.getDayOfMonth()+"."+ dateOfBirth.getMonthValue()+"."+ dateOfBirth.getYear();
    }
}
