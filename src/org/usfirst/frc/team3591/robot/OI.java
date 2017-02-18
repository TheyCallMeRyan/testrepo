package org.usfirst.frc.team3591.robot;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3591.robot.commands.MoveMotors;
import org.usfirst.frc.team3591.robot.commands.SolenoidCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static CANTalon cimMotor;
	public static CANTalon winMotor;
	public static DigitalInput lim1;
	public static DigitalInput lim2;
	public static Joystick stick1;
	public static Button solenoidButton;
	
	public static int direction=-1;
	
	public OI(){
		cimMotor = new CANTalon(RobotMap.MINI_CIM_MOTOR_ID);
		winMotor = new CANTalon(RobotMap.WINMOTOR_ID);
		lim1 = new DigitalInput(RobotMap.LIM1_ID);
		lim2 = new DigitalInput(RobotMap.LIM2_ID);
		stick1 = new Joystick(RobotMap.JOYSTICK_ID);
		solenoidButton=new JoystickButton(stick1, RobotMap.SOLENOID_BUTTON);
		solenoidButton.whileHeld(new SolenoidCommand());
	}
	
	public void spinCIM(){
		double x=0;
		if(stick1.getX()>.03){
			x=stick1.getX();
		}else if(stick1.getX()<.03){
			x=stick1.getX();
		}
		cimMotor.set(x*direction*.2);
	}
	public void winMotor(){
		if(!lim1.get()){
			direction=-1;
		}else if(!lim2.get()){
			direction=1;
		}
		winMotor.set(.2*direction);
	}
}

