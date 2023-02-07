// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Arm;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArmBottom extends CommandBase {

  private final Arm m_arm;
  /** Creates a new ArmBottom. */
  public ArmBottom(Arm subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.

    m_arm = subsystem;
    addRequirements(m_arm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_arm.middleArm();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_arm.stopArm();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_arm.isAtSetPoint();
  }
}
