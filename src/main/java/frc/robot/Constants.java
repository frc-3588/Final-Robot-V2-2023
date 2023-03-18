// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be
 * declared globally (i.e. public static). Do not put anything functional in
 * this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {
  public static final double kMotorStop = 0.0;

  public static final class JoystickConstants {
    public static final int kLeftStickY = 1;
    public static final int kRightStickX = 3;
    public static double kWheelDiamater;

    public static final int kElevatorTopButton = 1;
    public static final int kElevatorBottomButton = 2;
    public static final int kArmTopButton = 3;
    public static final int kArmBottomButton = 4;

    public static final int kArmScoreTopButton = 5;
    public static final int kArmScoreMiddleButton = 6;

  }

  public static final class DriveConstants {
    public static final int kLeftMotor1Port = 0;
    public static final int kLeftMotor2Port = 1;
    public static final int kRightMotor1Port = 2;
    public static final int kRightMotor2Port = 3;

    public static final double kTrackWidth = Units.inchesToMeters(27);
    public static final double kWheelDiamater = Units.inchesToMeters(6);




  }

  public static final class ElevatorConstants {
    public static final double kTopPIDReference = 50.0;
    public static final double kBottomPIDReference = 25.0;
    public static final double kHomePIDRefrence = 0.0;
    public static final double kPIDTolerance = 0.001;

    public static final double topPIDReference = 12.0;
    public static final double objectPIDRefrence = 12.0d;
    public static final double bottomPIDReference = 0.0;
    public static final double PIDTolerance = 0.01;

    public static final double kRightPIDTolerance = 0.1;
    public static final double kLeftPIDTolerance = 0.1;

    public static final double kCubeTopHeight = 3.0; // feet, take into consideration apriltags
    public static final double kCubeMiddleHeight = 2.0;

    public static final double kConeTopHeight = 4.0;
    public static final double kConeMiddleHeight = 3.0;

    public static final double kFeederStationHeight = 3.0; // change according to game manuel

    public static final int kLeftMotor = 8;
    public static final int kRightMotor = 7;

    public static final double stopSpeed = 0.0;

  }

  public static final class ArmConstants {
    // measure according to the robot, location of elevator and arm
    public static final double middleSetPoint = 0.0;
    public static final double topSetPoint = 0.0;
    public static final double PIDTolerance = 0.01;

    public static final double topPIDReference = 20;
    public static final double middlePIDReference = 40;
  }

  public static final class AutoConstants {

    public static final int kLeftMotor1Port = 0;
    public static final int kLeftMotor2Port = 1;
    public static final int kRightMotor1Port = 2;
    public static final int kRightMotor2Port = 3;
    // TODO: UPDATE THIS TO OUR TRACK WIDTH, CODE WILL NOT WORK WITHOUT
    public static final double kTrackWidth = Units.inchesToMeters(27);
    public static final double kWheelDiamater = Units.inchesToMeters(6);

    public static final DifferentialDriveKinematics m_kinematics = new DifferentialDriveKinematics(
        kTrackWidth);
    public static final double ksVolts = 0;
    public static final double kvVoltSecondsPerMeter = 0;
    public static final double kaVoltSecondsSquaredPerMeter = 0;
    public static final double kPDriveVel = 0;

    // public static String kTrajectoryJSON = "paths/CrossBaseline.wpilib.json";
    // public static Trajectory kTrajectory = new Trajectory();

    public static final double kMaxSpeedMetersPerSecond = 0;
    public static final double kMaxAccelerationMetersPerSecondSquared = 0;
    public static final double kRamseteB = 0;
    public static final double kRamseteZeta = 0;
  }

  public static final class aprilTagAlignmentConstants {
    public static final Transform3d kRobotToCam = new Transform3d(
        new Translation3d(Units.inchesToMeters(16), 0.0, Units.inchesToMeters(4.625)),
        new Rotation3d(0, 0, 0));
    public static final double kTargetHeight = Units.feetToMeters(2);
    public static final double kGoalRange = Units.inchesToMeters(3);
  }

}
