package ithilel.ua.workEnum.view;

import ithilel.ua.workEnum.dto.StoreDto;
import ithilel.ua.workEnum.dto.UserDto;
import ithilel.ua.workEnum.model.Store;
import ithilel.ua.workEnum.service.StoreService;

import java.util.Scanner;

public class StoreView {
    private StoreService service = new StoreService();
    public void initialization(Store store){
        for (int i = 0;; i++) {
            if(store.getAuthorizedUser() == null){
                tryLogin(service,store);
            }
            continue;
        }
    }

    public void tryLogin(StoreService service,Store store) {

        System.out.println("Введите логин:");
        Scanner loginScanner = new Scanner(System.in);
        String login = loginScanner.nextLine();


        System.out.println("Введите пароль:");
        String password = loginScanner.nextLine();

        if(service.login(login,password,store)){

            service.gerCurrentRights();
            service.logout();
        }else{
            System.out.println("Неверный логин и/или пароль");
        }
    }
}
