package fifth;

import java.util.*;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(
                new IncomeData("UA", "JavaRush Ltd.", "Ivan", "Ivanov", 38, 501234567));

        Customer customer = new Customer(incomeDataAdapter.getCompanyName(), incomeDataAdapter.getCountryName());
        System.out.println("Customer: " + customer);

        Contact contact = new Contact(incomeDataAdapter.getName(), incomeDataAdapter.getPhoneNumber());
        System.out.println("Contact: " + contact);
    }


    public interface UseIncomeData {
        String getCountryCode();
        String getCompany();
        String getContactFirstName();
        String getContactLastName();
        int getCountryPhoneCode();
        int getPhoneNumber();
    }

    public interface UseCustomer {
        String getCompanyName();
        String getCountryName();
    }

    public interface UseContact {
        String getName();
        String getPhoneNumber();
    }

    public static class IncomeDataAdapter implements UseCustomer, UseContact {
        IncomeData incomeData;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.incomeData = incomeData;
        }

        @Override
        public String getCompanyName() {
            return this.incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(this.incomeData.getCountryCode());
        }

        @Override
        public String getName() {
            return this.incomeData.getContactLastName() + ", " + this.incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            return "+" + this.incomeData.getCountryPhoneCode() + "(0" + this.incomeData.getPhoneNumber() / 10000000 + ")" + this.incomeData.getPhoneNumber() % 10000000;
        }

    }
}