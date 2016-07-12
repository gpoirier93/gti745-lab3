import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;

public class TempoThread extends Thread {
	
	public int currentSleepTimeMS;
	
	@Override
	public void run() {
		try {
			Synthesizer syn = MidiSystem.getSynthesizer();
        	syn.open();
        	Instrument[] instr = syn.getDefaultSoundbank().getInstruments();
        	syn.loadInstrument(instr[115]);
        	final MidiChannel[] mc = syn.getChannels();
			while (true) {
				System.out.println("play");
				mc[9].noteOn(60,600);
				this.sleep(currentSleepTimeMS);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
