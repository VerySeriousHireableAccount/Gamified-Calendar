package com.swe.gamifiedcalendar;

import java.util.Objects;
import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long taskID;
    private String taskName;
    private String taskDescription;
    private int taskPoints;
    private long taskStartDate;
    private long taskDeadline;
    private boolean taskStatus;

    private String username;

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Task(){

    }

    public Task(String taskName, String taskDescription, int taskPoints, long taskStartDate, long taskDeadline, boolean taskStatus, String username) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPoints = taskPoints;
        this.taskStartDate = taskStartDate;
        this.taskDeadline = taskDeadline;
        this.taskStatus = taskStatus;
        this.username = username;
    }

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
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

    public long getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(long taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public long getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(long taskDeadline) {
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

    @Override
    public String toString() {
        return String.format(
                "Task[taskID=%d, taskName='%s', taskDescription='%s', taskPoints='%d', taskStartDate='%d', taskDeadline='%d', taskStatus='%b', username='%s']",
                taskID, taskName, taskDescription, taskPoints, taskStartDate, taskDeadline, taskStatus, username);
    }
}
