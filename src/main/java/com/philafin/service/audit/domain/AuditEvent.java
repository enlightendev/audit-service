package com.philafin.service.audit.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.sql.Timestamp;


/**
 */
@Entity
@Table(name = "audit_event")
public class AuditEvent extends AbstractPersistable<Long> {

    @Column(name = "app_id")
    private String appId;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "entity_name")
    private String entityName;

    @Column(name = "created_at")
    private Timestamp createdAt;

    private String description;

    @Column(name = "user_name")
    private String userName;

    public AuditEvent() {

    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
