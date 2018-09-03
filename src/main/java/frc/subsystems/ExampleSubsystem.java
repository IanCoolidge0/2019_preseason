package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * Example of a subsystem
 * 
 * <p>A simple subsystem with a single talon</p>
 */
public class ExampleSubsystem extends Subsystem{

	public WPI_TalonSRX talon;

    /**
     * Constructor for the example Subsystem
     * 
     * @param talon the example subsystem talon
     */
	public ExampleSubsystem(WPI_TalonSRX talon) {
		this.talon = talon;
	}


    /**
     * Sets the velocity for the talon
     * 
     * @param speed Given in units of the control mode velocity
     */
	public void setVelocity(double speed) {
		talon.set(ControlMode.Velocity, speed);

	}

    /**
     * Stops the talon
     */
	public void stop() {
		talon.set(ControlMode.Current, 0.0);
	}

    /**
     * Zeros the talon encoder position
     */
	public void zeroSensors() {
		talon.setSelectedSensorPosition(0, 0, 10);
    }
    
    /**
     * Gets the talon encoder position
     * @return the position in encoder ticks
     */
    public int position() {
        return talon.getSelectedSensorPosition(0);
    }

    /**
     * No default command for example subsystem
     */
	protected void initDefaultCommand() {
	}

}