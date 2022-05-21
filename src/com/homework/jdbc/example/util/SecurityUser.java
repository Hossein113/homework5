package com.homework.jdbc.example.util;


import com.homework.jdbc.example.domain.User;

public class SecurityUser {

    private User currentUser = null;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void logout() {
        this.currentUser = null;
    }
}
