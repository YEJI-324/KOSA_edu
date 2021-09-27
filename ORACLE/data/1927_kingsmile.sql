select * from tab;
select * from emp2;
select sysdate from dual;  -- dual 가상 테이블 

-- 테이블 생성
/*
create table 테이블이름(
    컬럼명 datatype [ null | not null ] [ constraint 별칭 제약조건 ] ,
    컬럼명 datatype [ null | not null ] [ constraint 별칭 제약조건 ] ,
    .....
)
*/
select * from test;
create table Test (
    name VARCHAR2(10), 
    age number(3) 
);
-- insert
-- INSERT INTO 테이블명 VALUES (전체 COLUMN에 넣을 VALUE_LIST);
insert into test values('aa', 10);
-- INSERT INTO 테이블명(COLUMN_LIST)VALUES (COLUMN_LIST에 넣을 VALUE_LIST); 
insert into test(age, name) values(22,'bb');

insert into test(name) values('dd');
insert into test(age) values(33);

-- 테이블 제거 drop
drop table test;
select * from test;
create table Test (
    name VARCHAR2(10) not null, 
    age number(3) 
);

-- select 명령어
/*
SELECT *
	FROM tables  ;
	[WHERE conditions; ]
*/
select * from emp2;
select empno, name, deptno from emp2;  -- 특정 필드만 보기

select * 
    from emp2
    where name='백원만';
    
select * 
    from emp2
    where name like '이%';   -- % : 모든, _ : 한문자 <== like


select * 
    from emp2
    where name like '_정%'; 

select * 
    from emp2
    where name like '%정%'; 

select * 
    from emp2
    where name like '__';  
    
select * 
    from professor
    where name like '__';   -- 이름이 두글자인 사람 검색 

select * 
    from professor
    order by name; -- 정렬 - 오름차순 : asc , 내림차순 : desc
    
select * 
    from professor
    order by name desc, pay desc, position;    

select * 
    from professor
    order by 2 desc, 5 desc, 4; 
    
select * 
    from professor
    where deptno like '20%'
    order by 2 desc, 5 desc, 4; 

select name, empno --, position 
    from emp2
    where position='부장';
    
select * 
    from professor
    where pay >= 350;
    --where pay <= 350;
 
select * 
    from professor
    --where pay >= 350;
    where pay <= 350
    --order by pay; -- asc : 오름차순   
    order by pay desc; -- desc : 내림차순   

select * 
    from professor
    --where pay >= 350;
    where pay <= 350
    --order by pay; -- asc : 오름차순   
    order by pay desc, name, profno asc; -- desc : 내림차순 
    
select * 
    from professor
    where pay < 350 or pay >=490;

select * 
    from emp2
    where hobby ='독서' or hobby='등산';
    
select * 
    from emp2
    where hobby ='독서' and emp_type='정규직';    
    
select empno as "사원번호", name "성  명", position 직급, pay "급    여"
    from emp2;    
    
select name || position || '님'
    from professor;
    
select distinct emp_type from emp2; -- distinct : 중복제거
select distinct position from professor;
    
    
    