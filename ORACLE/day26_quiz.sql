-- procedure quiz
-- PL/SQL�� �����
select s.name, p.name, d.dname
    from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno = s.deptno1
    where d.dname = '��ǻ�Ͱ��а�';
    