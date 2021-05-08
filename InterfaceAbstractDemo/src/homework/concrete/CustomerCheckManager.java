package homework.concrete;

import homework.abstracts.CustomerCheckService;
import homework.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
