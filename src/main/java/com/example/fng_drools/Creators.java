package com.example.fng_drools;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.fng_drools.model.*;
import org.kie.api.runtime.KieSession;

public class Creators {

	public static Portal createPortal() {
		// Create an ArrayList to hold User objects
		ArrayList<Intermediary> intermediaries = new ArrayList<>();

		// Create 5 dummy User objects and add them to the ArrayList
		intermediaries.add(new Intermediary("1016495221", "Banco A"));
		intermediaries.add(new Intermediary("1016495222", "Banco B"));
		intermediaries.add(new Intermediary("1016495223", "Banco C"));
		intermediaries.add(new Intermediary("1016495224", "Banco D"));
		intermediaries.add(new Intermediary("1016495225", "Banco E"));

        ArrayList<Integer> municipalityCodes = new ArrayList<>(Arrays.asList(5001, 5002, 5004, 5005, 5006));
		
		ArrayList<Role> roles = new ArrayList<>();
		roles.add(new Role(Role.ADMIN_ROLE_ID, Role.RoleType.ADMIN));
		roles.add(new Role(Role.READ_ONLY, Role.RoleType.READ_ONLY));


        return new Portal(intermediaries, municipalityCodes, roles);
	}
}
