package com.example.TManagement.Service;

import com.example.TManagement.Entity.Task;

import java.util.List;

public interface TaskService {
    //ListALl
    List<Task> listAllTask();
    //Get task by id
    Task getTaskById(Long id);
    //create
    Task createTask(Task task);
    //Update
    Task updateTask(Task task);
    //Delete
    void deleteTask(Task task);
}
