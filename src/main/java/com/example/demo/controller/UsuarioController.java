package com.example.demo.controller;

import com.example.demo.dto.usuario.UsuarioRequestDTO;
import com.example.demo.dto.usuario.UsuarioResponseDTO;
import com.example.demo.dto.usuario.UsuarioUpdateDTO;
import com.example.demo.service.impl.UsuarioImpl;
import com.example.demo.service.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {


        @Autowired
        private UsuarioImpl usuarioService;

        //Get va sin cuerpo, peticion de info
    //post es envío de info, lo suyo es que lleve un cuerpo
    //put para sustituir un registro de la DDBB entero
    //patch es para cambiar solo  una parte del registro de la BBDD
    //Delete es para borrar.
        @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> getAllUsuarios() {
            return ResponseEntity.ok(usuarioService.getAllUsuarios());
        }

        @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> getUsuarioById(@PathVariable Long id) {
            return ResponseEntity.ok(usuarioService.getUsuarioById(id));
        }

        @PostMapping
        public ResponseEntity<UsuarioResponseDTO> createUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
            return ResponseEntity.ok(usuarioService.createUsuario(usuarioRequestDTO));
        }

        @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> updateUsuario(@PathVariable Long id,
                                                            @RequestBody UsuarioUpdateDTO usuarioupdate) {
            return ResponseEntity.ok(usuarioService.updateUsuario(id, usuarioupdate));
        }

        @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> deleteUsuario(@PathVariable Long id) {
            usuarioService.deleteUsuario(id);
            return ResponseEntity.noContent().build();
        }
}
