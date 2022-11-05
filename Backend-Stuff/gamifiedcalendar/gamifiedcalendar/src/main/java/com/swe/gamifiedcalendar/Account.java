package com.swe.gamifiedcalendar;

import java.util.Objects;

public class Account {
    private int accountID;
    private String username;
    private String email;
    private String password;
    private int bestStreak;
    private int currentStreak;
    private int totalPoints;

    public Account(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.bestStreak = 0;
        this.currentStreak = 0;
        this.totalPoints = 0;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBestStreak() {
        return bestStreak;
    }

    public void setBestStreak(int bestStreak) {
        this.bestStreak = bestStreak;
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public void setCurrentStreak(int currentStreak) {
        this.currentStreak = currentStreak;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return  Objects.equals(getAccountID(), account.getAccountID()) &&
                Objects.equals(getUsername(), account.getUsername()) &&
                Objects.equals(getEmail(), account.getEmail()) &&
                Objects.equals(getPassword(), account.getPassword()) &&
                Objects.equals(getBestStreak(), account.getBestStreak()) &&
                Objects.equals(getCurrentStreak(), account.getCurrentStreak()) &&
                Objects.equals(getTotalPoints(), account.getTotalPoints());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountID(), getUsername(), getEmail(), getPassword(), getBestStreak(), getCurrentStreak(), getTotalPoints());
    }
}