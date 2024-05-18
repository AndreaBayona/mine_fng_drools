package com.example.fng_drools.model;


public class PermissionRequest {
    private User user;
    private Action action;

    public PermissionRequest(User user, Action action) {
        this.user = user;
        this.action = action;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
