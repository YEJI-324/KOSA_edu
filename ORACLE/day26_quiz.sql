-- procedure quiz
-- PL/SQL로 만들기
select s.name, p.name, d.dname
    from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno = s.deptno1
    where d.dname = '컴퓨터공학과';
    