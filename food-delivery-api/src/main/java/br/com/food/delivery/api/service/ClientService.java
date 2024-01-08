package br.com.food.delivery.api.service;

import br.com.food.delivery.api.model.Client;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class ClientService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(ClientService.class.getName());

    public Client findById(String Id) {
        logger.info("Finding one Client");
        Client client = new Client(counter.incrementAndGet(),"Client1","12345678911");
        return client;
    }
}
