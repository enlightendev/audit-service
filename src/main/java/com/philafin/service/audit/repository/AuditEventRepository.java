package com.philafin.service.audit.repository;

import com.philafin.service.audit.domain.AuditEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 */
@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface AuditEventRepository extends JpaRepository<AuditEvent, Long> {

}
