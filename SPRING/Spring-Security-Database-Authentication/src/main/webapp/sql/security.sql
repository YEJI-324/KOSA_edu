CREATE TABLE users (
user_id INT(10) UNSIGNED NOT NULL PRIMARY KEY,
user_name VARCHAR(50) NOT NULL,
password VARCHAR(50) NOT NULL,
enabled boolean
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

------------------------------------------------------------
CREATE TABLE users (
	user_id  NUMBER   PRIMARY KEY,
	user_name VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	enabled  NUMBER(1)
);

select * from USERS;
drop table users;

------------------------------------------------------------------
CREATE TABLE user_roles (
  user_role_id INT(10) UNSIGNED NOT NULL PRIMARY KEY,
  user_id INT(10) UNSIGNED NOT NULL,
  authority VARCHAR(45) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
-----------------------------------------------------------------------

CREATE TABLE user_roles (
  user_role_id  NUMBER(10)  NOT NULL PRIMARY KEY,
  user_id  NUMBER(10)  NOT NULL,
  authority VARCHAR(45) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (user_id)
);

select * from user_roles;
---------------------------------------------------------------------------
INSERT INTO users (user_id, user_name, password, enabled)
		VALUES (1, 'kingsmile', '1004', 1);
 
INSERT INTO user_roles (user_role_id, user_id, authority)
		VALUES (1, 1, 'ROLE_USER');
		
---------------------------------------------------
select * from USERS;		
select * from user_roles;