import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JFileChooser;

public class Deserializer {
	
	JFileChooser fileChooser;
	
	public Deserializer() {
		fileChooser = new JFileChooser();
	}
	
	public Score deserialzeAddress(String location){
		Score score;
		Song song;
		try{	    
			FileInputStream fin = new FileInputStream(location);
			ObjectInputStream ois = new ObjectInputStream(fin);
			song = (Song) ois.readObject();
			ois.close();
			
			score = new Score();
			score.grid = song.grid;
			score.namesOfPitchClasses = song.namesOfPitchClasses;
			score.numBeats = song.numBeats;
			score.numPitches = song.numPitches;
			score.pitchClassesInMajorScale = song.pitchClassesInMajorScale;
			score.pitchClassesToEmphasizeInMajorScale = song.pitchClassesToEmphasizeInMajorScale;
			score.currentSleepTimeMS = song.sleepTimeInMS;
			
			return score;   
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		} 
	} 
	
}
