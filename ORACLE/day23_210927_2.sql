select name, deptno from professor where deptno in(101,201,301);

select * from professor where pay between 300 and 500; -- 300~500
select * from professor where pay not between 300 and 500; -- 300 미만, 500 초과

-- %, _, like
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';

select * from professor where hpage = null; -- 이렇게 한다고 null인게 나오지 않음.
--> null은 =이 아닌 is null로 뽑음
select * from professor where hpage is null;
