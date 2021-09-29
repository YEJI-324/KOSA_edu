-- view

select * from emp;

create or replace view v_emp
    as select empno, ename, deptno from emp;
    
select * from v_emp;

-- 만약 emp 테이블 제거하면 v_emp도 안녕,,,,

create or replace view v_emp_30
    as select job, ename, sal from emp where deptno=30;
select * from v_emp_30;

-- rownum /rowid
select rownum, ename, sal from emp;
select rownum, ename, sal from emp where rownum=1; -- 이거 안됨,,ㅎ
-- rownum 은 화면에 보여주기 위한거지,,, 제어하기 위한 건 아님

-- rowid : 시스템이 자체적으로 지정하는 id
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
-- table별로 sequence 생성하기! 기존에 사용하던 sequence사용하면,, 1부터가 아닌,,, 기존에 사용하던 번호부터 사용될 수 있음.
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
insert into kosa_tab2 values(seq_board.nextval, 'ff'); -- cycle하기 전엔 이게 여섯번째라서 추가 안됨!

select * from kosa_tab2;

create sequence seq_freeboard;
insert into kosa_tab2 values(seq_freeboard.nextval, 'aaa');
insert into kosa_tab2 values(seq_freeboard.nextval, 'bbb');
insert into kosa_tab2 values(seq_freeboard.nextval, 'ccc');
insert into kosa_tab2 values(seq_freeboard.nextval, 'ddd');

delete from kosa_tab2 where num=4; -- 지운 값을 채우지 않음! 만약 3번을 삭제하고 다시 튜플을 삽입해도 3번이 아닌 다음 번호로 추가됨.