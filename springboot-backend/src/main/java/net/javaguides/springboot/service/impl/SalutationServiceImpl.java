package net.javaguides.springboot.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Salutation;
import net.javaguides.springboot.repository.SalutationRepository;
import net.javaguides.springboot.service.SalutationService;
@Service
public class SalutationServiceImpl implements  SalutationService{
    private SalutationRepository salutationRepository;

    public SalutationServiceImpl(SalutationRepository salutationRepository) {
        super();
        this.salutationRepository = salutationRepository;
    }

    @Override
    public List<Salutation> getAllSalutation() {
        return salutationRepository.findAll();
    }

}
