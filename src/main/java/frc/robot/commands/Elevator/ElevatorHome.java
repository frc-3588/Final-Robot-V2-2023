// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Elevator;


public class ElevatorHome extends CommandBase {

  private final Elevator m_Elevator;
  /** Creates a new ElevatorHome. */
  public ElevatorHome(Elevator subsystem) {
    
    m_Elevator = subsystem;
    addRequirements(m_Elevator);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // m_Elevator.setHome();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    // m_Elevator.isElevatorSetpoint();
  }
}
