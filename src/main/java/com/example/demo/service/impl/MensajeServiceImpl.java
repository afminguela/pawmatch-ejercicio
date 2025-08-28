package com.example.demo.service.impl;

import com.example.demo.dto.mensaje.MensajeRequestDTO;
import com.example.demo.dto.mensaje.MensajeResponseDTO;
import com.example.demo.model.Mensaje;
import com.example.demo.repository.MensajeRepository;
import com.example.demo.service.interfaces.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeServiceImpl implements MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    @Override
    public List<MensajeResponseDTO> getMensajesByChatId(Long chatId) {
        return List.of();
    }

    @Override
    public MensajeResponseDTO getMensajeById(Long id) {
       MensajeResponseDTO mensaje =mensajeRepository.getMensajesById(id);
        return mensaje;
    }

    @Override
    public MensajeResponseDTO createMensajeById(MensajeRequestDTO mensajeRequestDTO) {
        return null;
    }

    @Override
    public void deleteMensaje(Long id) {

    }
}
