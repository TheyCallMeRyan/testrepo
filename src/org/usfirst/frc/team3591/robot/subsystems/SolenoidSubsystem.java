package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SolenoidSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static Solenoid solenoid;
	
	public SolenoidSubsystem() {
		solenoid = new Solenoid(RobotMap.SOLENOID_ID);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setOpen(boolean val){
    	solenoid.set(val);
    }
    
    public static void printSolenoid(){
    	System.out.println(solenoid.get());
    }
}

