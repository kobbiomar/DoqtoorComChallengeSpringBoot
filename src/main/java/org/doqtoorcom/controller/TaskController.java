package org.doqtoorcom.controller;

import org.doqtoorcom.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/tasks" })
public class TaskController {

    private final List<Task> tasks = createListTask();

    @GetMapping(produces = "application/json")
    public List<Task> getTasks() {
        return tasks;
    }

    private static List<Task> createListTask() {
        List<Task> listTasks = new ArrayList<>();
        Task task1 = new Task();
        task1.setTaskId("1");
        task1.setDescription("Do task N°1");
        listTasks.add(task1);
        Task task2 = new Task();
        task2.setTaskId("2");
        task2.setDescription("Do task N°2");
        listTasks.add(task2);

        return listTasks;
    }
}
