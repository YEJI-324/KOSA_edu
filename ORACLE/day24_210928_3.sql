-- Join
select * from emp;
select * from dept;
select * from dept, emp;

select emp.ename, emp.job sal from emp;

select emp.ename, emp.job sal, dname, loc, dept.deptno
    from emp, dept;

-- inner join
select ename, job, sal, loc, d.deptno, dname
    from emp e inner join dept d
    on e.deptno = d.deptno;
    
desc emp;

insert into emp values(0202, 'yeri', 'manager', 7777, to_date('1-5-2012', 'dd-mm-yyyy'), 2850, null, 20);
select * from emp;

-- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만!
-- right outer join : 오른쪽에 있는 데이터 모두, 왼쪽 일치하는 데이터만!
select ename, job, sal, loc, d.deptno, dname
    from emp e left join dept d
    --from dept d left join emp e
    on e.deptno = d.deptno;
    --on d.deptno = e.deptno;

select ename, job, sal, loc, d.deptno, dname
    --from emp e right join dept d
    from dept d right join emp e
    -- on e.deptno = d.deptno;
    on d.deptno = e.deptno;
    
-- full outer join
select ename, job sal, loc, d.deptno, dname
    -- from emp e full outer join dept d
    from dept d full outer join emp e
    -- on e.deptno = d.deptno;
    on d.deptno = e.deptno;
    
-- 여러개 테이블 join
select * from professor; --16, name:이름, profno:교수번호, deptno:담당학과
select * from student; --20, name:이름, deptno1:주전공, deptno2:부전공, profno:교수번호
select * from department; -- 12, deptno:전공번호, dname:전공이름

select s.name || ' 학생의 담당교수는 ' || p.name || ' 교수님이고, 담당 학과는' || d.dname
    from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno= s.deptno1
    where s.name='서진수';
    

