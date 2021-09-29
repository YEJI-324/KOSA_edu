select name, deptno from professor where deptno in(101,201,301);

select * from professor where pay between 300 and 500; -- 300~500
select * from professor where pay not between 300 and 500; -- 300 미만, 500 초과

-- %, _, like
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';

select * from professor where hpage = null; -- 이렇게 한다고 null인게 나오지 않음.
--> null은 =이 아닌 is null로 뽑음
select * from professor where hpage is null;


-- update 명령어
-- UPDATE 테이블명 SET 수정되어야 할 칼럼명 = 수정되기를 원하는 새로운 값;  -- 레코드 전체 수정
-- UPDATE 테이블명 SET 수정되어야 할 칼럼명 = 수정되기를 원하는 새로운 값 whereh 조건;  --

select * from professor where position= '정교수';

update professor set pay = pay + 100;  -- 레코드 전체 수정
ROLLBACK; -- 취소
update professor set pay = pay + 100 where position= '정교수'; -- 조건에 맞는 레코드만 수정
commit; -- 완료

-- delete 명령어
-- DELETE [FROM] 삭제를 원하는 정보가 들어있는 테이블명; -- 레코드 전체 삭제(제거)
-- DELETE [FROM] 삭제를 원하는 정보가 들어있는 테이블명 where 조건; -- 조건에 맞는 레코드 삭제(제거)
delete from emp2;  
select * from professor where position like '정%';
delete professor where position like '정%';
select * from emp2;

update emp2 set name='너사장', hobby='게임' where name='나사장';
rollback; -- DML( select, update, delete, insert ) 명령어에 적용
-- truncate table 테이블이름 ;
truncate table emp2; --where deptno = 1000;

-- 연산자 
select mod(7, 3) "나눈 나머지 값" from dual;
-- null 연산은 결과가 무조건 널이다.
select * from professor;
desc professor;  -- 테이블의 구조 확인
-- nvl 함수
update professor set bonus = bonus + 1000 ;
update professor set bonus = nvl(bonus, 0) + 1000 ;
select bonus, nvl(bonus, 0) from professor; 

select name, deptno from professor where deptno = 101 or deptno = 201 or deptno = 301;
select name, deptno from professor where deptno in(101, 201, 301);  -- 권장

select name, deptno from professor where deptno != 101 and deptno != 201 and deptno != 301;
select name, deptno from professor where deptno not in(101, 201, 301); 

select * from professor;
select * from professor where pay between 300 and 500;
select * from professor where deptno between 103 and 300;

select * from professor where pay not between 300 and 500;
-- between 주의 사항
select * from professor where pay between 500 and 300; -- 앞에 값이 뒤에 값보다 항상 작아야한다.
-- % , _ , like
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';

select * from professor where email not like '__a%';
-- is null / is not null
select * from professor where hpage is null;
select * from professor where hpage is not null;






