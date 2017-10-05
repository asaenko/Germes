package org.itsimulator.germes.app.model.entity.model.base;

public class Task {
    public static final double COMPLETED = 100;
    private double completion;

    public boolean isCompleted() {
        return completion == COMPLETED;
    }

    public double getCompletion() {
        return completion;
    }

    public void setCompletion(double completion) {
        this.completion = completion;
    }
}