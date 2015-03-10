DROP TABLE IF EXISTS audit_event;

CREATE TABLE audit_event
(
    id                  INT NOT NULL AUTO_INCREMENT,
    app_id              VARCHAR(50),
    event_name          VARCHAR(50),
    entity_name         VARCHAR(50),
    created_at          TIMESTAMP,
    description         VARCHAR(255),
    user_name           VARCHAR(50),
    CONSTRAINT audit_event_pkey PRIMARY KEY (id)
);