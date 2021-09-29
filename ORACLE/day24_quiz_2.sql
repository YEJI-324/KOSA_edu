-- 문제1] 사원들의 이름, 부서번호, 부서이름을 출력하라. (emp, DEPT table)
select e.ename 이름, d.deptno 부서번호, d.dname 부서이름
    from emp e join dept d
    on e.deptno=d.deptno;
    
-- 문제2] DALLAS에서 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 출력하라(dept table)
select e.ename 이름, e.job 직위, e.empno 부서번호, d.dname 부서이름
    from emp e join dept d
    on e.deptno=d.deptno
    where d.loc = 'DALLAS';

-- 문제3] 이름에 'A'가 들어가는 사원들의 이름과 부서이름을 출력하라(emp,dept)
select e.ename 이름, d.dname 부서이름
    from emp e join dept d
    on e.deptno=d.deptno
    where e.ename like '%A%';

--문제4] 사원이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 출력하는데 월급이 3000이상인 사원을 출력하라(emp,dept)
select e.ename 이름, d.dname 부서이름, e.sal 월급
    from emp e join dept d
    on e.deptno=d.deptno
    where e.sal>=3000;

-- 문제5] 직위가 'SALESMAN'인 사원들의 직위와 그 사원이름, 그리고 그 사원이 속한 부서 이름을 출력하라. (emp, dept)
select e.job 직위, e.ename 이름, d.dname 부서이름
    from emp e join dept d
    on e.deptno=d.deptno
    where e.job='SALESMAN';
    
-- 문제6] 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉 +커미션, 급여등급을 출력하되, 각각의 컬럼명을 '사원번호', '사원이름', '연봉', '실급여', '급여등급'으로 하여 출력하라.(emp, SALGRADE)
-- (비등가) 1:1 매핑 되는 컬럼이 없다.
select e.job 직위, e.empno 사원번호, e.ename 사원이름, e.sal 연봉, (e.sal + nvl(e.comm, 0)) 실급여, s.grade 급여등급
    from emp e join salgrade s
    on (e.sal + nvl(e.comm, 0)) between s.losal and s.hisal
    where e.comm is not null;

-- 문제7] 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라 (emp, DEPT, SALGRADE)
select d.deptno 부서번호, d.dname 부서이름, e.ename 사원이름, round((e.sal/12),0) 월급, s.grade 급여등급
    from emp e join dept d
    on e.deptno=d.deptno join salgrade s
    on (e.sal + nvl(e.comm, 0)) between s.losal and s.hisal
    where d.deptno=10;

-- 문제8] 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라. 그리고 그 출력된 결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하라(emp, dept, SALGRADE)
select d.deptno 부서번호, d.dname 부서이름, e.ename 사원이름, round((e.sal/12),0) 월급, s.grade 급여등급
    from emp e join dept d
    on e.deptno=d.deptno join salgrade s
    on (e.sal + nvl(e.comm, 0)) between s.losal and s.hisal
    where d.deptno in(10,20)
    order by d.deptno asc, round((e.sal/12),0) desc;

-- 문제9] 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호', '사원이름', '관리자번호','관리자이름'으로 하여 출력하라.(emp)
select * from emp;
select e.empno "사원번호", e.ename "사원이름", e.mgr "관리자번호", m.ename "관리자이름"
    from emp e join emp m
    on e.mgr=m.empno;
