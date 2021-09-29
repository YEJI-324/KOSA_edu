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
select * from student;

select name, grade, weight
    from student
    where weight < (select min(weight) from student where grade=4);

-- 3. student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ���.
select grade, name, height
    from student
    where (grade, height) in (select grade, max(height) from student group by grade);

select grade, max(height) from student group by grade;

-- 4. professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, �Ի���, �а����� ���. 
--     ��, �а�������� �������� ����.
select * from department;
select * from professor;
select p.profno, p.name, p.hiredate, d.dname
    from professor p join department d
    on p.deptno=d.deptno;
    
-- �а����� �Ի����� ���� ������ ���
select deptno, cast(months_between(sysdate, hiredate) as int)
    from professor ;
