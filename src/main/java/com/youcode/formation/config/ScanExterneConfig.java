package com.youcode.formation.config;

import com.youcode.externe.AuditExterne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan("com.youcode.externe")
@Import(AuditExterne.class)
public class ScanExterneConfig {
}
