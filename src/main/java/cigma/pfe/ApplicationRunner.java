package cigma.pfe;

//import cigma.pfe.controllers.ClientController;
//import cigma.pfe.models.Client;
//public class MonApplication {
//    public static void main(String[] args) {
//        ClientController ctrl1 = new ClientController();
//        Client client =new Client(1L,"testing");
//        ctrl1.save(client);
//   }
//}

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class MonApplication {
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        ClientController ctrl = (ClientController)
//                context.getBean("controller");
//    }
//}
public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("idCtrl");
        Client clt = new Client("OMAR");
        ctrl.save(clt);
    }
}

