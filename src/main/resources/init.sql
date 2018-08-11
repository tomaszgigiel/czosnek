CREATE TABLE czosnek_v0001_input_lines (
  id BIGINT PRIMARY KEY,
  filename VARCHAR(999),
  inserting_timestamp TIMESTAMP,
  line_hash VARCHAR(999),
  line VARCHAR(9999))
;

CREATE INDEX czosnek_v0001_input_lines_filename ON czosnek_v0001_input_lines(filename);
CREATE INDEX czosnek_v0001_input_lines_inserting_timestamp ON czosnek_v0001_input_lines(inserting_timestamp);
CREATE INDEX czosnek_v0001_input_lines_hash ON czosnek_v0001_input_lines(line_hash);
