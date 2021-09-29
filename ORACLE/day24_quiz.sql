-- 문제 1] emp2테이블에서 deptno(부서)별로 pay 합과 평균 구하기
select deptno, sum(pay), avg(pay)
    from emp2
    group by(deptno);

-- 문제 2] emp2테이블에서 emp_type별로 pay 합과 평균 구하기
select emp_type, sum(pay), avg(pay)
    from emp2
    group by emp_type;

-- 문제 3] emp2테이블에서 직급별(position) 급여의 합, 평균
select position, sum(pay), round(avg(pay),0)
    from emp2
    where position is not null
    group by position;

-- 문제 4] emp2테이블에서 직급별(position) 급여의 합, 평균 구하는데
        -- 직급이 과장인 사람들만 출력하기
select position, sum(pay), avg(pay)
    from emp2
    group by position
    having position='과장';
    

-- Oracle SQL_PLSQL_PPT > 2, 3장 실습  
-- 문자 함수 퀴즈 1) 2장 19페이지
-- Student 테이블을 참조해서 아래 화면과 같이 1 전공이(deptno1 컬럼) 
-- 101번인 학생의 이름과 전화번호와 지역번호를 출력하세요. 
-- 단 지역번호는 숫자만 나와야 합니다.

select name, tel, substr(tel, 1, instr(tel, ')')-1) "지역번호"
    from student
    where deptno1 = 101;

-- 문자 함수 퀴즈 3)
-- Dept2 테이블을 사용하여 dname 을 1234567890을 rpad하기

select dname, rpad(dname, 10, substr('1234567890', length(dname)+1)) "rpad 연습" from dept2;
