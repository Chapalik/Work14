package ithilel.ua.workEnum.controller;


import ithilel.ua.workEnum.model.Store;
import ithilel.ua.workEnum.model.User;

public class StoreController {
    public void addStoreData(Store store, User[] users, String name, String URL) {
        store.setUsers(users);
        store.setStoreName(name);
        store.setStoreURL(URL);
    }

}
