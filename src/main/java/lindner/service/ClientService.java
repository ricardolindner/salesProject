package lindner.service;

import lindner.model.Client;
import lindner.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService (ClientRepository repository){
        this.repository = repository;
    }

    public void saveClient(Client client) {
        clientValidation(client);
        repository.persist(client);
    }

    public void clientValidation(Client client) {
        //validation
    }
}
