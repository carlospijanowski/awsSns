package br.com.seteideias.awssqs.controller;

import br.com.seteideias.awssqs.consumer.MyMessage;
import br.com.seteideias.awssqs.service.PubMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
