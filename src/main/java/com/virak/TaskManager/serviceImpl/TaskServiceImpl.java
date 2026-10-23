package com.virak.TaskManager.serviceImpl;
import com.virak.TaskManager.dtos.TaskRequest;
import com.virak.TaskManager.dtos.TaskResponse;
import com.virak.TaskManager.models.Task;
import com.virak.TaskManager.repositories.TaskRepository;
import com.virak.TaskManager.services.TaskService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        System.out.println("Task is being created with the title: "+ taskRequest.getTitle());

        Task task = Task.builder()
                .title(taskRequest.getTitle())
                .description(taskRequest.getDescription())
                .status(taskRequest.getStatus())
                .priority(taskRequest.getPriority())
                .build();

        Task savedTask = taskRepository.save(task);

        System.out.println("Task created successfully with ID : " + savedTask.getId());

        return mapToResponse(savedTask);
    }





    private TaskResponse mapToResponse(Task task) {
        return TaskResponse.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .status(task.getStatus())
                .priority(task.getPriority())
                .createdAt(task.getCreatedAt())
                .updatedAt(task.getUpdatedAt())
                .build();
    }

}
