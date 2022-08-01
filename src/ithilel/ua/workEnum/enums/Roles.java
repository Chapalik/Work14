package ithilel.ua.workEnum.enums;

public enum Roles {
    ANONYMOUS("Аноним", 0),
    DIRECTOR("Директор", 1),
    ADMINISTRATOR("Администратор", 2),
    MANAGER("Менеджер", 3),
    CLIENT("Клиент", 4);


    private final String label;
    private final int Id;

    Roles(String label, int Id) {
        this.label = label;
        this.Id = Id;

    }

    public int getId() {
        return Id;
    }

    public String getLabel() {
        return label;
    }

    public static String defaultRole() {
        return Roles.ANONYMOUS.label;
    }

    ;
}
