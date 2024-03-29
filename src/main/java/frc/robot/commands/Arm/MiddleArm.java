// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Arm;
import frc.robot.Constants.ArmConstants;
import frc.robot.subsystems.Arm;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class MiddleArm extends CommandBase {
  
  private final Arm m_Arm;

  /** Creates a new MiddleArm. */
  public MiddleArm(Arm subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_Arm = subsystem;
    addRequirements(m_Arm);
  
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Arm.middleArm();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_Arm.isAtSetPoint(ArmConstants.middlePIDReference);
  }
}
