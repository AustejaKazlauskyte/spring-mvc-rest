package guru.springframework.springmvcrest.bootstrap;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class BootStrapData implements CommandLineRunner {

  private final CustomerRepository customerRepository;

  public BootStrapData(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    System.out.println("Loading Customer Data");

    Customer c1 = new Customer();
    c1.setFirstname("Michale");
    c1.setLastname("Weston");
    customerRepository.save(c1);

    Customer c2 = new Customer();
    c2.setFirstname("Sam");
    c2.setLastname("Axe");
    customerRepository.save(c2);

    Customer c3 = new Customer();
    c3.setFirstname("Fiona");
    c3.setLastname("Glennann");
    customerRepository.save(c3);

    System.out.println("Customers Saved: " + customerRepository.count());
  }
}
