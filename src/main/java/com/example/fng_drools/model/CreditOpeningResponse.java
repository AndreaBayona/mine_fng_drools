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

    // Method to add an error message for a specific element and field
    public void addErrorMessage(String elementKey, String fieldKey, String errorMessage) {
        // Check if the errors map already contains errors for the given element
        if (!errors.containsKey(elementKey)) {
            errors.put(elementKey, new HashMap<>());
        }

        // Get the map of errors for the given element
        Map<String, String> fieldErrors = errors.get(elementKey);

        // Add the error message for the specified field
        fieldErrors.put(fieldKey, errorMessage);
    }

    public Map<String, Map<String, String>> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Map<String, String>> errors) {
        this.errors = errors;
    }
}
