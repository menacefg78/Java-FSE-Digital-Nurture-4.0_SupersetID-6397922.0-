public class DITest {
    public static void main(String[] args) {
        // Create repository (dependency)
        CustomerRepository repo = new CustomerRepositoryImpl();

        // Inject into service
        CustomerService service = new CustomerService(repo);

        // Use service
        service.getCustomerDetails("C123");
    }
}

