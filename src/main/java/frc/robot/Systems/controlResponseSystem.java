package frc.robot.Systems;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.driveSystem;
import frc.robot.Systems.Swerve.swerveSystem;

import frc.robot.Constants;

public class controlResponseSystem {
    boolean isSwerve;
    boolean isMecanum;
    boolean isTank;

    XboxController controller1 = new XboxController(0);

    public controlResponseSystem(boolean swerve, boolean mecanum, boolean tank) {
        isSwerve = swerve;
        isMecanum = mecanum;
        isTank = tank;
        swerveSystem driveTrain = (isSwerve) ? new swerveSystem() : null;
        // TODO: Implement other drive systems.
        // mecanumSystem driveTrain = (isMecanum) ? new mecanumSystem() : null;
        // tankSystem driveTrain = (isTank) ? new tankSystem() : null;
    }

    public boolean checkForStickInput(){
        if(Math.abs(controller1.getRawAxis(0)) > Constants.DEADZONE){
            return true;
        }
        if(Math.abs(controller1.getRawAxis(1)) > Constants.DEADZONE){
            return true;
        }
        if(Math.abs(controller1.getRawAxis(2)) > Constants.DEADZONE){
            return true;
        }
        if(Math.abs(controller1.getRawAxis(3)) > Constants.DEADZONE){
            return true;
        }
        return false;
    }

    public void listenLoop(){
        if(checkForStickInput()){
            //TODO: Ask Matt how to implement.
            //driveTrain.drive();
        }
    }
}
