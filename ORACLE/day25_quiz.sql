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
   
-- subQuery 1
    
-- ����1]emp2 ��� �޿����� ���� ������ ����ϼ���.
select name, pay
    from emp2
    where pay < (select avg(pay) from emp2);

-- ����2]�л� ���̺��� 1�г�(grade) ��� Ű���� ū ����� ����ϼ���.
select name, height
    from student
    where height > ( select avg(height) from student where grade=1);

-- ����3]�л� ���̺�, �а� ���̺��� ����ؼ� '������' �л��� ����(deptno1)�� ������ �л����� �̸��� �а� �̸� ����ϱ�
select s.name, d.dname
    from student s join department d
    on s.deptno1=d.deptno
    where s.deptno1=(select deptno1 from student where name='������');

-- ����4]���� ���̺��� �Ի����� �۵��� �������� ���߿� �Ի��� ����� �̸�, �Ի���, �а����� ����ϼ���.
select p.name, p.hiredate, d.dname
    from professor p join department d
    on p.deptno=d.deptno
    where hiredate>(select hiredate from professor where name='�۵���');

-- ����5]�л� ���̺��� ������ 101�� �а��� ��� �����Ժ��� ���ſ� �л����� �̸��� �����Ը� ����ϼ���.
select name, weight
    from student
    where weight > (select avg(weight) from student where deptno1=101);

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

-- ����7] ���� ���̺��� ���̺� ������ ����� c_professor ���ο� ���̺� ����(�̸�, ����, �Ի���, �̸���, Ȩ������)�ϰ� ���ڵ� ���� �ϱ�
drop table c_professor;
create table c_professor 
    as select name, position, email, hpage from professor where 1=0;

insert into c_professor ( 
    select name, position, email, hpage from professor);

select * from c_professor;

-- ����8] c_emp22 ���̺��� �������� ���� c_emp22�� ���弼��
create table c_emp22 as select * from emp where 1=0;

-- ����9] emp ���̺��� c_emp22�� ������ 'manager'�� ����鸸 ���ڵ� �����Ͻÿ�.
insert into c_emp22 (
    select * from emp where job='MANAGER' or job=lower('MANAGER'));
select * from c_emp22;

-- ���� Quiz
-- �ڵ����� ���������� seq_test��� �����ϰ� 100 �����ؼ� 100 ����
-- ���̺� seq_test ���̺�(num, name, phone) �����
-- ���ڵ� 3�� �߰��ؼ� Ȯ���ϱ�

create sequence seq_test
    start with 100
    increment by 100;
    
create table seq_test_tab ( num number, name varchar2(10), phone varchar2(20));

insert into seq_test_tab values(seq_test.nextval, '�迹��1', '010-0000-0001');
insert into seq_test_tab values(seq_test.nextval, '�迹��2', '010-0000-0002');
insert into seq_test_tab values(seq_test.nextval, '�迹��3', '010-0000-0003');

select * from seq_test_tab;