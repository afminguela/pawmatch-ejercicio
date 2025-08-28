package com.example.demo.dto.mascota;

import com.example.demo.enums.Sexo;
import lombok.Data;

@Data
public class MascotaUpdateDTO {

    private String nombre;
    private String especie;
    private String raza;
    private Integer edad;
    private Sexo sexo;
    private String descripcion;
}