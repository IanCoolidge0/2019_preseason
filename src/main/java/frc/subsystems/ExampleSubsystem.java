package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ExampleSubsystem extends Subsystem{

	public WPI_TalonSRX talon;


	public ExampleSubsystem(WPI_TalonSRX talon) {
		this.talon = talon;
	}



	public void setVelocity(double speed) {
		talon.set(ControlMode.Velocity, speed);

	}

	public void stop() {
		talon.set(ControlMode.Current, 0.0);
	}

	public void zeroSensors() {
		talon.setSelectedSensorPosition(0, 0, 10);
    }
    
    public int position() {
        return talon.getSelectedSensorPosition(0);
    }

	protected void initDefaultCommand() {

	}

}