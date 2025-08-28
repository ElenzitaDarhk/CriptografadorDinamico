package org.ecp.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.panache.common.Parameters;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Configuration")
public class Configuration extends PanacheEntity {
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "appClientId")
	public AppClient appClient;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "algorithmId")
	public Algorithm algorithm;
	
	@Column(name = "KeyWord" , nullable = false)
    public String keyWord;
	
	@Column(name = "InitialDate" , nullable = false)
    public LocalDateTime initialDate;
	
	@Column(name = "FinalDate", nullable = true)
    public LocalDateTime finalDate;
	
	@Column(name = "Enable" , nullable = false)
    public Boolean enable;
	
	@Column(name = "UpdateDate", nullable = true)
    public LocalDateTime updateDate;
	
    public static List<Configuration> findByAppClientId(Long appClientId) {
    	
    	return find("appClient.id", appClientId).list();
    }
	
    public static Configuration findByAppClientIdEnable(Long appClientId, boolean enable) {
    	
    	return find("appClient.id =?1 and enable = ?2", appClientId, enable).firstResult();
    }
	
}