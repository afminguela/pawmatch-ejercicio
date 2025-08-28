package com.example.demo.dto.evento;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventoRequestDTO {

    @NotBlank
    private String nombre;

    @NotBlank
    private String descripcion;

    @NotBlank
    private String ubicacion;

    @NotNull
    @Future
    private LocalDateTime fecha;

    @NotNull
    private Long usuarioId;
}