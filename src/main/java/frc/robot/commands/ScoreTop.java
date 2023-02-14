// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Arm.ArmHome;
import frc.robot.commands.Arm.ArmTop;
import frc.robot.commands.Elevator.ElevatorHome;
import frc.robot.commands.Elevator.ElevatorTop;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Pneumatics;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ScoreTop extends SequentialCommandGroup {
  private final Elevator m_elevator = new Elevator();
  private final Pneumatics m_pneumatics = new Pneumatics();
  private final Arm m_arm = new Arm();

  /** Creates a new ScoreTop. */
  public ScoreTop() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new ElevatorTop(m_elevator)
        .andThen(new ArmTop(m_arm)
        .andThen(new TogglePiston(m_pneumatics)
        .andThen(new ArmHome(m_arm)
        .andThen(new TogglePiston(m_pneumatics)
        .andThen(new ElevatorHome(m_elevator))
        )))));
    // topElevator, topArm, togglePiston, retract arm, lower elevator (position
    // (0,0));
  }
}
