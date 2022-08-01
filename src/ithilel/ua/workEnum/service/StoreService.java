package ithilel.ua.workEnum.service;

import ithilel.ua.workEnum.dto.UserDto;
import ithilel.ua.workEnum.model.Store;
import ithilel.ua.workEnum.model.User;

public class StoreService {


    private User authorizedUser;

    public boolean login(String login,String password,Store store){
        User user = new User(login,password);
        this.authorizedUser = user;
        User[] users = store.getUsers();
        boolean contains = false;

        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getLogin()) && password.equals(users[i].getPassword()) ){
                contains =true;
                authorizedUser = users[i];
                break;
            }
        }
        return contains;
    }

    public void gerCurrentRights() {
        String role = authorizedUser.getRole();
        switch (role){
            case "Директор":{
                System.out.println("Директор магазина, может управлять кадрами и ценами");
                break;
            }
            case "Администратор":{
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            }
            case "Менеджер":{
                System.out.println("Менеджер магазина, может обзатся с клиентами");
                break;
            }
            case "Клиент":{
                System.out.println("Клиент магазина, может покупать товары и польховаться дисконтом");
                break;
            }
            default:
                System.out.println("Анонимный пользователь, может покупать товары и/или авторизоваться");
        }
    }

    public void logout(){
        this.authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }

}
