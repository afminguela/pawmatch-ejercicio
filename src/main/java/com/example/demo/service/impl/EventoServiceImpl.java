package com.example.demo.service.impl;

import com.example.demo.dto.evento.EventoRequestDTO;
import com.example.demo.dto.evento.EventoResponseDTO;
import com.example.demo.dto.evento.EventoUpdateDTO;
import com.example.demo.repository.EventoRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.interfaces.EventoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;
    private UsuarioRepository usuarioRepository;


    @Override
    public List<EventoResponseDTO> getAllEventos() {
        return List.of();
    }

    @Override
    public EventoResponseDTO getEventoById(Long id) {
        return null;
    }

    @Override
    public EventoResponseDTO createEvento(EventoRequestDTO eventoRequest) {
        return null;
    }

    @Override
    public EventoResponseDTO updateEvento(Long id, EventoUpdateDTO eventoUpdate) {
        return null;
    }

    @Override
    public void deleteEvento(Long id) {

    }
}
