package fifth;

public class IncomeData implements Solution.UseIncomeData {

    String countryCode;
    String company;
    String firstName;
    String lastName;
    int phoneCode;
    int phoneNumber;

    public IncomeData(String countryCode, String company, String firstName, String lastName, int phoneCode, int phoneNumber) {
        this.countryCode = countryCode;
        this.company = company;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneCode = phoneCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public String getContactFirstName() {
        return this.firstName;
    }

    @Override
    public String getContactLastName() {
        return this.lastName;
    }

    @Override
    public int getCountryPhoneCode() {
        return phoneCode;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

}