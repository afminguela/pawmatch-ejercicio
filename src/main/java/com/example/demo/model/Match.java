package com.example.demo.model;

import com.example.demo.enums.EstadoMatch;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(
        name = "matches",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"mascota_origen_id", "mascota_destino_id"})
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Mascota que inicia el "like"
     */
    @NotNull(message = "La mascota origen es obligatoria")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mascota_origen_id", nullable = false)
    private Mascota mascotaOrigen;

    /**
     * Mascota que recibe el "like"
     */
    @NotNull(message = "La mascota destino es obligatoria")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mascota_destino_id", nullable = false)
    private Mascota mascotaDestino;

    /**
     * Estado del match:
     * - PENDIENTE: Solo un lado ha dado "like"
     * - CONFIRMADO: Ambos lados dieron "like"
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private EstadoMatch estado;

    @CreationTimestamp
    @Column(name = "fecha_match", nullable = false, updatable = false)
    private LocalDateTime fechaMatch;

    @Column(nullable = false)
    private Boolean esMutuo = false;



}
