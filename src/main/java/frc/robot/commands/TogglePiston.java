// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TogglePiston extends CommandBase {

  private Pneumatics m_pneumatics;
  /** Creates a new TogglePiston. */
  public TogglePiston(Pneumatics subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_pneumatics = subsystem;
    addRequirements(m_pneumatics);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_pneumatics.togglePiston();
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
