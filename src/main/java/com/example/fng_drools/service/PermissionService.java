package com.example.fng_drools.service;

import com.example.fng_drools.model.Action;
import com.example.fng_drools.model.PermissionResponse;
import com.example.fng_drools.model.Portal;
import com.example.fng_drools.model.User;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.util.logging.Logger;

import static com.example.fng_drools.Creators.createPortal;


public class PermissionService {
    private static final Logger logger = Logger.getLogger(PermissionService.class.getName());


    private final KieContainer kieContainer;

    public PermissionService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public PermissionResponse hasPermissionsForAction(User user, Action action) {
        logger.info(user.toString());
        logger.info(action.toString());
        PermissionResponse permissionResponse = new PermissionResponse(user.getId());
        Portal portal = createPortal();

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("permissionResponse", permissionResponse);
        kieSession.insert(portal);
        kieSession.insert(action);
        kieSession.insert(user);
        kieSession.fireAllRules();
        kieSession.dispose();

        return permissionResponse;
    }
}
