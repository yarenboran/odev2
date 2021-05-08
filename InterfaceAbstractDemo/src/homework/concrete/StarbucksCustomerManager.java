package homework.concrete;

import homework.abstracts.BaseCustomerManager;
import homework.abstracts.CustomerCheckService;
import homework.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {


	public StarbucksCustomerManager(CustomerCheckService CustomerCheckService) {
		super();
		this.CustomerCheckService = CustomerCheckService;

}
	
	private CustomerCheckService CustomerCheckService;
	
	@Override
public void save(Customer customer) {
		
		if(CustomerCheckService.CheckIfRealPerson(customer)) {
			
			this.save(customer);
			System.out.println("Person verified");
			
		}else {
			
			System.out.println("Not a valid person");
		}
			
		}
	
	
	
}
