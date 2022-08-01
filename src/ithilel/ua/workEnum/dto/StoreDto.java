package ithilel.ua.workEnum.dto;

public class StoreDto {

   private String storeName;

   private String storeURL;

   private UserDto[] users;

   private UserDto authorizedUser = null;


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreURL() {
        return storeURL;
    }

    public void setStoreURL(String storeURL) {
        this.storeURL = storeURL;
    }

    public UserDto[] getUsers() {
        return users;
    }

    public void setUsers(UserDto[] users) {
        this.users = users;
    }

    public UserDto getAuthorizedUser() {
        return authorizedUser;
    }

}
