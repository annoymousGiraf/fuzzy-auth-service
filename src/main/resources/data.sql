DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  uname VARCHAR(250) DEFAULT NULL,
  is_active BIT DEFAULT 1
);

INSERT INTO users (first_name, last_name, uname,is_active) VALUES
  ('Aliko', 'Dangote', 'bono',1),
  ('Bill', 'Gates', 'Bbill',0),
  ('Folrunsho', 'Alakija', 'agent',1);