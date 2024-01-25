package frc.robot.Systems;

import frc.robot.Systems.Swerve.swerveSystem;

public class controlResponseSystem {
    swerveSystem swerve = new swerveSystem();

    public void swerveCommand(double xVelocity, double yVelocity, double rotation_angle){
        swerve.drive(xVelocity, yVelocity, rotation_angle);
    }
}
