//package frc.robot.Systems; 
//making the systems a package might be valuable so definitely something worth trying but I'm going to ignore this for now

// import frc.robot.Systems.Swerve.swerveSystem;
// this won't be necessary and I'll show you with the version of this that I think fits best with the way you're thinking
/* The below is generally ok but let me show you a different way you can do it
    This is tightly coupled to the swerve system... meaning that if you change the serve system naming etc... then you have to also change this code
    Insead you can make this into a class that can be inherited from... then swerve or mecannum can inherit from it
public class controlResponseSystem {
    swerveSystem swerve = new swerveSystem();

    public void swerveCommand(double xVelocity, double yVelocity, double rotation_angle){
        swerve.drive(xVelocity, yVelocity, rotation_angle);
    }
}
*/
abstract class ControlResponseSystem 
{
    //properties
    public char systemType = ''; //this is used to identify what type of drive system... possibly more useful for humand than for the system
    public char currentMode = 'teleop';//default to teleop unless it's autonomous ... this is more an example property than one I think we need
    //methods

    public int drive(xVelocity, yVelocity, rotationAngle){}; //possibly return an int to indicate an error state? Just have it there so it's something we could think about, though if we wanted to get serious about it might be best to return an error object... 
    public void stop();
    public void defend();// defend is more likely to go into an automated system which would produce commands to pass to the control/command response system of the drive system
}
