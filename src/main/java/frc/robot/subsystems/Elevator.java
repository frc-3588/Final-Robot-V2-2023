// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;

import frc.robot.commands.*;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Elevator extends SubsystemBase {

    private final CANSparkMax LeftMotor;
    private final CANSparkMax RightMotor;
    private final MotorControllerGroup MotorGroup;

    private SparkMaxPIDController LeftPIDController;
    private SparkMaxPIDController RightPIDController;

    private final double kP = 5e-5;
    private final double kI = 1e-6;
    private final double kD = 0;
    private final double kIz = 0;
    private final double kFF = 0.000156;
    private final double kMaxOutput = 1;
    private final double kMinOutput = -1;
    private final int kMaxRPM = 5700;

    private RelativeEncoder leftEncoder;
    private RelativeEncoder rightEncoder;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
    *
    */
    public Elevator() {

        LeftMotor = new CANSparkMax(5, MotorType.kBrushless);
        RightMotor = new CANSparkMax(6, MotorType.kBrushless);
        MotorGroup = new MotorControllerGroup(LeftMotor, RightMotor);

        LeftPIDController = LeftMotor.getPIDController();

        leftEncoder = LeftMotor.getEncoder();
        rightEncoder = RightMotor.getEncoder();

        LeftPIDController.setP(kP);
        LeftPIDController.setI(kI);
        LeftPIDController.setD(kD);
        LeftPIDController.setIZone(kIz);
        LeftPIDController.setFF(kFF);
        LeftPIDController.setOutputRange(kMinOutput, kMaxOutput);

        RightPIDController.setP(kP);
        RightPIDController.setI(kI);
        RightPIDController.setD(kD);
        RightPIDController.setIZone(kIz);
        RightPIDController.setFF(kFF);
        RightPIDController.setOutputRange(kMinOutput, kMaxOutput);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    public void setPower(double power) {
        MotorGroup.set(power);

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}
