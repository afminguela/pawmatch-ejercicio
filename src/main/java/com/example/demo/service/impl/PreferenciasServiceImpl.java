package com.example.demo.service.impl;

import com.example.demo.dto.preferencias.PreferenciasRequestDTO;
import com.example.demo.dto.preferencias.PreferenciasResponseDTO;
import com.example.demo.dto.preferencias.PreferenciasUpdateDTO;
import com.example.demo.repository.MascotaRepository;
import com.example.demo.repository.PreferenciasRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.interfaces.PreferenciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferenciasServiceImpl implements PreferenciasService {

    @Autowired
    private PreferenciasRepository preferenciasRepository;
    private UsuarioRepository usuarioRepository;
    private MascotaRepository mascotaRepository;


    @Override
    public PreferenciasResponseDTO getPreferenciasByUsuarioId(Long usuarioId) {

        return null;
    }

    @Override
    public PreferenciasResponseDTO createPreferencias(PreferenciasRequestDTO preferenciasRequest) {
        return null;
    }

    @Override
    public PreferenciasResponseDTO updatePreferencias(Long id, PreferenciasUpdateDTO preferenciasUpdate) {
        return null;
    }

    @Override
    public void deletePreferencias(Long id) {

    }
}
