package com.example.demo.dto.evento;



import com.example.demo.model.Usuario;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventoResponseDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private LocalDateTime fecha;
    private Long organizadorId;
}