package frc;

import edu.wpi.first.wpilibj.IterativeRobot;
//Import all the required subsystems, commands, automodes, etc.

public class Robot extends IterativeRobot {

    //Create the required variables such as talons, subsystems, joysticks, camera
	
    //Robot Constructor
    //Initialize all the variables
	public Robot() {
        
	}
    // Called once when the robot is deployed
    // Use for things such as setting up the cameras
    
    @Override
	public void robotInit() {
        
		
	}
    
    // Called once when the teleop mode starts
    // Use for things such as initializing the joystick control       
	public void teleopInit() {

	}

    //Called repeatly until teleOp mode is finished
	public void teleopPeriodic() {
        

	}

    //Called once when the robot is disabled
	public void disabledInit() {

    }
    

    //Called once when the auto mode starts
    //Use for things such  initializing PID and the auto mode
	public void autonomousInit() {
        //To initialize the auto mode use Scheduler.getInstance().add(automode)
		
	}

    //Called repeatly until auto mode is finished
	public void autonomousPeriodic(){
        // To run the auto mode, call Scheduler.getInstance().run()
	}

    
    //Called once when the robot enters test mode
    //Used for testing autonomousInit() or teleopInit()
    @Override
	public void testInit() {

	}

    //Called repeatly until test mode is finished
    //Used for testing autonomousPeriodic() or telopPeriodic()
	@Override
	public void testPeriodic() {

	}
}
