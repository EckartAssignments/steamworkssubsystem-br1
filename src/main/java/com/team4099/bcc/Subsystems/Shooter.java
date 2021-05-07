package com.team4099.bcc.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final TalonSRX shooterMotor = new TalonSRX(2);
    private final TalonSRX shooterMotor2 = new TalonSRX(1);

    public Shooter() {
        super();
    }

    public void setPercentOutput(double percentOutput) {
        shooterMotor.set(ControlMode.PercentOutput, percentOutput);
        shooterMotor2.set(ControlMode.PercentOutput, percentOutput);
    }

    @Override
    public void periodic() {
    }
}
