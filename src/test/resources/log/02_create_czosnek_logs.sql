CREATE TABLE czosnek_logs (
  id BIGINT PRIMARY KEY,
  log_timestamp TIMESTAMP,
  source VARCHAR(99),
  message VARCHAR(99)
)
;

CREATE INDEX czosnek_logs_log_timestamp ON czosnek_logs(log_timestamp);
CREATE INDEX czosnek_logs_source ON czosnek_logs(source);
CREATE INDEX czosnek_logs_message ON czosnek_logs(message);
