-- ����(�׷�) �Լ�
select * from student;
select sum(height), sum(weight) from student;
select avg(height) as "���Ű", avg(weight) as "��� ������", max(height) as "���� ū Ű", min(height) as "���� ���� Ű" from student;

select count(*) from professor;
select count(bonus), count(name) from professor;

select * from emp2;

select rank(68000000) within GROUP (order by pay desc)
    from emp2;
    
select rank(90) within GROUP (order by bonus desc)
    from professor
    where bonus is not null; -- �̷��� ���� ������ �� �� �ִ�. null�� �켱������ �� ����.

select name, pay, bonus 
    from professor order by bonus desc;

-- any, all
select * 
    from gift
    where g_end < any(200000, 500000); -- �� �� ū ������ ���� ���� ���

select * 
    from gift
    where g_end > any(200000, 500000); -- �� �� ���� ������ ū ���� ���

select * 
    from gift
    where g_end < all(200000, 500000); -- �� �� ���� ������ ���� ���� ���
    
select * 
    from gift
    where g_end > all(200000, 500000); -- �� �� ū ������ ū ���� ���
    
    
-- ��������
-- CONSTRAINT ��Ī PRIMARY key, ��Ī : ���̺��_�ʵ��_����  ex) board_id_pk
-- primary key�� �ߺ� �Ұ�, not null
CREATE TABLE userlist (
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY KEY,
    name VARCHAR2(10) --not null
);

select * from userlist;
insert into userlist values('yeri', 'yeji');
insert into userlist(name) values('this_is_name'); -- ������ �� ���ٴ� ���� �߻�.
insert into userlist(id) values('this_is_id'); -- ���������� ���Ե�.
insert into userlist(id) values('yeri'); -- ������ ���� ���ǿ� ���ص�. primary key�̹Ƿ� �ߺ� �Ұ�


-- foreign key
CREATE TABLE fk_member(
    code number(2) NOT NULL,
    id VARCHAR2(20) NOT NULL
    CONSTRAINT id_fk REFERENCES MEMBER(id), -- member ���̺� id�� �־����. ���� ������Ÿ���̾����.
    etc VARCHAR2(10)
);

select * from member;
desc member;

-- unique : null���, �ߺ� �Ұ���.
CREATE TABLE userlist2 (
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, -- primary key�� null �Ұ�, �ߺ� �Ұ�
    id_no char(13) CONSTRAINT id_no_un unique -- unique : null ����, �ߺ� �Ұ�.
);

select * from userlist2;

insert into userlist2 values('yerii', '1234');
insert into userlist2(id) values('gildong');
insert into userlist2(id, id_no) values('gildong2', '1234');
insert into userlist2(id_no) values('1004');