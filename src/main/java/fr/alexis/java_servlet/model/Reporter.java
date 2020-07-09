package fr.alexis.java_servlet.model;

public class Reporter {

    public Reporter() {
    }

    private int id;

    private String pseudo;

    private int credit;

    public void setId(int id) {
        this.id = id;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getCredit() {
        return credit;
    }
}

