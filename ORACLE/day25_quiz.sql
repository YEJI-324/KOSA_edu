-- 문제 1] 교수테이블에서 전임강사만 추출해서 태이블 생성하기
create table c_professor
    as select * from professor where position='전임강사';

select * from c_professor;

-- 문제 2] emp 테이블에서 mgr이 7456번인 사람 추출해서 테이블 생성.
create table c_emp_7456
    as select * from emp2 where mgr=7456;

-- 문제 4] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되
--    컬럼명을 New Salary로 지정하여 출력하시오.
select empno, ename, sal, round((sal*1.15), 0) "New Salary" from emp;
select empno, ename, sal, cast((sal*1.15) as int) "New Salary" from emp;

--문제5]각 사원의 이름을 표시하고, 근무 달 수를 계산하여 컬럼명을 
--     Months_Works로 지정하고, 근무 달수를 기준으로 오래된 사람부터
--     정렬하여 출력하시오.
select ename, round(months_between(sysdate, hiredate), 0) "Months_Works"
    from emp
    order by "Months_Works" desc; -- 별칭으로도 정렬됨.

--문제6]사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
--    사원의 커미션은 'no commission'으로 출력하시오.
select ename, decode(comm, null, 'no commission', comm) commission
    from emp;
   
-- subQuery
    
-- 문제1]emp2 평균 급여보다 작은 직원들 출력하세요.

-- 문제2]학생 테이블에서 1학년(grade) 평균 키보다 큰 사람들 출력하세요.

-- 문제3]학생 테이블, 학과 테이블을 사용해서 '이윤나' 학생과 전공(deptno1)이 동일한 학생들의 이름과 학과 이름 출력하기

-- 문제4]교수 테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름, 입사일, 학과명을 출력하세오.

-- 문제5]학생 테이블에서 전공이 101인 학과의 평균 몸무게보다 무거운 학생들의 이름과 몸무게를 출력하세요.

-- subQuery 2
-- 1. EMP2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 
--    높은 사람의 이름과 직급,연봉을 출력하세요. 
--    단 연봉 출력 형식은 아래와 같이 천 단위 구분기호와 원 표시를 하세요

select name, position, to_char(pay, 'L999,999,999')
    from emp2
    where pay > (select min(pay) from emp2 where position='과장');

-- 2. student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 가장 적게 나가는 학생보다 적은 학생의 이름과 학년과 몸무게를 출력.
select * from student;

select name, grade, weight
    from student
    where weight < (select min(weight) from student where grade=4);

-- 3. student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력.
select grade, name, height
    from student
    where (grade, height) in (select grade, max(height) from student group by grade);

select grade, max(height) from student group by grade;

-- 4. professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 입사일, 학과명을 출력. 
--     단, 학과명순으로 오름차순 정렬.
select * from department;
select * from professor;
select p.profno, p.name, p.hiredate, d.dname
    from professor p join department d
    on p.deptno=d.deptno;
    
-- 학과별로 입사일이 가장 오래된 사람
select deptno, cast(months_between(sysdate, hiredate) as int)
    from professor ;
