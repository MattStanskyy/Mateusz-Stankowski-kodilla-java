package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String nick;
    private String mailAdress;

    public User(String name, String surname, String nick, String mailAdress) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.mailAdress = mailAdress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }

    public String getMailAdress() {
        return mailAdress;
    }
}
