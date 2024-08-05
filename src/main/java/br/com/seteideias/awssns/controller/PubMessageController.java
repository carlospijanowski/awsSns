package br.com.seteideias.awssns.controller;

import br.com.seteideias.awssns.consumer.MyMessage;
import br.com.seteideias.awssns.service.PubMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pub")
public class PubMessageController {

    private final PubMessageService pubMessageService;

    public PubMessageController(PubMessageService pubMessageService) {
        this.pubMessageService = pubMessageService;
    }

    @PostMapping
    public ResponseEntity<String> newMessage (@RequestBody final MyMessage myMessage) {
        pubMessageService.newMessage(myMessage);
        return ResponseEntity.ok("OK");
    }

}
