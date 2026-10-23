package com.virak.TaskManager.services;

import com.virak.TaskManager.dtos.TaskRequest;
import com.virak.TaskManager.dtos.TaskResponse;

import java.util.List;

public interface TaskService {

    TaskResponse createTask(TaskRequest taskRequest);

    TaskResponse getTaskById(Long id);

    List<TaskResponse> getAllTasks();

    TaskResponse updateTask(TaskRequest taskRequest);

    void deleteTask(Long id);

    List<TaskResponse>getTaskByStatus(String status);

    List<TaskResponse>getTaskByPriority(String priority);

    List<TaskResponse>searchTasks(String keyword);

    List<TaskResponse> getTaskByStatusAndPriority(String status, String priority);

    long countTasksByStatus(String status);
}
