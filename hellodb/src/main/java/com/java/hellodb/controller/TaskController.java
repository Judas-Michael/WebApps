package com.java.hellodb.controller;

import com.java.hellodb.model.Task;
import com.java.hellodb.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class TaskController {

    private final TaskRepository tasks;

    @Autowired
    public TaskController(TaskRepository tasks){ //How the app will handle tasks
        this.tasks =tasks;
    }

    @RequestMapping("/") //Views for task lists
    public ModelAndView addTask(){
        return new ModelAndView("createTask.html", "task", new Task());
    }

    @RequestMapping(value="/addTask", method= RequestMethod.POST) //adds new task
    public RedirectView addNewTask(Task task){
        tasks.save(task);
        return new RedirectView("/allTask");
    }

    @RequestMapping("/allTasks")
    public ModelAndView allTasks(ModelMap modelMap){ //accesses database to grab info
        modelMap.addAttribute("tasks", tasks.findAllByOrderByUrgentDesc());
        return new ModelAndView("taskList.html", modelMap);
    }
}
