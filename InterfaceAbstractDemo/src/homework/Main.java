package homework;

import java.time.LocalDate;


import homework.abstracts.BaseCustomerManager;
import homework.concrete.StarbucksCustomerManager;
import homework.entities.Customer;
import homework.adapters.MernisServiceAdapter;



public class Main {
	
	public static void main(String[] args) {
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	customerManager.save(new Customer(1, "Yaren", "Boran", "19760699999", LocalDate.of(2001, 8, 10)));
}

	
	

	
	


	

}
