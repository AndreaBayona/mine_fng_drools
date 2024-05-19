package com.example.fng_drools.service;

import com.example.fng_drools.enums.ActionRole;
import com.example.fng_drools.model.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import static com.example.fng_drools.Creators.createPortal;

public class CreditOpeningService {
    private final KieContainer kieContainer;

    public CreditOpeningService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public CreditOpeningResponse isFileContentValid(User user, CreditQuotaOpening[] creditQuotaOpenings) {
        CreditOpeningResponse response = new CreditOpeningResponse(user.getId());

        Portal portal = createPortal();
        Action createCuposAction = new Action(ActionRole.GENERATE_CUPOS_PORTAL);

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("creditOpeningResponse", response);
        kieSession.insert(portal);
        kieSession.insert(user);
        kieSession.insert(createCuposAction);

        for (CreditQuotaOpening opening : creditQuotaOpenings) {
            System.out.printf("Processing: %s%n", opening);
            opening.setPortal(portal);
            kieSession.insert(opening);
        }

        kieSession.fireAllRules();
        kieSession.dispose();

        return response;
    }
}
