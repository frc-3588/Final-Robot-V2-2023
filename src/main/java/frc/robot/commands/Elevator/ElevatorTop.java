// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Elevator;
import frc.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ElevatorTop extends CommandBase {

  private Elevator m_elevator;
  /** Creates a new ElevatorTop. */
  public ElevatorTop(Elevator subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_elevator = subsystem;
    addRequirements(m_elevator);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_elevator.topElevator();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_elevator.stopElevator();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_elevator.isAtSetPoint();
  }
}
