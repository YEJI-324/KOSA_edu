-- 연습문제 1] emp 테이블을 사용하여 empno 를 사원번호 , ename 을 사원명 , job 을 직업으로 별명을 설정하여 출력하세요. 
select empno 사원번호, ename 사원명, job 직업
    from emp;    

-- 연습문제 2] dept 테이블을 사용하여 deptno 를 부서# , dname 부서명 , loc 를 위치로 별명을 설정하여 출력하세요.
select deptno 부서, dname 부서명, loc 위치
    from dept;
    
-- 연결 연산자 문제 1] 학생 테이블(student)을 사용하여 
                --모든 학생들이 ‘서진수 의 키는 180 cm, 몸무게는 55 kg 입니다'와 같은 형식으로 출력되도록 리터럴 문자를 추가하고 , 
                --칼럼이름은 “학생의 키와 몸무게”라는 별명으로 출력해 보세요.
select 