select name, deptno from professor where deptno in(101,201,301);

select * from professor where pay between 300 and 500; -- 300~500
select * from professor where pay not between 300 and 500; -- 300 �̸�, 500 �ʰ�

-- %, _, like
select * from professor where email like 'a_g%';
select * from professor where email like '%a%';
select * from professor where email like '__a%';

select * from professor where hpage = null; -- �̷��� �Ѵٰ� null�ΰ� ������ ����.
--> null�� =�� �ƴ� is null�� ����
select * from professor where hpage is null;
