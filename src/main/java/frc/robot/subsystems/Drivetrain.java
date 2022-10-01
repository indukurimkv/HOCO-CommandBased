// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj.Joystick;


public class Drivetrain extends SubsystemBase {
  private TalonSRX frontLeftTalon;
  private TalonSRX frontRightTalon;
  private TalonSRX backLeftTalon;
  private TalonSRX backRightTalon;
  //private Joystick m_leftStick;

  
  public Drivetrain() {
    backLeftTalon = new TalonSRX(14);
    frontLeftTalon = new TalonSRX(5);
    backRightTalon = new TalonSRX(15);
    frontRightTalon = new TalonSRX(2);
    
  
  }

  public void drive(double z, double y){
    double speedMultiplier = 0.75;
    double drive = z;
    double turn = y;
    double driveLeftPower = drive - turn;
    double driveRightPower = drive + turn;

    frontLeftTalon.set(ControlMode.PercentOutput, ((driveLeftPower) * speedMultiplier));
    backLeftTalon.set(ControlMode.PercentOutput,  ((driveLeftPower) * speedMultiplier));
    frontRightTalon.set(ControlMode.PercentOutput,  ((driveRightPower) * speedMultiplier));
    backRightTalon.set(ControlMode.PercentOutput,  ((driveRightPower) * speedMultiplier));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
