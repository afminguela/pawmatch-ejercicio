package com.example.demo.dto.preferencias;

import com.example.demo.enums.Caracter;
import com.example.demo.enums.Medida;
import com.example.demo.model.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PreferenciasUpdateDTO {
    @Size(max = 50, message = "La raza no puede tener más de 50 caracteres")
   private String raza;

    @Enumerated(EnumType.STRING)
    private Medida medida;

    @Min(value = 0, message = "La edad mínima no puede ser negativa")
    @Max(value = 50, message = "La edad mínima no puede superar 50")
    private Integer edadMin;

    @Min(value = 0, message = "La edad máxima no puede ser negativa")
    @Max(value = 50, message = "La edad máxima no puede superar 50")
    private Integer edadMax;


    @Min(value = 1, message = "La distancia mínima es de 1 km")
    @Max(value = 100, message = "La distancia máxima permitida es de 100 km")
    private Integer distanciaMaxKm;

    private String ciudad;

    @NotBlank(message = "El nombre no puede estar vacío")
    private Usuario usuario;
}
