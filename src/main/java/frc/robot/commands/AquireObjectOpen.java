// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Arm.ArmBottom;
import frc.robot.commands.Elevator.ElevatorObject;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Pneumatics;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AquireObjectOpen extends SequentialCommandGroup {
    private final Elevator m_elevator = new Elevator();
    private final Arm m_arm = new Arm();
    private final Pneumatics m_pneumatics = new Pneumatics();

    /** Creates a new Score. */
    public AquireObjectOpen() {

        // Add your commands in the addCommands() call, e.g.
        // addCommands(new FooCommand(), new BarCommand());
        addCommands(
                new ElevatorObject(m_elevator)
                        .andThen(new ArmBottom(m_arm)
                                .andThen(new TogglePiston(m_pneumatics))));

        // Raise Elevator, Extend Arm, Open
    }
}
