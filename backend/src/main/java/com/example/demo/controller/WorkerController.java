package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Worker;
import com.example.demo.service.WorkerService;
import java.util.List;

@RestController 
@RequestMapping ("/api/workers")
public class WorkerController {
    private WorkerService workerService;
    public WorkerController(WorkerService workerService){
        this.workerService=workerService;
    }
    @GetMapping()
    public List<Worker> getAllWorkers(){
        return workerService.getAllWorkers();
    }

}
