package com.example.fng_drools.model;
import java.util.HashMap;
import java.util.Map;

public class CreditOpeningResponse {
    public String id;
    private Map<String, Map<String, String>> errors;


    public CreditOpeningResponse(String id) {
        this.id = id;
        errors = new HashMap<>();
    }

    public void addError(String key, Map<String, String> value) {
        errors.put(key, value);
    }

    public Map<String, Map<String, String>> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Map<String, String>> errors) {
        this.errors = errors;
    }
}
