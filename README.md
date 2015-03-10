## About

Service that provides restful endpoints for audit tracking.

## Dev

#### initial dev creation
- using spring initializr web service: http://start.spring.io/
- created mysql db schema: CREATE SCHEMA `audit_service` ;
- created db user: "audit_svc_app"
- updated application.properties with db properties
- created schema.sql
- created domain object
- created repository abstraction.

## Reference
- https://spring.io/guides/gs/spring-boot/
- https://spring.io/guides/gs/actuator-service/
- http://start.spring.io/




## CURL


- create
curl -i -X POST -H "Content-Type:application/json" -d "@event.json" http://localhost:8880/events
