package frc.robot.Systems;

import frc.robot.Systems.Swerve.swerveSystem;

public class controlResponseSystem {
    double xVelocity;
    double yVelocity;
    double rotation_angle;

    swerveSystem swerve = new swerveSystem();

    public void input(double x, double y, double r){
        swerve.drive(x, y, r);
    }
}
