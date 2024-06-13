package net.javaguides.springboot.repository;


import net.javaguides.springboot.model.Salutation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalutationRepository extends JpaRepository<Salutation, Long> {
}
