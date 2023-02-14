// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Arm.ArmBottom;
import frc.robot.commands.Arm.ArmHome;
import frc.robot.commands.Elevator.ElevatorBottom;
import frc.robot.commands.Elevator.ElevatorHome;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Pneumatics;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ScoreMiddle extends SequentialCommandGroup {
  private final Elevator m_elevator = new Elevator();
  private final Pneumatics m_pneumatics = new Pneumatics();
  private final Arm m_arm = new Arm();

  /** Creates a new Score. */
  public ScoreMiddle() {

    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
        new ElevatorBottom(m_elevator)
            .andThen(new ArmBottom(m_arm)
                .andThen(new TogglePiston(m_pneumatics)
                    .andThen(new ArmHome(m_arm)
                        .andThen(new TogglePiston(m_pneumatics)
                            .andThen(new ElevatorHome(m_elevator)))))));
    // topElevator, topArm, togglePiston, retract arm, lower elevator (position
    // (0,0));
  }

  // bottomElevator, middleArm, togglePiston, retract arm, lower elevator
  // (position (0,0))

}
