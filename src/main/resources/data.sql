INSERT INTO audit_event
(app_id, event_name, entity_name, created_at, description, user_name)
VALUES
  ('solar', 'loan-create', 'policy-abc', CURRENT_TIMESTAMP, 'user generated loan event', 'jlamadrid' );