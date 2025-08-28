package com.example.demo.dto.preferencias;

import com.example.demo.enums.Caracter;
import com.example.demo.enums.Medida;
import com.example.demo.model.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PreferenciasRequestDTO {

    @NotNull
    private Long  usuarioId;

    @Size(max = 50, message = "La raza no puede tener más de 50 caracteres")
    private String razaPreferida;

    @Min(value = 0, message = "La edad mínima no puede ser negativa")
    @Max(value = 50, message = "La edad mínima no puede superar 50")
    private Integer edadMin;

    @Min(value = 0, message = "La edad máxima no puede ser negativa")
    @Max(value = 50, message = "La edad máxima no puede superar 50")
    private Integer edadMax;

    private String sexoPreferido;

    private String ciudad;
}
