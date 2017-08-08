package com.cf.hibernate.test;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GenerateTable {
	public void generateTable() {
		Configuration config = new AnnotationConfiguration().configure();  
        
        SchemaExport export = new SchemaExport(config);  
          
        export.create(true, true);  
	}
}
