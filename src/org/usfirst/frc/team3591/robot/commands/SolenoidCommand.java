package org.usfirst.frc.team3591.robot.commands;

import org.usfirst.frc.team3591.robot.Robot;
import org.usfirst.frc.team3591.robot.subsystems.SolenoidSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SolenoidCommand extends Command {

    public SolenoidCommand() {
    	Robot.solenoidSubsystem.setOpen(true);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.solenoidSubsystem.setOpen(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.solenoidSubsystem.setOpen(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
