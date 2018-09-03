package frc;

import com.ctre.phoenix.ParamEnum;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.automodes.ExampleAuto;
import frc.subsystems.ExampleSubsystem;

/**
 * Example of a simple robot class
 */

public class ExampleRobot extends IterativeRobot {

  Joystick gamepad;
  
	WPI_TalonSRX talon;

  ExampleSubsystem subsystem;

	SendableChooser<Command> autoChooser;

  /**
   * Constructor for Example Robot
   * 
   * <p>Initializes the subsystems, talons and gamepad</p>
   */
	public ExampleRobot() {
		
		gamepad = new Joystick(0);
	
		talon = new WPI_TalonSRX(1);
    
    subsystem = new ExampleSubsystem(talon);
		
	}

  /**
   * Creates the auto mode chooser
   */
	@Override
	public void robotInit() {
		
		autoChooser = new SendableChooser<Command>();
		autoChooser.addDefault("Example Auto", new ExampleAuto(subsystem));
		SmartDashboard.putData("Select Autonomous Mode", autoChooser);
		
	}

  /**
   * Configs the talon for teleop mode
   */
	public void teleopInit() {
		
		talon.configSetParameter(ParamEnum.eOnBoot_BrakeMode, 0.0, 0, 0, 0);
		

	}

  /**
   * Teleop control for driver
   */
	public void teleopPeriodic() {
    
    if (gamepad.getRawAxis(0) > 0.1) {
      talon.set(ControlMode.PercentOutput, gamepad.getRawAxis(0));
    }
    if (gamepad.getRawAxis(0) < -0.1) {
      talon.set(ControlMode.PercentOutput, gamepad.getRawAxis(0));
    }
    
	}

  /**
   * Disables the talon and removes all commands
   */
	public void disabledInit() {

		talon.set(ControlMode.Current, 0);
		Scheduler.getInstance().removeAll();
  
  }

  /**
   * Adds the example auto mode to Scheduler
   */
	public void autonomousInit() {

	Scheduler.getInstance().add(new ExampleAuto(subsystem));

	}

  /**
   *  Runs the Scheduler
   */
	public void autonomousPeriodic(){

		Scheduler.getInstance().run();

  }

  
	@Override
	public void testInit() {

	}

	@Override
	public void testPeriodic() {

  }
  
}
