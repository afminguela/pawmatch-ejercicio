package com.example.demo.utils;

import com.example.demo.model.Mascota;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) {

        // Usuarios
        Usuario user1 = Usuario.builder()
                .nombre("jl")
                .email("sdlkfj@sdklfj.com")
                .password("12334233")
                .ubicacion("Cuenca")
                .telefono("600555555")
                .build();

        Usuario user2 = Usuario.builder()
                    .nombre("paco")
                    .email("asdkhjald@adklsjfhals.com")
                    .password("123455632")
                .telefono("600223322")
                .build();

        usuarioRepository.saveAll(List.of(user1,user2));

        // mascotas

        Mascota mascota1 = Mascota.builder()
                        .nombre("firulai")
                                .build();

        System.out.println("-+-+-+-+-++-+-+-++-Usuarios Cargados");
    }
}
