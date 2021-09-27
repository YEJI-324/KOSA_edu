select sysdate from dual;

-- table ����
/*
create table ���̺��̸� (
	�÷��� datatype [null|not null] [constraint ��Ī ��������],
    �÷��� datatype [null|not null] [constraint ��Ī ��������]
) 
*/
create table Test (
    name VARCHAR2(10),
    age number(3)
);

-- insert
-- INSERT INTO ���̺� VALUES (��ü COLUMN�� ���� VALUE_LIST);
insert into test values('aa', 10);
-- INSERT INTO ���̺� ��(COLUMN_LIST) VALUES (COLUMN_LIST�� ���� VALUE_LIST);
insert into test(age, name) VALUES(22,'bb');

--������ ���������� ���� ������ �Է°���
insert into test(name) values('cc');
insert into test(age) values(30);

select * from test;

--���̺� ���� drop
-- DROP TABLE ���̺��;
drop table test;

--��������
create table Test (
    name VARCHAR2(10) not null,
    age number(3)
);

--name�� not null ���������� �����Ƿ� ���� �Ұ�
insert into test(name) values('cc');
--age�� ���������� �����Ƿ� ���� ����
insert into test(age) values(30);


-- select ��ɾ�
select * from emp2;
select empno, name, deptno from emp2;

-- ���� where
select *
    from emp2
    where name='�����';
    
select *
    from emp2
    where name like '��%';
    
select *
    from professor
    where name like '__'; -- �̸��� �α����� ��� �˻�
    
-- ��� �����ϱ� order by
select *
    from professor
    order by name desc;
    
select *
    from professor
    order by name desc, pay desc, position;
    
select *
    from professor
    where deptno like '20%'
    order by 2 desc, 5 desc, 4;
    
select name, empno, position
    from emp2
    where position='����';
    
select *
    from professor
    where pay<=350;

select * 
    from professor
    where pay > 350 or pay < 200;
    
select *
    from emp2
    where hobby='����' or hobby='���';
    
select *
    from emp2
    where hobby='����' and emp_type='������';
    
select empno as "�����ȣ", name "�� ��", position "����", pay "�� ��"
    from emp2;

select distinct position from professor;

