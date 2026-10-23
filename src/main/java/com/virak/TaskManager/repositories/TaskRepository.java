package com.virak.TaskManager.repositories;

import com.virak.TaskManager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(String status);
    List<Task> findByTitleContainingIgnoreCase(String title);
    List<Task> findByStatusAndPriority(String status, String priority);

    // Custom JPQL query
    @Query("SELECT t FROM Task t WHERE t.status = :status ORDER BY t.priority DESC, t.createdAt DESC")
    List<Task> findByStatusOrderedByPriority(@Param("status") String status);

    // Count by status
    long countByStatus(String status);

}
