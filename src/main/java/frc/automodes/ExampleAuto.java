package frc.automodes;

import frc.commands.ExampleCommand;
import frc.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 * Example of a simple auto mode
 */

public class ExampleAuto extends CommandGroup {

    /**
     * Constructor for the auto mode
     * 
     * <p>If the ally switch is on the left, move to position 1000</p>
     * </p>If the ally switch is on the right, move to position 2000<p>
     *  
     * @param cascade Cascade Elevator subsystem
     */
	public ExampleAuto(ExampleSubsystem subsystem) {
		if(DriverStation.getInstance().getGameSpecificMessage().charAt(0) == 'L') {
			addSequential(new ExampleCommand(subsystem, 1000));
		} else {
            addSequential(new ExampleCommand(subsystem,2000));
			
		}
		
	}
	
}


