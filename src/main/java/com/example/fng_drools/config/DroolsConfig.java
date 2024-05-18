package com.example.fng_drools.config;

import com.example.fng_drools.service.CreditOpeningService;
import com.example.fng_drools.service.FileFormatService;
import com.example.fng_drools.service.PermissionService;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    private static final String RULES_DRL = "rules/fng_rules.drl";


    @Bean
    public KieContainer kieContainer() {
        final KieServices kieServices = KieServices.Factory.get();
        System.out.println(kieServices);
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        System.out.println(kieFileSystem);
        System.out.println(ResourceFactory.newClassPathResource(RULES_DRL));
        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_DRL));
        System.out.println(kieFileSystem);
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }

    @Bean
    public PermissionService permissionService(KieContainer kieContainer) {
        return new PermissionService(kieContainer);
    }

    @Bean
    public FileFormatService fileFormatService(KieContainer kieContainer) {
        return new FileFormatService(kieContainer);
    }

    @Bean
    public CreditOpeningService creditOpeningService(KieContainer kieContainer) {
        return new CreditOpeningService(kieContainer);
    }
}
