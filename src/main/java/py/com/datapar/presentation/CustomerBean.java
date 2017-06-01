package py.com.datapar.presentation;

import py.com.datapar.model.Customer;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CustomerBean {
    private List<Customer> customers;
    private List<Customer> filteredCustomers;

    public List<Customer> getFilteredCustomers() {
        return filteredCustomers;
    }

    public void setFilteredCustomers(List<Customer> filteredCustomers) {
        this.filteredCustomers = filteredCustomers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @PostConstruct
    public void setup()  {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        customer1.setCustomerId(123456);

        customers.add(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Adam");
        customer2.setLastName("Scott");
        customer2.setCustomerId(98765);

        customers.add(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Jane");
        customer3.setLastName("Doe");
        customer3.setCustomerId(65432);

        customers.add(customer3);
        this.customers = customers;
    }
}
