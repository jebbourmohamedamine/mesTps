package cigma.pfe.dao;

//public class ClientDaoImpl implements IClientDao {
//    EntityManagerFactory emf =
//            Persistence.createEntityManagerFactory("unit_clients");
//    EntityManager em = emf.createEntityManager();
//    public ClientDaoImpl() {
//    } @
//            Override
//    public boolean save(Client c) {
//        em.getTransaction().begin();
//        em.persist(c);
//       em.getTransaction().commit();
//        return true;
//    }
//    }

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class ClientServiceImpl implements ClientService {
    private IClientDao dao;
    public void setDao(IClientDao dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }

    @Override
    public Client update(Client c) {
        return null;
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
}

