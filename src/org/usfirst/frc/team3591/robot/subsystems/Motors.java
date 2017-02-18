package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Motors extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static void spinMotors(){
    	Robot.oi.winMotor();
    	Robot.oi.spinCIM();
    }
}

