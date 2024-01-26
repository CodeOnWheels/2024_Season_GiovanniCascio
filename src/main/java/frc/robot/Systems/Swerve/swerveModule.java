package frc.robot.Systems.Swerve;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;

public class swerveModule {

    CANSparkMax driveMotor = null;
    CANSparkMax turnMotor = null;
    RelativeEncoder encoder = null;

    double encoderOffset;

    PIDController pid = new PIDController(0, 0, 0);

    public swerveModule(int driveID, int turnID){
        CANSparkMax driveMotor = new CANSparkMax(driveID, MotorType.kBrushless);
        CANSparkMax turnMotor = new CANSparkMax(turnID, MotorType.kBrushless);

        RelativeEncoder encoder = turnMotor.getEncoder();
    }

    public double getAngle(){
        return encoder.getPosition();
    }

    public void setState(double angle, double speed){
        turnMotor.set(pid.calculate(getAngle(), angle));
        driveMotor.set(speed);
    }

    public void stop(){
        driveMotor.set(0);
        turnMotor.set(0);
    }
}
