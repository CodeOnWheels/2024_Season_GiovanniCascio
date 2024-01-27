package frc.robot.Systems.Swerve;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import frc.robot.driveSystem;

import frc.robot.Constants;

public class swerveSystem implements driveSystem{

    swerveModule module1 = new swerveModule(1, 2);
    swerveModule module2 = new swerveModule(3, 4);
    swerveModule module3 = new swerveModule(5, 6);
    swerveModule module4 = new swerveModule(7, 8);

    public double getMotorVelocity(boolean isPositive, double joystickValue, double chassisDimension, double r){
        // The second term positive or negative.
        if (isPositive) {
            return joystickValue + (chassisDimension * r);
        } else {
            return joystickValue - (chassisDimension * r);
        }
    }

    public double getMotorAngle(double xVelocity, double yVelocity, double r){
        // Insert equation
        return Math.atan(yVelocity / (xVelocity + 0.000001)) - r;
    }
    
    public double getMotorSpeeds(double xVelocity, double yVelocity) {
        // Insert equation
        return Math.sqrt((Math.pow(xVelocity, 2)) + (Math.pow(yVelocity, 2)));
    }

    @Override
    public void drive(double x, double y, double r) {
        // Insert correct parameters
        module1.setState(getMotorAngle(getMotorVelocity(false, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(true, y, Constants.CHASSISLENGTHRADIUS, r), r), getMotorSpeeds(getMotorVelocity(false, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(true, y, Constants.CHASSISLENGTHRADIUS, r)));
        module2.setState(getMotorAngle(getMotorVelocity(false, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(false, y, Constants.CHASSISLENGTHRADIUS, r), r), getMotorSpeeds(getMotorVelocity(false, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(false, y, Constants.CHASSISLENGTHRADIUS, r)));
        module3.setState(getMotorAngle(getMotorVelocity(true, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(false, y, Constants.CHASSISLENGTHRADIUS, r), r), getMotorSpeeds(getMotorVelocity(true, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(false, y, Constants.CHASSISLENGTHRADIUS, r)));
        module4.setState(getMotorAngle(getMotorVelocity(true, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(true, y, Constants.CHASSISLENGTHRADIUS, r), r), getMotorSpeeds(getMotorVelocity(true, x, Constants.CHASSISWIDTHRADIUS, r), getMotorVelocity(true, y, Constants.CHASSISLENGTHRADIUS, r)));
    }

    @Override
    public void stop() {
        module1.stop();
        module2.stop();
        module3.stop();
        module4.stop();
    }
}
