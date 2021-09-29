-- ���� �Լ�
select round(12.4334555324, 0), round(12.4334555324, 2), round(12.5334555324, 0)
    from dual;

select ceil(12.32), ceil(-12.32) from dual;
select floor(12.32), floor(-12.32) from dual;

select trunc(12.3456,2), trunc(12.3768, 2), trunc(12.76435,0), trunc(12.345,0) from dual;

-- ���ڿ� �Լ�
-- instr
select instr('abcd','b') from dual; -- �տ������� ó�������� b�� ��� �ִ���
select instr('abcdb','b', -1) from dual; -- �ڿ������� ó�������� b�� ��� �ִ���

select instr(id, 'a') from professor;
select instr(id, 'a', -1) from professor;

-- lpad, rpad
select lpad('abcd', 20, '#') from dual; -- ���ʿ� #���� ���ϴ� ���̸�ŭ �е� �߰�
select rpad('abcd', 20, '#') from dual; -- �����ʿ� #���� ���ϴ� ���̸�ŭ �е� �߰�

select rpad(email, 20,'%') from professor;
select rpad(dname, 10, '*') from dept2;

-- length, lengthb
select length('HELLO WORLD') from dual; -- ����
select lengthb('HELLO WORLD') from dual; -- byte

select length(dname) from dept2; -- ����
select lengthb(dname) from dept2; -- bype ����

-- substr
select substr('1234567890', 3) from dual;
select substr('1234567890', 3, 2) from dual;

select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 2) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1)) "RPAD����" from dept2;

select * from student where deptno1 = 103;
select name, rtrim(REGEXP_replace(name, '(.)','\-1'), '-') "������"
    from student
    where deptno1 = 103;

select name, rtrim(REGEXP_replace(birthday, '(/)','\\'), '-') "������"
    from student
    where deptno1 = 103;

-- ��¥�Լ�
select sysdate from dual;

-- months_between, add_months
select name, hiredate, MONTHS_BETWEEN(sysdate, hiredate) from professor;
select name, hiredate, add_months(hiredate, 3) from professor;

-- next_day
select next_day(sysdate, 4) from dual;
select hiredate "�Ի���", next_day(hiredate, 4) "���� ������" from professor;

-- ����ȯ �Լ�
select sysdate, to_char(sysdate, 'YYYY-MM-DD') "��¥", 
                to_char(sysdate, 'HH:MM:SS') "�ð�",
                to_char(sysdate, 'HH24:MM:SS') "24�ð�"
                from dual;

select to_char(2000, '999,999')from dual;
select pay, to_char(pay, '999,999,999')from emp2;
select pay, to_char(pay, 'L999,999,999')from emp2;
select pay, to_char(pay, '$999,999,999')from emp2;

select to_date('21/09/29') from dual;
select to_number('123') from dual;

select * from dept2;
select * from professor;
