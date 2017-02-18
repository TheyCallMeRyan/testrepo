
package org.usfirst.frc.team3591.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team3591.robot.commands.MoveMotors;
import org.usfirst.frc.team3591.robot.commands.SolenoidCommand;
import org.usfirst.frc.team3591.robot.subsystems.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static final Motors motors = new Motors();
	public static final MoveMotors moveMotors = new MoveMotors();
	public static final SolenoidSubsystem solenoidSubsystem = new SolenoidSubsystem();
	public static OI oi;

    Command autonomousCommand;

    public void robotInit() {
		oi = new OI();
		CameraServer.getInstance().startAutomaticCapture();
    }

    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        moveMotors.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
