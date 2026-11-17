package com.example.demo.service;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Worker;

@Service
public class WorkerService {
    private List<Worker> workers=new ArrayList<>();
    public List<Worker>getAllWorkers(){
        return workers;
    }
    public void addWorkers(Worker worker){
        for(Worker w:workers){
            if(w.getWorkerId()==worker.getWorkerId()){
                return ;
            }
        }
        workers.add(worker);
    }
}
