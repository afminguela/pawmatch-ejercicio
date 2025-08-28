package com.example.demo.repository;

import com.example.demo.dto.mensaje.MensajeResponseDTO;
import com.example.demo.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    MensajeResponseDTO getMensajesById(Long id);
}
