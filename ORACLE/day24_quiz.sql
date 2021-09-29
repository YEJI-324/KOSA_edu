-- ���� 1] emp2���̺��� deptno(�μ�)���� pay �հ� ��� ���ϱ�
select deptno, sum(pay), avg(pay)
    from emp2
    group by(deptno);

-- ���� 2] emp2���̺��� emp_type���� pay �հ� ��� ���ϱ�
select emp_type, sum(pay), avg(pay)
    from emp2
    group by emp_type;

-- ���� 3] emp2���̺��� ���޺�(position) �޿��� ��, ���
select position, sum(pay), round(avg(pay),0)
    from emp2
    where position is not null
    group by position;

-- ���� 4] emp2���̺��� ���޺�(position) �޿��� ��, ��� ���ϴµ�
        -- ������ ������ ����鸸 ����ϱ�
select position, sum(pay), avg(pay)
    from emp2
    group by position
    having position='����';
    

-- Oracle SQL_PLSQL_PPT > 2, 3�� �ǽ�  
-- ���� �Լ� ���� 1) 2�� 19������
-- Student ���̺��� �����ؼ� �Ʒ� ȭ��� ���� 1 ������(deptno1 �÷�) 
-- 101���� �л��� �̸��� ��ȭ��ȣ�� ������ȣ�� ����ϼ���. 
-- �� ������ȣ�� ���ڸ� ���;� �մϴ�.

select name, tel, substr(tel, 1, instr(tel, ')')-1) "������ȣ"
    from student
    where deptno1 = 101;

-- ���� �Լ� ���� 3)
-- Dept2 ���̺��� ����Ͽ� dname �� 1234567890�� rpad�ϱ�

select dname, rpad(dname, 10, substr('1234567890', length(dname)+1)) "rpad ����" from dept2;
