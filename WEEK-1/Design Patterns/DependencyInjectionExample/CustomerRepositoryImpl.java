public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // In real apps, this would query a DB
        return "Customer{id='" + id + "', name='Alice'}";
    }
}

