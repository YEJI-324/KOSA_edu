-- 숫자 함수
select round(12.4334555324, 0), round(12.4334555324, 2), round(12.5334555324, 0)
    from dual;

select ceil(12.32), ceil(-12.32) from dual;
select floor(12.32), floor(-12.32) from dual;

select trunc(12.3456,2), trunc(12.3768, 2), trunc(12.76435,0), trunc(12.345,0) from dual;

-- 문자열 함수
-- instr
select instr('abcd','b') from dual; -- 앞에서부터 처음만나는 b가 어디에 있는지
select instr('abcdb','b', -1) from dual; -- 뒤에서부터 처음만나는 b가 어디에 있는지

select instr(id, 'a') from professor;
select instr(id, 'a', -1) from professor;

-- lpad, rpad
select lpad('abcd', 20, '#') from dual; -- 왼쪽에 #으로 원하는 길이만큼 패딩 추가
select rpad('abcd', 20, '#') from dual; -- 오른쪽에 #으로 원하는 길이만큼 패딩 추가

select rpad(email, 20,'%') from professor;
select rpad(dname, 10, '*') from dept2;

-- length, lengthb
select length('HELLO WORLD') from dual; -- 길이
select lengthb('HELLO WORLD') from dual; -- byte

select length(dname) from dept2; -- 길이
select lengthb(dname) from dept2; -- bype 길이

-- substr
select substr('1234567890', 3) from dual;
select substr('1234567890', 3, 2) from dual;

select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 2) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1)) "RPAD연습" from dept2;

select * from student where deptno1 = 103;
select name, rtrim(REGEXP_replace(name, '(.)','\-1'), '-') "변경후"
    from student
    where deptno1 = 103;

select name, rtrim(REGEXP_replace(birthday, '(/)','\\'), '-') "변경후"
    from student
    where deptno1 = 103;

-- 날짜함수
select sysdate from dual;

-- months_between, add_months
select name, hiredate, MONTHS_BETWEEN(sysdate, hiredate) from professor;
select name, hiredate, add_months(hiredate, 3) from professor;

-- next_day
select next_day(sysdate, 4) from dual;
select hiredate "입사일", next_day(hiredate, 4) "다음 수요일" from professor;

-- 형변환 함수
select sysdate, to_char(sysdate, 'YYYY-MM-DD') "날짜", 
                to_char(sysdate, 'HH:MM:SS') "시간",
                to_char(sysdate, 'HH24:MM:SS') "24시간"
                from dual;

select to_char(2000, '999,999')from dual;
select pay, to_char(pay, '999,999,999')from emp2;
select pay, to_char(pay, 'L999,999,999')from emp2;
select pay, to_char(pay, '$999,999,999')from emp2;

select to_date('21/09/29') from dual;
select to_number('123') from dual;

select * from dept2;
select * from professor;
