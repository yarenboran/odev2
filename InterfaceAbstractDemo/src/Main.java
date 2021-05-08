import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {
public static void main(String[] args) throws RemoteException{
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
		Long.parseLong("19760699999"),
		"YAREN",
		"BORAN",
		2001);
		System.out.println("doðrulama : " + (result ? "baþarýlý" : "baþarýsýz"));
		
		
		
		
		

	}

}
