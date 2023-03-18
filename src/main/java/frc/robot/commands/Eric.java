package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants.JoystickConstants;
import frc.robot.subsystems.Arm;

public class Eric extends CommandBase {
    Arm m_Arm; 
      /** Creates a new Earl. */
      public Eric(Arm arm) {
        // Use addRequirements() here to declare subsystem dependencies.
      m_Arm = arm;
      addRequirements(m_Arm);
      }
    
      // Called when the command is initially scheduled.
      @Override
      public void initialize() {
        m_Arm.setHome();
      }
    
      // Called every time the scheduler runs while the command is scheduled.
      @Override
      public void execute() {
        m_Arm.setArmPower(-1 * RobotContainer.getInstance().getOperator().getRawAxis(JoystickConstants.kRightStickX)*.75);
    }
      
    
      // Called once the command ends or is interrupted.
      @Override
      public void end(boolean interrupted) {}
    
      // Returns true when the command should end.
      @Override
      public boolean isFinished() {
        return false;
      }
    }