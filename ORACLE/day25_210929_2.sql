-- subQuery
select * from emp2;
select * from emp2 where name='�����';


-- ������ �Դ�!
-- ���������� ����� �� �� �̻� ��ȯ�� ���� in, any, all �����ڸ� �����.
select empno, name, deptno
    from emp2
    where deptno in (1000, 1001, 1002, 1010, 2000, 2001);
    
select dcode from dept2 where area='��������';

select empno, name, deptno
    from emp2
    where deptno in (select dcode from dept2 where area='��������');