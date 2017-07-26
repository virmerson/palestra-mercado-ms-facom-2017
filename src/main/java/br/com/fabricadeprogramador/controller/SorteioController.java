package br.com.fabricadeprogramador.controller;

import br.com.fabricadeprogramador.model.Pessoa;
import br.com.fabricadeprogramador.service.SorteioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Virmerson Bento dos Santos on 7/26/17.
 */

@CrossOrigin(origins = "http://localhost:63342")
@RestController("/sorteio")
public class SorteioController {


    @Autowired
    SorteioService sorteioService;

    @GetMapping
    public Pessoa sortear(){

        return sorteioService.realizarSorteio();
    }
}
