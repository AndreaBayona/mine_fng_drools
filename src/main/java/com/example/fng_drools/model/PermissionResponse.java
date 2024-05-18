package com.example.fng_drools.model;

import com.example.fng_drools.enums.ActionRole;

public class PermissionResponse {
    private boolean hasPermissionForAction;
    private String message;
    private ActionRole actionType;
    private String userId;

    public PermissionResponse(String userId) {
        this.userId = userId;
    }

    public PermissionResponse(boolean hasPermissionForAction, String message, ActionRole actionType, String userId) {
        this.hasPermissionForAction = hasPermissionForAction;
        this.message = message;
        this.actionType = actionType;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isHasPermissionForAction() {
        return hasPermissionForAction;
    }

    public void setHasPermissionForAction(boolean hasPermissionForAction) {
        this.hasPermissionForAction = hasPermissionForAction;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ActionRole getActionType() {
        return actionType;
    }

    public void setActionType(ActionRole actionType) {
        this.actionType = actionType;
    }
}
