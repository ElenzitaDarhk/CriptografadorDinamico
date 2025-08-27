package org.ecp.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Configuration")
public class Configuration extends PanacheEntity {
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "appClientId")
	private AppClient appClient;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "algorithmId")
	private Algorithm algorithm;
	
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
	
    public static Configuration findEnable(Long appClientId) {
        return find("enable", true).firstResult();
    }
	
}