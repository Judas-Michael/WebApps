package com.java.hellodb.repository;

import com.java.hellodb.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository; //This portion accesses the database code and interacts with tasks

import java.util.List;

public interface TaskRepository extends PagingAndSortingRepository<Task,Long>{

    List<Task> findAllByOrderByUrgentDesc();
}


