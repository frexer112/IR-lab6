package Test3;

import lab6.DifferentialPilot;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoundSensor ss = new SoundSensor(SensorPort.S1);
		DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
		
		int i = ss.readValue();
		
		if(i<5) 
		{
			pilot.rotate(360);
			ss.readValue();
		}
	
		Sound.beep();
		pilot.stop();

		 
	}

}
