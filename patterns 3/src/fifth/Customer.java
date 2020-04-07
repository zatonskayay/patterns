package fifth;

public class Customer implements Solution.UseCustomer {
    String companyName;
    String countryName;

    public Customer(String companyName, String countryName) {
        this.companyName = companyName;
        this.countryName = countryName;
    }

    @Override
    public String getCompanyName() {
        return this.companyName;
    }

    @Override
    public String getCountryName() {
        return this.countryName;
    }

    public String toString() {
        return this.companyName + ", " + this.countryName;
    }
}
