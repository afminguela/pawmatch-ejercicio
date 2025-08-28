package com.example.demo.dto.preferencias;

import com.example.demo.enums.Caracter;
import com.example.demo.enums.Medida;

import lombok.Data;

@Data
public class PreferenciasResponseDTO {

    private Long id;
    private Long usuarioId;
    private String raza;
    private Integer edadMin;
    private Integer edadMax;
    private String ciudad;
}
