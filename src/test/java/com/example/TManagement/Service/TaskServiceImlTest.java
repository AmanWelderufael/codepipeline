package com.example.TManagement.Service;


import com.example.TManagement.Entity.Task;
import com.example.TManagement.Repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TaskServiceImlTest {

  /* @InjectMocks
    private TaskServiceIml taskService;

    @Mock
    private TaskRepository taskRepository;

    private Task task1;
    private Task task2;

    @BeforeEach
    public void setUp(){
        task1 = new Task(1L, "Task1", "Description 1");
        task1 = new Task(2L, "Task1", "Description 2");
    }

    @Test
    public void testListAllTask(){
        //Arrage
        when(taskRepository.findAll()).thenReturn(Arrays.asList(task1,task2));

        //Act
        List<Task> tasks = taskService.listAllTask();

        //Assert
        assertNotNull(tasks);
        assertEquals(2,tasks.size());

        verify(taskRepository, times(1)).findAll();
    }

    @Test
    public void testGetTaskById() {
        // Arrange
        when(taskRepository.getById(1L)).thenReturn(task1);

        // Act
        Task task = taskService.getTaskById(1L);

        // Assert
        assertNotNull(task);
        assertEquals("Task 1", task.getTastName());
        verify(taskRepository, times(1)).getById(1L);
    }

    @Test
    public void testCreateTask() {
        // Arrange
        when(taskRepository.save(any(Task.class))).thenReturn(task1);

        // Act
        Task createdTask = taskService.createTask(task1);

        // Assert
        assertNotNull(createdTask);
        assertEquals("Task 1", createdTask.getTastName());
        verify(taskRepository, times(1)).save(task1);
    }

    @Test
    public void testUpdateTask() {
        // Arrange
        when(taskRepository.save(any(Task.class))).thenReturn(task1);

        // Act
        Task updatedTask = taskService.updateTask(task1);

        // Assert
        assertNotNull(updatedTask);
        assertEquals("Task 1", updatedTask.getTastName());
        verify(taskRepository, times(1)).save(task1);
    }

    @Test
    public void testDeleteTask() {
        // Act
        taskService.deleteTask(task1);

        // Assert
        verify(taskRepository, times(1)).delete(task1);
    } */
}
