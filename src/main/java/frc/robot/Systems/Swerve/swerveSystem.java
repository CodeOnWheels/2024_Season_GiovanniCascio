package frc.robot.Systems.Swerve;

import frc.robot.driveSystem;

public class swerveSystem implements driveSystem{

    swerveModule module1 = new swerveModule(1, 2);
    swerveModule module2 = new swerveModule(3, 4);
    swerveModule module3 = new swerveModule(5, 6);
    swerveModule module4 = new swerveModule(7, 8);

    public double getMotorVelocities(){
        // Insert equation
        return 0;
    }

    public double getMotorAngle(){
        // Insert equation
        return 0;
    }
    
    public double getMotorSpeeds() {
        // Insert equation
        return 0;
    }

    @Override
    public void drive(double x, double y, double r) {
        // Insert correct parameters
        module1.setState(getMotorAngle(), getMotorSpeeds());
        module2.setState(getMotorAngle(), getMotorSpeeds());
        module3.setState(getMotorAngle(), getMotorSpeeds());
        module4.setState(getMotorAngle(), getMotorSpeeds());
    }

    @Override
    public void stop() {
        module1.stop();
        module2.stop();
        module3.stop();
        module4.stop();
    }

    
    
}
