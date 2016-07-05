import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	
	public void serialize(String location, Score score) {
		Song song = new Song();
		song.grid = score.grid;
		song.namesOfPitchClasses = score.namesOfPitchClasses;
		song.numBeats = score.numBeats;
		song.numPitches = score.numPitches;
		song.pitchClassesInMajorScale = score.pitchClassesInMajorScale;
		song.pitchClassesToEmphasizeInMajorScale = score.pitchClassesToEmphasizeInMajorScale;
		
		try{
			FileOutputStream fout = new FileOutputStream(location);
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject(song);
			oos.close();
			System.out.println("Done");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
