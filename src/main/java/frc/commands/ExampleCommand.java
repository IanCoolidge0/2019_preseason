package frc.commands;

import frc.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *  Example of a command
 * 
 * <p>
 * A simple command that moves the example subsystem to the given position
 */
public class ExampleCommand extends Command {

	ExampleSubsystem subsystem;
	private int position;
    
    /**
     * Constructor for creating the example command
     * 
     * @param subsystem Example Subsystem
     * @param position Position that you want the subsystem to move to
     */
    public ExampleCommand(ExampleSubsystem subsystem, int position) {
    	requires(subsystem);
        this.subsystem = subsystem;
        this.position = position;
    }

    /**
     * Sets the talon encoder to zero
     */
    protected void initialize() {
    	subsystem.zeroSensors();
    }

    /**
     *  Sets the velocity of the subsystem to 10
     */
    protected void execute() {
    	subsystem.setVelocity(10);
    }

    
    /**
     * Determines whether the subsystem has traveled to the given position
     */
    protected boolean isFinished() {
        return Math.abs(subsystem.position() - position) < 20;
    }

    /**
     * Stops the subsystem
     */
    protected void end() {
    	subsystem.stop();

    }

    /**
     * Calls end() when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}
