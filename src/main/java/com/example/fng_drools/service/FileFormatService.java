package com.example.fng_drools.service;

import com.example.fng_drools.enums.ActionRole;
import com.example.fng_drools.model.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import static com.example.fng_drools.Creators.createPortal;

public class FileFormatService {
    private final KieContainer kieContainer;

    public FileFormatService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public FileFormatResponse isFileFormatValid(User user, FileInfo fileInfo) {
        FileFormatResponse response = new FileFormatResponse(user.getId());
        Portal portal = createPortal();
        Action loadAnexo5Action = new Action(ActionRole.LOAD_ANEXO_5_FILE);
        loadAnexo5Action.setFileInfo(fileInfo);

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("fileFormatResponse", response);
        kieSession.insert(portal);
        kieSession.insert(user);
        kieSession.insert(loadAnexo5Action);
        kieSession.fireAllRules();
        kieSession.dispose();

        return response;
    }
}
