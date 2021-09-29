-- decode
-- case

-- 테이블 복사 / 레코드 복사
select * from emp;
desc emp2;

drop table c_emp;

create table c_emp
    as select * from emp;

drop table c_emp_20;

-- 조건에 맞는 내용만 복사
create table c_emp_20
    as select * from emp where deptno=20;

select * from c_emp_20;

-- 레코드 없는 상태로 구조만 복사
create table c_emp3
    as select * from emp where 1=0;

-- 레코드 정렬해서 복사
drop table c_emp_30;
create table c_emp_30
    as select empno, ename, job, sal from emp
    order by ename desc, sal desc, empno asc;
select * from c_emp_30;
    
-- 레코드 복사


insert into c_emp(empno, ename, deptno) values(303, '예지', 40);

select * from emp
    union all -- 중복 레코드 포함
    select * from c_emp;

select * from c_emp2;

select * from emp
    union
    select * from c_emp_30; -- 필드 개수가 다르므로 오류

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


