package com.virak.TaskManager.dtos;

import jakarta.validation.MessageInterpolator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskRequest {

    @NotBlank
    @Size(min = 3, max = 100,message = "Title must be between 3 and 100 characters")
    private String title;


    @Size(max = 500, message = "Description cannot exceed 500 characters")
    private String description;

    @NotBlank(message = "Status is required")
    @Pattern(regexp = "PENDING|IN_PROGRESS|COMPLETED", message = "Status must be PENDING, IN_PROGRESS, or COMPLETED")
    private String status;

    @NotBlank(message = "Priority is required")
    @Pattern(regexp = "LOW|MEDUIM|HIGH", message = "Priority must be LOW, MEDUIM, or HIGH")
    private String priority;


}
