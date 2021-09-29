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

-- left outer join : ���ʿ� �ִ� ������ ���, ������ ��ġ�ϴ� �����͸�!
-- right outer join : �����ʿ� �ִ� ������ ���, ���� ��ġ�ϴ� �����͸�!
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
    
-- ������ ���̺� join
select * from professor; --16, name:�̸�, profno:������ȣ, deptno:����а�
select * from student; --20, name:�̸�, deptno1:������, deptno2:������, profno:������ȣ
select * from department; -- 12, deptno:������ȣ, dname:�����̸�

select s.name || ' �л��� ��米���� ' || p.name || ' �������̰�, ��� �а���' || d.dname
    from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno= s.deptno1
    where s.name='������';
    

