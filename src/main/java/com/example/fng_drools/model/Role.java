package com.example.fng_drools.model;

import com.example.fng_drools.enums.ActionRole;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Role {
	
	public static final Integer ADMIN_ROLE_ID = 123;
	public static final Integer READ_ONLY = 456;
	
	private Integer id;
	private RoleType type;
	
	public enum RoleType {
	  ADMIN, READ_ONLY
	}
	 
	// Mapping from role types to allowed actions
    private static final Map<RoleType, Set<ActionRole>> roleActionsMap = new HashMap<>();

    static {
        // Define the allowed actions for each role type
        roleActionsMap.put(RoleType.ADMIN, EnumSet.of(ActionRole.LOAD_ANEXO_5_FILE, ActionRole.GENERATE_CUPOS_PORTAL, ActionRole.LOAD_ANEXO_18_FILE,
				ActionRole.MASS_CUPOS_CANCELLATION, ActionRole.CREATE_USER, ActionRole.DELETE_USER));
        roleActionsMap.put(RoleType.READ_ONLY, EnumSet.of(ActionRole.LOAD_ANEXO_5_FILE, ActionRole.GENERATE_CUPOS_PORTAL, ActionRole.LOAD_ANEXO_18_FILE,
				ActionRole.MASS_CUPOS_CANCELLATION));
    }
	
	
	public Role(Integer id, RoleType type) {
		this.id = id;
		this.type = type;
	}
	
    // Method to get the allowed actions for the role type
    public Set<ActionRole> getAllowedActions() {
        return roleActionsMap.get(type);
    }
    
    
    // Method to check if the role can perform a specific action
    public boolean canDoAction(String action) {
      try {
         // Convert the input action string to the Action enum
		  ActionRole actionEnum = ActionRole.valueOf(action.toUpperCase());
         // Check if the action is in the allowed actions set for the role type
         return getAllowedActions().contains(actionEnum);
      } catch (IllegalArgumentException e) {
         // If the action is not a valid Action enum, return false
         return false;
      }
    }
    

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public RoleType getType() {
		return type;
	}
	
	public void setType(RoleType type) {
		this.type = type;
	}
}
