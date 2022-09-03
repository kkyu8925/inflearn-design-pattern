package com.example._03_behavioral_patterns._15_interpreter.java._02_after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {

    private final Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(this.character);
    }
}
