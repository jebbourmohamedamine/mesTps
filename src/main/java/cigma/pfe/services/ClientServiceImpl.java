package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.ClientDaoImpl;

public class ClientServiceImpl implements ClientService{
    ClientDaoImpl clientRepository = new   ClientDaoImpl();
    @Override
    public boolean save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }
    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }
    }

