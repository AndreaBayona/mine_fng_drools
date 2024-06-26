package com.example.fng_drools.web;


import com.example.fng_drools.model.*;
import com.example.fng_drools.service.FileFormatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getFileFormatValidation")
public class FileFormatController {
    private final FileFormatService service;

    public FileFormatController(FileFormatService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<FileFormatResponse> getFileFormatValidation(@RequestBody FileFormatRequest requestBody) {
        FileFormatResponse res = service.isFileFormatValid(requestBody.getUser(), requestBody.getFileInfo());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
