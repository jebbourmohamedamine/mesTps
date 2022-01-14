package cigma.pfe.controllers;

import cigma.pfe.dao.ClientDaoImpl;
import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class ClientController {
    ClientService clientService;
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }
    public Client save(Client c ){
        System.out.println("ClientController level...");
        return IClientDao.save(c);
    }
    public ClientController() {
        System.out.println("Call ClientController ....");
    }
}
