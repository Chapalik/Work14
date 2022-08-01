import ithilel.ua.workEnum.controller.StoreController;
import ithilel.ua.workEnum.enums.Roles;
import ithilel.ua.workEnum.model.Store;
import ithilel.ua.workEnum.model.User;
import ithilel.ua.workEnum.view.StoreView;

public class Main {

    public static void main(String[] args) {
        StoreController controller = new StoreController();
        User anonymous = new User("anonym","anonymPass");
        User manager= new User("manager","managerPass");
        manager.setRole(Roles.MANAGER.getLabel());
        manager.setName("Жбан Іван Іванович");
        User director= new User("director","directorPass");
        director.setRole(Roles.DIRECTOR.getLabel());
        director.setName("Крац Сергей Петрович");
        User client= new User("client","mclientPass");
        client.setRole(Roles.CLIENT.getLabel());
        client.setName("Кузнецов Евгений Сергеевич");
        User administrator= new User("administrator","administratorPass");
        administrator.setRole(Roles.ADMINISTRATOR.getLabel());
        administrator.setName("Голота Николай Николаевич");

        User[] users = new User[4];
        users[0] = manager;
        users[1] = director;
        users[2] = client;
        users[3] = administrator;

        Store store = new Store();

        controller.addStoreData(store,users,"У ваганыча","https://mystore.com");

        StoreView view = new StoreView();
        view.initialization(store);


    }


}