CREATE TABLE ch_Test (
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL
        CHECK (age BETWEEN 20 AND 30)
);

insert into ch_test values('park', 22);
insert into ch_test values('kang', 32);
insert into ch_test values('kim', 50);
insert into ch_test values('lee', 45);

select * from ch_test;
