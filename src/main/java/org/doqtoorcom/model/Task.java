package org.doqtoorcom.model;

public class Task {
    private String taskId;
    private String description;

    public Task( ) {
    }
    public Task(String id,  String description) {
        this.taskId = id;
        this.description = description;
    }
    public String getTaskId() {
        return taskId;
    }
    public void setTaskId(String id) {
        this.taskId = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}