package br.com.neurotech.spring.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neurotech.spring.data.models.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository <Clinic, Integer> {

	Optional<Clinic> findById(Integer id);
}
