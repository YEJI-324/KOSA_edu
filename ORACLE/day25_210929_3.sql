-- view

select * from emp;

create or replace view v_emp
    as select empno, ename, deptno from emp;
    
select * from v_emp;

-- ���� emp ���̺� �����ϸ� v_emp�� �ȳ�,,,,

create or replace view v_emp_30
    as select job, ename, sal from emp where deptno=30;
select * from v_emp_30;

-- rownum /rowid
select rownum, ename, sal from emp;
select rownum, ename, sal from emp where rownum=1; -- �̰� �ȵ�,,��
-- rownum �� ȭ�鿡 �����ֱ� ���Ѱ���,,, �����ϱ� ���� �� �ƴ�

-- rowid : �ý����� ��ü������ �����ϴ� id
select rownum, rowid from emp; 

-- sequence
drop sequence autonum;
create sequence autonum;
select autonum.nextval from dual;
select autonum.currval from dual;

create table kosa_tab (no number, name varchar2(10));

-- delete record
delete kosa_tab;

insert into kosa_tab values(autonum.nextval, 'aa');
insert into kosa_tab values(autonum.nextval, 'bb');
insert into kosa_tab values(autonum.nextval, 'cc');
-- table���� sequence �����ϱ�! ������ ����ϴ� sequence����ϸ�,, 1���Ͱ� �ƴ�,,, ������ ����ϴ� ��ȣ���� ���� �� ����.
select * from kosa_tab;

drop sequence seq_board;
create sequence seq_board
    start with 10
    increment by 10
    minvalue 2
    maxvalue 50
    cycle
    nocache;
    
create table kosa_tab2 (num number, name varchar2(10));
delete kosa_tab2;

insert into kosa_tab2 values(seq_board.nextval, 'aa');
insert into kosa_tab2 values(seq_board.nextval, 'bb');
insert into kosa_tab2 values(seq_board.nextval, 'cc');
insert into kosa_tab2 values(seq_board.nextval, 'dd');
insert into kosa_tab2 values(seq_board.nextval, 'ee');
insert into kosa_tab2 values(seq_board.nextval, 'ff'); -- cycle�ϱ� ���� �̰� ������°�� �߰� �ȵ�!

select * from kosa_tab2;

create sequence seq_freeboard;
insert into kosa_tab2 values(seq_freeboard.nextval, 'aaa');
insert into kosa_tab2 values(seq_freeboard.nextval, 'bbb');
insert into kosa_tab2 values(seq_freeboard.nextval, 'ccc');
insert into kosa_tab2 values(seq_freeboard.nextval, 'ddd');

delete from kosa_tab2 where num=4; -- ���� ���� ä���� ����! ���� 3���� �����ϰ� �ٽ� Ʃ���� �����ص� 3���� �ƴ� ���� ��ȣ�� �߰���.