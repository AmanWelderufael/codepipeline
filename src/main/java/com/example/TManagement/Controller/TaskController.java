package com.example.TManagement.Controller;

import com.example.TManagement.Entity.Task;
import com.example.TManagement.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<Task> getAllTask(){
        return taskService.listAllTask();
    }

    //Get a task using an id
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    //Create task
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    // Update
    @PutMapping
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails){

        Task task = taskService.getTaskById(id);
        if(task != null){
            task.setTastName(taskDetails.getTastName());
            task.setDescription(taskDetails.getDescription());
            return  taskService.updateTask(task);
        }
        return null;
    }

    //Delete
    @DeleteMapping
    public void deleteTask(Task task){
        taskService.deleteTask(task);
    }

}
