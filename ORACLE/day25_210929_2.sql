-- subQuery
select * from emp2;
select * from emp2 where name='백원만';


-- 강의장 왔다!
-- 서브쿼리의 결과가 한 개 이상 반환될 때는 in, any, all 연산자를 사용함.
select empno, name, deptno
    from emp2
    where deptno in (1000, 1001, 1002, 1010, 2000, 2001);
    
select dcode from dept2 where area='서울지사';

select empno, name, deptno
    from emp2
    where deptno in (select dcode from dept2 where area='서울지사');