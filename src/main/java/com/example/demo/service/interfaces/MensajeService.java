package com.example.demo.service.interfaces;

import com.example.demo.dto.mensaje.MensajeRequestDTO;
import com.example.demo.dto.mensaje.MensajeResponseDTO;

import java.util.List;

public interface MensajeService {
    List<MensajeResponseDTO> getMensajesByChatId(Long chatId);

    MensajeResponseDTO getMensajeById(Long id);

    MensajeResponseDTO createMensajeById(MensajeRequestDTO mensajeRequestDTO);
    void deleteMensaje(Long id);


}
