package com.assigment.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    private final JogoAdivinhacao jogo;

    public JogoController() {
        this.jogo = new JogoAdivinhacao();
    }

    @PostMapping("/adivinhar")
    public String adivinhar(@RequestParam int tentativa) {
        if (!jogo.isJogoEncerrado()) {
            return jogo.adivinhar(tentativa);
        } else {
            return "O jogo já foi encerrado. Inicie um novo jogo.";
        }
    }

    @GetMapping("/resetar")
    public String resetarJogo() {
        jogo.resetar();
        return "Novo jogo iniciado. Boa sorte!";
    }
}