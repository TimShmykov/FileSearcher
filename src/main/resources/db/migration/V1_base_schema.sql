CREATE TABLE files_data (
    id      BIGSERIAL   PRIMARY KEY,
    name                VARCHAR NOT NULL,
    parent_id           VARCHAR
);

