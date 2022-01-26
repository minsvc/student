CREATE TABLE login
(
id int NOT NULL AUTO_INCREMENT,
name varchar(255) NOT NULL,
password varchar(255),
PRIMARY KEY (id)
);


INSERT INTO login values (1,'zs','abc');
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);



CREATE USER 'dbuser'@'%' IDENTIFIED BY 'cxvmdsflncxv@SDFCXVVXCVlsdf445fsdfsd';
GRANT ALL PRIVILEGES ON student.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;