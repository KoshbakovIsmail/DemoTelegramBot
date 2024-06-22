--liquibase formatted sql
-- changelog koshbakov: create_notification_task
CREATE TABLE notification_task
(
id serial
message TEXT NOT NULL,
chat_id BIGINT NOT NULL,
dataTime TIMESTAMP NOT NULL
)