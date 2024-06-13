package net.javaguides.springboot.controller;

import java.util.List;
import java.util.concurrent.Callable;

import net.javaguides.springboot.model.Salutation;
import net.javaguides.springboot.service.SalutationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:5173/")
@RequestMapping("/api/salutation")
public class SalutationController {

    private SalutationService salutationService;

    public SalutationController(SalutationService salutationService) {
        super();
        this.salutationService = salutationService;
    }

    @GetMapping
    public List<Salutation> getAllSalutation(){
        return salutationService.getAllSalutation();
    }

}
