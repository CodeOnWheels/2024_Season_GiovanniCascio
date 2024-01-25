package frc.robot.Systems.Swerve;

import 
//oops should have changed it to ControlResponseSystem
public class swerveSystem extends controlResponseSystem{ //extending it means it will automatically get the properties & methods defined in the parent... but in our case the parent isn't actually doing anyhting with the drive() method...

    //the below needs to be done in a constructor or simple factory method.
    swerveSystem()
    {
        //even better would be to pass a configuration data structure that it uses to build the right objects... but this is currently fine for our purposes
        swerveModule module1 = new swerveModule(1, 2); 
        swerveModule module2 = new swerveModule(3, 4); 
        swerveModule module3 = new swerveModule(5, 6);
        swerveModule module4 = new swerveModule(7, 8);
    }

    //so this is good, it would implement the drive system to do what serve needs it to instead of macanum etc...
    public void drive(double xVelocity, double yVelocity, double rotation_angle){
        
    }

    public void stop(){

    }

    //as mentioned in the parent class this would be better defined in some autonomous system instead of here.. then that atonomous system would send commands to the drive system to do move/drive
    public void defend(){
        
    }
}
