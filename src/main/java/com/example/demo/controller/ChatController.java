package com.example.demo.controller;

import com.example.demo.dto.chat.ChatRequestDTO;
import com.example.demo.dto.chat.ChatResponseDTO;
import com.example.demo.service.impl.ChatServiceImpl;
import com.example.demo.service.interfaces.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ChatController {


@Autowired
    private ChatServiceImpl chatService;

@GetMapping
    public ResponseEntity<List<ChatResponseDTO>> getAllChats(){
    return  ResponseEntity.ok(chatService.getAllChats());
}

@GetMapping("/{id}")
    public ResponseEntity<ChatResponseDTO> getChatById(@PathVariable Long id){
    return ResponseEntity.ok(chatService.getChatById(id));
}

@PostMapping
    public ResponseEntity<ChatResponseDTO> saveChat(@RequestBody ChatRequestDTO chatRequestDTO){
    return ResponseEntity.ok(chatService.createChat(chatRequestDTO));
}

@DeleteMapping("/{id}")
    public ResponseEntity<ChatResponseDTO> deleteChat(@PathVariable Long id){
    chatService.deleteChat(id);
    return ResponseEntity.noContent().build();
}
}
