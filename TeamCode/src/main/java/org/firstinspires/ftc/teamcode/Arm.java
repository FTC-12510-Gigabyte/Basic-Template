package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

/**
 * This file contains an example of an iterative (Non-Linear) "OpMode".
 * An OpMode is a 'program' that runs in either the autonomous or the teleop period of an FTC match.
 * The names of OpModes appear on the menu of the FTC Driver Station.
 * When an selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a two wheeled robot
 * It includes all the skeletal structure that all iterative OpModes contain.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@OpMode(name="Arm", group="Subsystems")
//@Disabled
public class Arm extends OpMode
{   	private DcMotor arm_motor;
      private double control_arm;
      private DcMotor roller_gripper_motor;
  s    private double roller_gripper_control;
    // Declare OpMode members.
    //private ElapsedTime runtime = new ElapsedTime(); // Used as an ndecation of runtime for some process that you may need.

    //Constants

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
      arm_motor = hardwareMap.dcMotor.get("arm_motor");
      roller_gripper_motor = hardwareMap.dcMotor.get("roller_gripper_motor");
      control_arm = 0;
      roller_gripper_control = 0;
        //telemetry.addData("Status", "Initialized");//Using Telemetry lets you tha abilty to show live important data to the drive through 		the driver station. Customie it and use it wisely
	/*
	 *Here goes all the code that requires an initialization once the driver hits INIT button on the DS.
	 * You can see this method as a "constructor" used for initialization.
	*/


        // Tell the driver that initialization is complete.
        //telemetry.addData("Status", "Initialized");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        //runtime.reset();//You can learn about run time and it methods in other resources.
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
       control_arm = -gamped2.left_stick_y
       roller_gripper_control = -gamped2.right_stick_y
       arm_motor.setPower(control_arm);
       roller_gripper_motor.setPower(roller_gripper_control);

	//YOUR CODE GOES HERE!

        // Show the elapsed game time and wheel power.
        //telemetry.addData("Status", "Run Time: " + runtime.toString());
        //telemetry.addData("Motors", "left (%.2f), right (%.2f)", leftPower, rightPower);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }

}
