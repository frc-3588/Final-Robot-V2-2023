package frc.robot.subsystems;

import java.util.Optional;

import org.photonvision.EstimatedRobotPose;
import org.photonvision.PhotonCamera;
import org.photonvision.PhotonPoseEstimator;
import org.photonvision.PhotonPoseEstimator.PoseStrategy;
import org.photonvision.targeting.PhotonPipelineResult;
import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Pose2d;
import frc.robot.Constants.aprilTagAlignmentConstants;

public class Vision {
    private final PhotonCamera camera;
    private AprilTagFieldLayout field;
    private PhotonPoseEstimator poseEstimator;

    

    public Vision() {
        camera = new PhotonCamera("USB_Camera");
        try {
            field = AprilTagFieldLayout.loadFromResource(AprilTagFields.k2023ChargedUp.m_resourceFile);
            poseEstimator = new PhotonPoseEstimator(field, PoseStrategy.CLOSEST_TO_REFERENCE_POSE, camera,
                aprilTagAlignmentConstants.robotToCam);
        } catch (Exception e) {
            System.out.println("Field layout not found" + e);
        }

        
    }

    // A help function to log found camera targets to the console
    public PhotonPipelineResult getCameraData() {
        return camera.getLatestResult();
    }

    public Optional<EstimatedRobotPose> getEstimatedGlobalPose(Pose2d prevEstimatedRobotPose) {
        poseEstimator.setReferencePose(prevEstimatedRobotPose);
        return poseEstimator.update();
    }

    
}