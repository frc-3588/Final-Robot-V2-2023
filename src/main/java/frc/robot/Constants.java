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

  public static final class JoystickConstants {

    public static final int kLeftStickY = 1;
    public static final int kRightStickX = 3;
  }

  public static final class DriveConstants {

    public static final int kLeftMotor1Port = 0;
    public static final int kLeftMotor2Port = 1;
    public static final int kRightMotor1Port = 2;
    public static final int kRightMotor2Port = 3;
    // TODO: UPDATE THIS TO OUR TRACK WIDTH, CODE WILL NOT WORK WITHOUT
    public static final double kTrackWidth = 0.381 * 2;
    // TODO: SET TO WHEEL DIAMATER IN METERS
    public static final double wheelDiamater = 0.1016;

    public static final DifferentialDriveKinematics m_kinematics = new DifferentialDriveKinematics(
      kTrackWidth
    );
    public static final double ksVolts = 0;
    public static final double kvVoltSecondsPerMeter = 0;
    public static final double kaVoltSecondsSquaredPerMeter = 0;
    public static final double kPDriveVel = 0;
    public static double kWheelDiamater;
  }

  public static final class AutoConstants {
    public static String trajectoryJSON = "paths/CrossBaseline.wpilib.json";
    public static Trajectory trajectory = new Trajectory();

    public static final double kMaxSpeedMetersPerSecond = 0;
    public static final double kMaxAccelerationMetersPerSecondSquared = 0;
    public static final double kRamseteB = 0;
    public static final double kRamseteZeta = 0;
  }

  public static final Transform3d robotToCam = new Transform3d(
    new Translation3d(0.5, 0.0, 05),
    new Rotation3d(0, 0, 0)
  );
}
