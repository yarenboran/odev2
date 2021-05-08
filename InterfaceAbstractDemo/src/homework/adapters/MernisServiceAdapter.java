package homework.adapters;

import java.rmi.RemoteException;

import homework.abstracts.CustomerCheckService;
import homework.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	
	
	public boolean ChackIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getdateOfBirth().getYear());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}

		return result;
	
		
	
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
