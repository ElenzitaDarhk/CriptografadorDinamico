package org.ecp.service;

import java.util.List;

import org.ecp.model.Configuration;

public class ConfigurationService {
	
	public static List<Configuration> findLastEnableByAppClientId(long appClientId) {
        return Configuration.find("appClientId", appClientId, "Enable", true).list();
    }
	
		public void updateConfiguration(Configuration configuration) {
		
	}
	
	private Configuration findLastEnableByAppClientId(Long appClientId)
	{
		
		return null;
	}
	
}
