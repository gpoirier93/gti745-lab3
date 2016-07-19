import java.io.Serializable;

public class Song implements Serializable {
	private static final long serialVersionUID = -1071420897987798926L;
	
	public int numPitches = 88;
	public int numBeats = 128;
	public boolean [][] grid;
	public int sleepTimeInMS;
	
	public String [] namesOfPitchClasses;
	public boolean [] pitchClassesInMajorScale;
	public boolean [] pitchClassesToEmphasizeInMajorScale;
}
