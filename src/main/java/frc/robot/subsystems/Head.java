package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;
import edu.wpi.first.wpilibj.Joystick;


public class Head extends SubsystemBase {
  private TalonSRX head;

  public Head(){
      head = new TalonSRX(13);
  }

  public void headTurn(){
    head.set(ControlMode.PercentOutput, 0.25);
  }

  public void headStop(){
    head.set(ControlMode.PercentOutput, 0);
  }





}
