// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.trajectory.TrajectoryGenerator;
import edu.wpi.first.math.util.Units;

/** Add your docs here. */
public class TrajectoryConfig {

    //probably doesn't need to exist 
    // private boolean reversed;
    // private int startVelocity;
    // private int endVelocity;
    // private String constraints; 


    public TrajectoryConfig(double maxVelocity, double maxAcceleration){

        // startVelocity = 0;
        // endVelocity = 0;
        // reversed = false;
        // constraints = {}; //don't know what type this is so I've set it to a String for now


    }

    public void generateTrajectory(){

        

        // var sideStart = new Pose2d(Units.feetToMeters(1.54), Units.feetToMeters(23.23),
        // Rotation2d.fromDegrees(-180));

        // var crossScale = new Pose2d(Units.feetToMeters(23.7), Units.feetToMeters(6.8),
        // Rotation2d.fromDegrees(-160));

        // var interiorWaypoints = new ArrayList<Translation2d>();
        // interiorWaypoints.add(new Translation2d(Units.feetToMeters(14.54), Units.feetToMeters(23.23)));
        // interiorWaypoints.add(new Translation2d(Units.feetToMeters(21.04), Units.feetToMeters(18.23)));

        // TrajectoryConfig config = new TrajectoryConfig(Units.feetToMeters(12), Units.feetToMeters(12));
        // config.setReversed(true);

        // var trajectory = TrajectoryGenerator.generateTrajectory(
        // sideStart,
        // interiorWaypoints,
        // crossScale,
        // config);


    }





















}
