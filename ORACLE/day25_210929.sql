-- decode
-- case

-- ���̺� ���� / ���ڵ� ����
select * from emp;
desc emp2;

drop table c_emp;

create table c_emp
    as select * from emp;

drop table c_emp_20;

-- ���ǿ� �´� ���븸 ����
create table c_emp_20
    as select * from emp where deptno=20;

select * from c_emp_20;

-- ���ڵ� ���� ���·� ������ ����
create table c_emp3
    as select * from emp where 1=0;

-- ���ڵ� �����ؼ� ����
drop table c_emp_30;
create table c_emp_30
    as select empno, ename, job, sal from emp
    order by ename desc, sal desc, empno asc;
select * from c_emp_30;
    
-- ���ڵ� ����


insert into c_emp(empno, ename, deptno) values(303, '����', 40);

select * from emp
    union all -- �ߺ� ���ڵ� ����
    select * from c_emp;

select * from c_emp2;

select * from emp
    union
    select * from c_emp_30; -- �ʵ� ������ �ٸ��Ƿ� ����

select empno, ename, job, sal from emp
    union
    select * from c_emp_30;

insert into c_emp3
    select * from emp;

rollback;

drop table c_emp5;
create table c_emp5
    as select empno, ename, hiredate, sal from emp;

select * from c_emp5;
desc emp;


