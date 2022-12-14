package com.example._03_behavioral_patterns._14_command.java._02_after;

import com.example._03_behavioral_patterns._14_command.java._01_before.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
