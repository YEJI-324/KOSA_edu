-- subQuery
select * from emp2;
select * from emp2 where name='�����';

select * from emp2 where pay > 60000000;

select * from emp2 where pay > ( select pay from emp2 where name='�����');

-- �������� ����1

-- ������ �Դ�!
-- ���������� ����� �� �� �̻� ��ȯ�� ���� in, any, all �����ڸ� �����.
select empno, name, deptno
    from emp2
    where deptno in (1000, 1001, 1002, 1010, 2000, 2001);
    
select dcode from dept2 where area='��������';

select empno, name, deptno
    from emp2
    where deptno in (select dcode from dept2 where area='��������');