select * from users;

drop table users;

create table users (
    id number not null primary key,
    name varchar2(50) not null,
    password varchar2(50) not null,
    enabled number(1)        -- boolean 타입으로 설정도 가능
);

create table roll (
    role_id number not null primary key,
    id number not null,
    authority varchar2(50) not null,
    foreign key(id) references users(id)
);

insert into users( id, name, password, enabled) values (1, 'kingsmile', '1004', 1);
insert into users( id, name, password, enabled) values (2, 'happy', '11', 1);
insert into users( id, name, password, enabled) values (3, 'aa', 'a', 1);

insert into roll( role_id, id, authority) values (1, 1, 'ROLE_ADMIN');
insert into roll( role_id, id, authority) values (2, 2, 'ROLE_USER');

-----------------------------------------------------------------------
-- USER SQL
CREATE USER springuser IDENTIFIED BY 1004 
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP";

-- QUOTAS

-- ROLES
GRANT "RESOURCE" TO springuser WITH ADMIN OPTION;
GRANT "CONNECT" TO springuser WITH ADMIN OPTION;
ALTER USER springuser DEFAULT ROLE "RESOURCE","CONNECT";

-- SYSTEM PRIVILEGES





CREATE TABLE TNOTICES
(
	"SEQ" VARCHAR2(10 BYTE), 
	"TITLE" VARCHAR2(200 BYTE), 
	"WRITER" VARCHAR2(50 BYTE), 
	"CONTENT" VARCHAR2(4000 BYTE), 
	"REGDATE" TIMESTAMP (6), 
	"HIT" NUMBER, 
	"FILESRC" VARCHAR2(500 BYTE)
);

CREATE TABLE "TMEMBER"
(	
    "UID" VARCHAR2(50 BYTE), 
    "PWD" VARCHAR2(50 BYTE), 
    "NAME" VARCHAR2(50 BYTE), 
    "GENDER" VARCHAR2(10 BYTE), 
    "BIRTH" VARCHAR2(10 BYTE), 
    "IS_LUNAR" VARCHAR2(10 BYTE), 
    "CPHONE" VARCHAR2(15 BYTE), 
    "EMAIL" VARCHAR2(200 BYTE), 
    "HABIT" VARCHAR2(200 BYTE), 
    "REGDATE" DATE
);
 
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(1,'title_1','writer_1','content_1',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(2,'title_2','writer_2','content_2',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(3,'title_3','writer_3','content_3',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(4,'title_4','writer_4','content_4',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(5,'title_5','writer_5','content_5',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(6,'title_6','writer_6','content_6',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(7,'title_7','writer_7','content_7',SYSDATE,0,'');
INSERT INTO NOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(8,'title_8','writer_8','content_8',SYSDATE,0,'');
INSERT INTO NOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(9,'title_9','writer_9','content_9',SYSDATE,0,'');
INSERT INTO TNOTICES(seq,title,writer,content,regdate,hit,filesrc)
VALUES(10,'title_10','writer_10','content_10',SYSDATE,0,'');
COMMIT;




--게시판 쿼리
SELECT * FROM
		( SELECT ROWNUM NUM, N.* 
      FROM (
              SELECT * 
              FROM TNOTICES
              WHERE TITLE LIKE '%%' ORDER BY REGDATE DESC
            ) N
    )
		WHERE NUM BETWEEN 1 AND 5;
