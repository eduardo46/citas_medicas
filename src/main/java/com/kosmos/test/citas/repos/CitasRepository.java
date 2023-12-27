package com.kosmos.test.citas.repos;

import com.kosmos.test.citas.entities.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<Citas, Long> {
    // Custom query methods if needed
}
