package Test2;

import lab6.DifferentialPilot;

public class test2 {

	public static void main(String[] args) {
		DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
		UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S3);
		pilot.forward();
		
		int i  = sonic.getDistance();
		
		if(i<10) {
			pilot.rotate(-90);
			sonic.getDistance();
		}
		
	}

}
