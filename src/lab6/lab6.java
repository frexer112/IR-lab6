package lab6;

public class lab6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SoundSensor ss = new SoundSensor();
			Ultrasonicsensor us = new Ultrasonicsensor();
			DifferentialPilot pilot = new DifferentialPilot(5.6f,13.5f);
			pilot.setTravelSpeed(20);
			pilot.setRotateSpeed(40);
			Behavior b1 = new BehaviorSound(ss, pilot);
			Behavior b2 = new BehaviorUltras(us, pilot);
			Behavior b3 = new BehaviorForward(pilot);
			Behavior[] bArray = { b1, b2, b3 };
			Arbitrator arby = new Arbitrator(bArray);
			arby.start();
			


	}

}
