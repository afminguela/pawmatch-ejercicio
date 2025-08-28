package com.example.demo.dto.mascota;

import com.example.demo.enums.Sexo;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
    public class MascotaRequestDTO {

        @NotBlank
        private String nombre;

        @NotBlank
        private String especie;

        @NotBlank
        private String raza;

        @NotNull
        private Integer edad;

        @NotBlank
        private Sexo sexo;

        @NotNull
        private Long usuarioId;

        private String descripcion;
    }
