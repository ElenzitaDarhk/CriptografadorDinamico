package org.ecp.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Algorithm")
public class Algorithm  extends PanacheEntity {
	
	@Column(name = "name", nullable = false)
    public String name;
}