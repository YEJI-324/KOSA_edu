select sysdate from dual;

-- table 생성
/*
create table 테이블이름 (
	컬럼명 datatype [null|not null] [constraint 별칭 제약조건],
    컬럼명 datatype [null|not null] [constraint 별칭 제약조건]
) 
*/
create table Test (
    name VARCHAR2(10),
    age number(3)
);

-- insert
-- INSERT INTO 테이블병 VALUES (전체 COLUMN에 넣을 VALUE_LIST);
insert into test values('aa', 10);
-- INSERT INTO 테이블 병(COLUMN_LIST) VALUES (COLUMN_LIST에 넣을 VALUE_LIST);
insert into test(age, name) VALUES(22,'bb');

--지금은 제약조건이 없기 때문에 입력가능
insert into test(name) values('cc');
insert into test(age) values(30);

select * from test;

--테이블 제거 drop
-- DROP TABLE 테이블명;
drop table test;

--제약조건
create table Test (
    name VARCHAR2(10) not null,
    age number(3)
);

--name은 not null 제약조건이 있으므로 삽입 불가
insert into test(name) values('cc');
--age에 제약조건이 없으므로 삽입 가능
insert into test(age) values(30);


-- select 명령어
select * from emp2;
select empno, name, deptno from emp2;

-- 조건 where
select *
    from emp2
    where name='백원만';
    
select *
    from emp2
    where name like '백%';
    
select *
    from professor
    where name like '__'; -- 이름이 두글자인 사람 검색
    
-- 결과 정렬하기 order by
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
    where position='부장';
    
select *
    from professor
    where pay<=350;

select * 
    from professor
    where pay > 350 or pay < 200;
    
select *
    from emp2
    where hobby='독서' or hobby='등산';
    
select *
    from emp2
    where hobby='독서' and emp_type='정규직';
    
select empno as "사원번호", name "성 명", position "직급", pay "급 여"
    from emp2;

select distinct position from professor;

