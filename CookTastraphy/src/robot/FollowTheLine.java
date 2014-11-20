package robot;
import lejos.nxt.*;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

public class FollowTheLine 
{
	
	private static final RegulatedMotor 	
	leftMotor  = Motor.A, rightMotor = Motor.C;
	
	private static final double 
	wheelDiameter = 2.1f, trackWidth = 4.4f;
	
	private static final SensorPort 		
	colorSensorPort = SensorPort.S3;
	
	private static final int 				
	colorThreshold = 200;
	
	public static void main(String[] args)
	{
		ColorSensor color = new ColorSensor(colorSensorPort);
		DifferentialPilot pilot = new DifferentialPilot(wheelDiameter, trackWidth, leftMotor, rightMotor);
		//color.setFloodlight(true);
		boolean turn;
		color.setFloodlight(true);
		while(!Button.ENTER.isPressed()) 
		{
			pilot.setTravelSpeed(5);
			ColorSensor.Color currentColor = color.getColor();
			//LCD.drawString(currentColor.toString(),0,0);
			turn = currentColor.getRed() < colorThreshold || currentColor.getGreen() < colorThreshold || currentColor.getBlue() < colorThreshold;
			LCD.drawString(turn?"turn":"no turn", 0, 0);
			if(turn) 
			{
				pilot.forward();
			}
			else 
			{
				pilot.rotate(15);
			}
		}
		
		color.setFloodlight(false);
	}
}