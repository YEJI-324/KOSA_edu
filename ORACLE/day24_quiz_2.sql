-- ����1] ������� �̸�, �μ���ȣ, �μ��̸��� ����϶�. (emp, DEPT table)
select e.ename �̸�, d.deptno �μ���ȣ, d.dname �μ��̸�
    from emp e join dept d
    on e.deptno=d.deptno;
    
-- ����2] DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸��� ����϶�(dept table)
select e.ename �̸�, e.job ����, e.empno �μ���ȣ, d.dname �μ��̸�
    from emp e join dept d
    on e.deptno=d.deptno
    where d.loc = 'DALLAS';

-- ����3] �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�(emp,dept)
select e.ename �̸�, d.dname �μ��̸�
    from emp e join dept d
    on e.deptno=d.deptno
    where e.ename like '%A%';

--����4] ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������ ����ϴµ� ������ 3000�̻��� ����� ����϶�(emp,dept)
select e.ename �̸�, d.dname �μ��̸�, e.sal ����
    from emp e join dept d
    on e.deptno=d.deptno
    where e.sal>=3000;

-- ����5] ������ 'SALESMAN'�� ������� ������ �� ����̸�, �׸��� �� ����� ���� �μ� �̸��� ����϶�. (emp, dept)
select e.job ����, e.ename �̸�, d.dname �μ��̸�
    from emp e join dept d
    on e.deptno=d.deptno
    where e.job='SALESMAN';
    
-- ����6] Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ���� +Ŀ�̼�, �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�', '����', '�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.(emp, SALGRADE)
-- (��) 1:1 ���� �Ǵ� �÷��� ����.
select e.job ����, e.empno �����ȣ, e.ename ����̸�, e.sal ����, (e.sal + nvl(e.comm, 0)) �Ǳ޿�, s.grade �޿����
    from emp e join salgrade s
    on (e.sal + nvl(e.comm, 0)) between s.losal and s.hisal
    where e.comm is not null;

-- ����7] �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶� (emp, DEPT, SALGRADE)
select d.deptno �μ���ȣ, d.dname �μ��̸�, e.ename ����̸�, round((e.sal/12),0) ����, s.grade �޿����
    from emp e join dept d
    on e.deptno=d.deptno join salgrade s
    on (e.sal + nvl(e.comm, 0)) between s.losal and s.hisal
    where d.deptno=10;

-- ����8] �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�. �׸��� �� ��µ� ������� �μ���ȣ�� ���� ������, ������ ���� ������ �����϶�(emp, dept, SALGRADE)
select d.deptno �μ���ȣ, d.dname �μ��̸�, e.ename ����̸�, round((e.sal/12),0) ����, s.grade �޿����
    from emp e join dept d
    on e.deptno=d.deptno join salgrade s
    on (e.sal + nvl(e.comm, 0)) between s.losal and s.hisal
    where d.deptno in(10,20)
    order by d.deptno asc, round((e.sal/12),0) desc;

-- ����9] �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� �������� �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ', '����̸�', '�����ڹ�ȣ','�������̸�'���� �Ͽ� ����϶�.(emp)
select * from emp;
select e.empno "�����ȣ", e.ename "����̸�", e.mgr "�����ڹ�ȣ", m.ename "�������̸�"
    from emp e join emp m
    on e.mgr=m.empno;
