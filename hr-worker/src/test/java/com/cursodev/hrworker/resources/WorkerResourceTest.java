package com.cursodev.hrworker.resources;

import com.cursodev.hrworker.entities.Worker;
import com.cursodev.hrworker.repositories.WorkerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
class WorkerResourceTest {


    @Autowired
    private final WorkerRepository workerRepository;

    @Autowired WorkerResource workerResource;

    WorkerResourceTest() {
        workerRepository = null;
    }

//    public WorkerResourceTest(WorkerRepository workerRepository) {
//        this.workerRepository = workerRepository;
//    }


    @Test
    void workersFindAllReturnListWorkers() {

        ResponseEntity<List<Worker>> workerResponseEntity;

        workerResponseEntity = workerResource.findAll();
        List<Worker> list1 = workerResponseEntity.getBody();
        List<Worker> list2 = workerRepository.findAll();


        assert list1 != null;
        Assertions.assertEquals(list1.size(), list2.size());
        Assertions.assertTrue(list1.containsAll(list2));
        Assertions.assertEquals(HttpStatus.OK, workerResponseEntity.getStatusCode());

    }

}
