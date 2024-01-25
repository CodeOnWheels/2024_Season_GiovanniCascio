package frc.robot.Systems;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Systems.Swerve.swerveSystem;
import frc.robot.Systems.Vision.vision;

public class controlResponseSystem {
    double xVelocity;
    double yVelocity;
    double rotation_angle;

    swerveSystem swerve = new swerveSystem();
    vision camera1 = new vision();
    XboxController controller1 = new XboxController(0);

    public void approachAprilTag(){
        swerve.drive(camera1.getOffset(), camera1.getDistance(), 0);
    }

    public void teleop(){
        swerve.drive(controller1.getRawAxis(0), controller1.getRawAxis(1), controller1.getRawAxis(2));
    }
}
