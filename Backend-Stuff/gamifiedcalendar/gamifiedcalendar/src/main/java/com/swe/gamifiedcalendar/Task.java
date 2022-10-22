package com.swe.gamifiedcalendar;

import java.util.Objects;

public class Task {

    private int taskID;
    private String taskName;
    private String taskDescription;
    private int taskPoints;
    private UTime taskStartDate;
    private UTime taskDeadline;
    private boolean taskStatus;

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskPoints() {
        return taskPoints;
    }

    public void setTaskPoints(int taskPoints) {
        this.taskPoints = taskPoints;
    }

    public boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public UTime getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(UTime taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public UTime getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(UTime taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return getTaskID() == task.getTaskID() && getTaskPoints() == task.getTaskPoints() && getTaskStatus() == task.getTaskStatus() && Objects.equals(getTaskName(), task.getTaskName()) && Objects.equals(getTaskDescription(), task.getTaskDescription()) && Objects.equals(getTaskStartDate(), task.getTaskStartDate()) && Objects.equals(getTaskDeadline(), task.getTaskDeadline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaskID(), getTaskName(), getTaskDescription(), getTaskPoints(), getTaskStartDate(), getTaskDeadline(), getTaskStatus());
    }
}
