-- ���� 1] �������̺��� ���Ӱ��縸 �����ؼ� ���̺� �����ϱ�
create table c_professor
    as select * from professor where position='���Ӱ���';

select * from c_professor;

-- ���� 2] emp ���̺��� mgr�� 7456���� ��� �����ؼ� ���̺� ����.
create table c_emp_7456
    as select * from emp2 where mgr=7456;

-- ���� 4] �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ�
--    �÷����� New Salary�� �����Ͽ� ����Ͻÿ�.
select empno, ename, sal, round((sal*1.15), 0) "New Salary" from emp;
select empno, ename, sal, cast((sal*1.15) as int) "New Salary" from emp;

--����5]�� ����� �̸��� ǥ���ϰ�, �ٹ� �� ���� ����Ͽ� �÷����� 
--     Months_Works�� �����ϰ�, �ٹ� �޼��� �������� ������ �������
--     �����Ͽ� ����Ͻÿ�.
select ename, round(months_between(sysdate, hiredate), 0) "Months_Works"
    from emp
    order by "Months_Works" desc; -- ��Ī���ε� ���ĵ�.

--����6]����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ���� 
--    ����� Ŀ�̼��� 'no commission'���� ����Ͻÿ�.
select ename, decode(comm, null, 'no commission', comm) commission
    from emp;
   
-- subQuery
    
-- ����1]emp2 ��� �޿����� ���� ������ ����ϼ���.

-- ����2]�л� ���̺��� 1�г�(grade) ��� Ű���� ū ����� ����ϼ���.

-- ����3]�л� ���̺�, �а� ���̺��� ����ؼ� '������' �л��� ����(deptno1)�� ������ �л����� �̸��� �а� �̸� ����ϱ�

-- ����4]���� ���̺��� �Ի����� �۵��� �������� ���߿� �Ի��� ����� �̸�, �Ի���, �а����� ����ϼ���.

-- ����5]�л� ���̺��� ������ 101�� �а��� ��� �����Ժ��� ���ſ� �л����� �̸��� �����Ը� ����ϼ���.

-- subQuery 2

-- 1. EMP2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� ������ 
--    ���� ����� �̸��� ����,������ ����ϼ���. 
--    �� ���� ��� ������ �Ʒ��� ���� õ ���� ���б�ȣ�� �� ǥ�ø� �ϼ���
select name, position, to_char(pay, 'L999,999,999')
    from emp2
    where pay > (select min(pay) from emp2 where position='����');

-- 2. student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� ���� ���� ������ �л����� ���� �л��� �̸��� �г�� �����Ը� ���.
select name, grade, weight
    from student
    where weight < (select min(weight) from student where grade=4);

-- 3. student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ���.
select grade, name, height
    from student
    where (grade, height) in (select grade, max(height) from student group by grade);

-- 4. professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, �Ի���, �а����� ���. 
--     ��, �а�������� �������� ����.
select p.profno, p.name, p.hiredate, d.dname
    from professor p join department d
    on p.deptno=d.deptno
    where hiredate in (select min(hiredate) from professor group by deptno)
    order by d.dname asc;

-- View

-- ����1] 30�� �μ� ������� ����, �̸�, ������ ���� view  ���̺� �����, ��Ī ����, ����̸�, �޿��� Alias �ְ�
--     ������ 2000���� ���� ����鸸 �����ؼ� �� �����

create or replace view v_emp_30
    as select job ����, ename ����̸�, sal �޿�
        from emp
        where sal>2000 and deptno=30;

select * from v_emp_30;    
select * from emp;
-- ����2] �μ���(�κ���==�Ұ�) �ִ�޿�, �ּұ޿�, ��ձ޿��� ���� �� �����
create or replace view v_emp_sal
    as select deptno, max(sal) �ִ�޿�, min(sal) �ּұ޿�, round(avg(sal), 2) ��ձ޿�
        from emp
        group by deptno;
select * from v_emp_sal;

-- ����3] �μ��� ��ձ޿��� ���� �並 ����µ�, ��� �޿��� 2000�̻��� �μ��� ����ϼ���.
create or replace view v_emp_avg_sal
    as select deptno, round(avg(sal), 2) ��ձ޿�
        from emp
        group by deptno having avg(sal)>2000;
select * from v_emp_avg_sal;

-- ����4] ������ �ѱ޿��� ���� �� ���̺� �����, ����(job)�� manager�� ������� �����ϰ� �ѱ޿��� 3000�̻��� ����� ����ϱ�
create or replace view v_emp_sal_position
    as select job, sum(sal) "�� �޿�"
        from emp
        where job != 'MANAGER' and job != lower('MANAGER') -- oracle���� != �� <>�� ����
        group by job having sum(sal)>3000;

-- ���� Quiz
-- �ڵ����� ���������� seq_test��� �����ϰ� 100 �����ؼ� 100 ����
-- ���̺� seq_test ���̺�(num, name, phone) �����
-- ���ڵ� 3�� �߰��ؼ� Ȯ���ϱ�

create sequence seq_test
    start with 100
    increment by 100;

