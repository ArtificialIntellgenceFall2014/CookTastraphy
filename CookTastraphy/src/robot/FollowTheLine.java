package robot;
import lejos.nxt.*;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

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