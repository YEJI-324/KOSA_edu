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
   
-- subQuery 1
    
-- 문제1]emp2 평균 급여보다 작은 직원들 출력하세요.
select name, pay
    from emp2
    where pay < (select avg(pay) from emp2);

-- 문제2]학생 테이블에서 1학년(grade) 평균 키보다 큰 사람들 출력하세요.
select name, height
    from student
    where height > ( select avg(height) from student where grade=1);

-- 문제3]학생 테이블, 학과 테이블을 사용해서 '이윤나' 학생과 전공(deptno1)이 동일한 학생들의 이름과 학과 이름 출력하기
select s.name, d.dname
    from student s join department d
    on s.deptno1=d.deptno
    where s.deptno1=(select deptno1 from student where name='이윤나');

-- 문제4]교수 테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름, 입사일, 학과명을 출력하세오.
select p.name, p.hiredate, d.dname
    from professor p join department d
    on p.deptno=d.deptno
    where hiredate>(select hiredate from professor where name='송도권');

-- 문제5]학생 테이블에서 전공이 101인 학과의 평균 몸무게보다 무거운 학생들의 이름과 몸무게를 출력하세요.
select name, weight
    from student
    where weight > (select avg(weight) from student where deptno1=101);

-- subQuery 2

-- 1. EMP2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 
--    높은 사람의 이름과 직급,연봉을 출력하세요. 
--    단 연봉 출력 형식은 아래와 같이 천 단위 구분기호와 원 표시를 하세요
select name, position, to_char(pay, 'L999,999,999')
    from emp2
    where pay > (select min(pay) from emp2 where position='과장');

-- 2. student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 가장 적게 나가는 학생보다 적은 학생의 이름과 학년과 몸무게를 출력.
select name, grade, weight
    from student
    where weight < (select min(weight) from student where grade=4);

-- 3. student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력.
select grade, name, height
    from student
    where (grade, height) in (select grade, max(height) from student group by grade);

-- 4. professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 입사일, 학과명을 출력. 
--     단, 학과명순으로 오름차순 정렬.
select p.profno, p.name, p.hiredate, d.dname
    from professor p join department d
    on p.deptno=d.deptno
    where hiredate in (select min(hiredate) from professor group by deptno)
    order by d.dname asc;

-- View

-- 문제1] 30번 부서 사원들의 직위, 이름, 월급을 담은 view  테이블 만들기, 별칭 직위, 사원이름, 급여로 Alias 주고
--     월급이 2000보다 많은 사원들만 추출해서 뷰 만들기

create or replace view v_emp_30
    as select job 직위, ename 사원이름, sal 급여
        from emp
        where sal>2000 and deptno=30;

-- 문제2] 부서별(부분합==소계) 최대급여, 최소급여, 평균급여를 갖는 뷰 만들기
create or replace view v_emp_sal
    as select deptno, max(sal) 최대급여, min(sal) 최소급여, round(avg(sal), 2) 평균급여
        from emp
        group by deptno;
select * from v_emp_sal;

-- 문제3] 부서별 평균급여를 갖는 뷰를 만드는데, 평균 급여가 2000이상인 부서만 출력하세요.
create or replace view v_emp_avg_sal
    as select deptno, round(avg(sal), 2) 평균급여
        from emp
        group by deptno having avg(sal)>2000;
select * from v_emp_avg_sal;

-- 문제4] 직위별 총급여를 갖는 뷰 테이블 만들고, 직위(job)가 manager인 사원들은 제외하고 총급여가 3000이상인 사원들 출력하기
create or replace view v_emp_sal_position
    as select job, sum(sal) "총 급여"
        from emp
        where job != 'MANAGER' and job != lower('MANAGER') -- oracle에서 != 는 <>랑 같음
        group by job having sum(sal)>3000;

-- 문제7] 교수 테이블에서 테이블 구조만 복사된 c_professor 새로운 테이블 생성(이름, 직위, 입사일, 이메일, 홈페이지)하고 레코드 복사 하기
drop table c_professor;
create table c_professor 
    as select name, position, email, hpage from professor where 1=0;

insert into c_professor ( 
    select name, position, email, hpage from professor);

select * from c_professor;

-- 문제8] c_emp22 테이블의 구조물만 복사 c_emp22로 만드세요
create table c_emp22 as select * from emp where 1=0;

-- 문제9] emp 테이블에서 c_emp22에 직위가 'manager'인 사람들만 레코드 복사하시오.
insert into c_emp22 (
    select * from emp where job='MANAGER' or job=lower('MANAGER'));
select * from c_emp22;

-- 최종 Quiz
-- 자동증가 시퀀스명을 seq_test라고 지정하고 100 시작해서 100 증가
-- 테이블 seq_test 테이블(num, name, phone) 만들기
-- 레코드 3개 추가해서 확인하기

create sequence seq_test
    start with 100
    increment by 100;
    
create table seq_test_tab ( num number, name varchar2(10), phone varchar2(20));

insert into seq_test_tab values(seq_test.nextval, '김예지1', '010-0000-0001');
insert into seq_test_tab values(seq_test.nextval, '김예지2', '010-0000-0002');
insert into seq_test_tab values(seq_test.nextval, '김예지3', '010-0000-0003');

select * from seq_test_tab;