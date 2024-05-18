package com.example.fng_drools.web;

import com.example.fng_drools.model.Action;
import com.example.fng_drools.model.PermissionRequest;
import com.example.fng_drools.model.PermissionResponse;
import com.example.fng_drools.model.User;
import com.example.fng_drools.service.PermissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/getPermissionsValidation")
public class PermissionsController {

    private static final Logger logger = Logger.getLogger(PermissionService.class.getName());
    private final PermissionService permissionsService;

    public PermissionsController(PermissionService permissionsService) {
        logger.info("====================PermissionService==========================");
        logger.info(permissionsService.toString());
        this.permissionsService = permissionsService;
    }

    @PostMapping("")
    public ResponseEntity<PermissionResponse> getPermissionsValidation(@RequestBody PermissionRequest requestBody) {
        logger.info("=================getPermissionsValidation=============================");
        logger.info(requestBody.getAction().toString());
        logger.info(requestBody.getUser().toString());
        PermissionResponse res = permissionsService.hasPermissionsForAction(requestBody.getUser(), requestBody.getAction());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
