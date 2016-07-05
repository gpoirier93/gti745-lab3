import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;

public class Deserializer {
	
	JFileChooser fileChooser;
	
	public Deserializer() {
		fileChooser = new JFileChooser();
	}
	
	public Address deserialzeAddress(String location){
		Address address;		 
		try{	    
			FileInputStream fin = new FileInputStream(location);
			ObjectInputStream ois = new ObjectInputStream(fin);
			address = (Address) ois.readObject();
			ois.close();
			
			return address;   
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		} 
	} 
	
}
