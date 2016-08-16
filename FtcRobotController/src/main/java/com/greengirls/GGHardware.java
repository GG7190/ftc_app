package com.greengirls;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;

/**
 * Created by GreenGirls on 8/2/2016.
 */
public class GGHardware extends OpMode {

    //define Motors and MotorControllers
    DcMotorController rightMotorController;
    DcMotor rightFrontMotor;
    DcMotor rightBackMotor;
    DcMotorController leftMotorController;
    DcMotor leftFrontMotor;
    DcMotor leftBackMotor;
    DcMotorController attachmentMotorController;
    DcMotor collectorMotor;
    DcMotor angleMotor;
    DcMotorController liftMotorController;
    DcMotor lift1;
    DcMotor lift2;
    ServoController servoController;
    Servo servo1;
    Servo leftWing;
    Servo rightWing;
    Servo leftDino;
    Servo rightDino;
    ColorSensor sensorRGB;
    DeviceInterfaceModule cdim;

    static final int LED_CHANNEL = 5;

    @Override public void init() {

        cdim = hardwareMap.deviceInterfaceModule.get("dim");

        // set the digital channel to output mode.
        // remember, the Adafruit sensor is actually two devices.
        // It's an I2C sensor and it's also an LED that can be turned on or off.
        // cdim.setDigitalChannelMode(LED_CHANNEL, DigitalChannelController.Mode.OUTPUT);

        // get a reference to our ColorSensor object.
        sensorRGB = hardwareMap.colorSensor.get("color");
        sensorRGB.enableLed(false);
        cdim.setDigitalChannelState(LED_CHANNEL, false);

        //Map hardware for Right motor controller
        rightMotorController = hardwareMap.dcMotorController.get("rightdrive");
        rightFrontMotor = hardwareMap.dcMotor.get("rfront");
        rightBackMotor = hardwareMap.dcMotor.get("rback");

        //Map hardware for Left motor controller
        leftMotorController = hardwareMap.dcMotorController.get("leftdrive");
        leftFrontMotor = hardwareMap.dcMotor.get("lfront");
        leftBackMotor = hardwareMap.dcMotor.get("lback");

        //Map hardware for attachment motor controller
        attachmentMotorController = hardwareMap.dcMotorController.get("attachment");
        collectorMotor = hardwareMap.dcMotor.get("collector");
        angleMotor = hardwareMap.dcMotor.get("anglemotor");

        //Map hardware for lift motor controller
        liftMotorController = hardwareMap.dcMotorController.get("lift");
        lift1 = hardwareMap.dcMotor.get("lift1");
        lift2 = hardwareMap.dcMotor.get("lift2");

        //Map hardware for servo controller
        servoController = hardwareMap.servoController.get("servo");
        servo1 = hardwareMap.servo.get("servo1");
        leftWing = hardwareMap.servo.get("lwing");
        rightWing = hardwareMap.servo.get("rwing");
        leftDino = hardwareMap.servo.get("ldino");
        rightDino = hardwareMap.servo.get("rdino");

        hardwareMap.logDevices();

        // get a reference to our DeviceInterfaceModule object.
        // cdim = hardwareMap.deviceInterfaceModule.get("dim");

        // get a reference to our ColorSensor object.
        // sensorRGB = hardwareMap.colorSensor.get("color");

    }
}
