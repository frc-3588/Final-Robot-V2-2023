// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants.JoystickConstants;
import frc.robot.subsystems.Elevator;

public class Earl extends CommandBase {
Elevator m_Elevator; 
  /** Creates a new Earl. */
  public Earl(Elevator elevator) {
    // Use addRequirements() here to declare subsystem dependencies.
  m_Elevator = elevator;
  addRequirements(m_Elevator);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // m_Elevator.setHome();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // m_Elevator.setElevatorPower(-1 * RobotContainer.getInstance().getOperator().getRawAxis(JoystickConstants.kLeftStickY)*.5);
    
    // double Joystick = -1 * RobotContainer.getInstance().getOperator().getRawAxis(JoystickConstants.kLeftStickY)*.4;

    double Joystick = 0;

    if(RobotContainer.getInstance().getOperator().getRawAxis(JoystickConstants.kLeftStickY) < 0){
      Joystick = -1 * RobotContainer.getInstance().getOperator().getRawAxis(JoystickConstants.kLeftStickY)*.45;

    }
    else{
      Joystick = -1 * RobotContainer.getInstance().getOperator().getRawAxis(JoystickConstants.kLeftStickY)*.1;
    }
    
    if(Math.abs(Joystick) > .05)
    {
      m_Elevator.setElevatorPower(Joystick);
    }
    else
    {
      m_Elevator.setElevatorPower(.05);
    }
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
