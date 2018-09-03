package frc.automodes;

import frc.commands.ExampleCommand;
import frc.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 * Example of an auto mode
 */

public class ExampleAuto extends CommandGroup {

    /**
     * Constructor for the auto mode
     * 
     * <p>
     * If the ally switch is on the left, move 100 units
     * </p>
     * </p>
     * If the ally switch is on the right, move 200 units
     * <p>
     * 
     * @param cascade Cascade Elevator subsystem
     */
	public ExampleAuto(ExampleSubsystem subsystem) {
		if(DriverStation.getInstance().getGameSpecificMessage().charAt(0) == 'L') {
			addSequential(new ExampleCommand(subsystem, 100));
		} else {
            addSequential(new ExampleCommand(subsystem,200));
			
		}
		
	}
	
}


