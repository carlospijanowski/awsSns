package br.com.seteideias.awssqs.service;

import br.com.seteideias.awssqs.consumer.MyMessage;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.stereotype.Service;

@Service
public class PubMessageService {

    private final SqsTemplate sqsTemplate;

    public PubMessageService(SqsTemplate sqsTemplate) {
        this.sqsTemplate = sqsTemplate;
    }

    public void newMessage (final MyMessage myMessage) {
        var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";
        sqsTemplate.send(SQS, myMessage);
    }

}
