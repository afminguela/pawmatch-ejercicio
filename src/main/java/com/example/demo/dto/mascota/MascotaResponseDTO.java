package com.example.demo.dto.mascota;

import com.example.demo.enums.Sexo;
import lombok.Data;

@Data
public class MascotaResponseDTO {

    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private Integer edad;
    private Sexo sexo;
    private Long usuarioId;
    private String descripcion;
}