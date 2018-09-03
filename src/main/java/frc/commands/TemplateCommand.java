package frc.commands;

import edu.wpi.first.wpilibj.command.Command;


public class TemplateCommand extends Command {

    // Create the required variables
	
    public TemplateCommand() {
        // Use requires(subsystems) here to declare subsystem dependencies
        // eg. requires(driveTrain);
        // Initialize the necessary variable required for the command
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//eg. swapping gears or resetting sensors
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//eg. setting the velocity for talons
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Called repeatly to check whether the end condition is meet
        // eg. check whether the robot has traveled 10 feet
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//eg. set the velocity to zero
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
