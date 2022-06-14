package com.sjonnie.productions.pokemon_basim_backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = IController.API)
public class SessionController {
    private HttpServletRequest request;
    @GetMapping("createSession")
    public ResponseEntity<String> CreateSession() {
        HttpSession session = request.getSession(true);
        if(session != null) return ResponseEntity.ok("Session Created");
        return ResponseEntity.ok("Session NOT Created");
    }
}
