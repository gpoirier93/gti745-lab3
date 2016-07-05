import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	
	public void serializeAddress(String location) {
		Address address = new Address();
		address.setStreet("wall street");
		address.setCountry("united state");
		
		try{
			FileOutputStream fout = new FileOutputStream(location);
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
