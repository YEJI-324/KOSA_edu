-- ���� 1] empno �����ȣ, �̸�, �޿�, ���� �ʵ常 ���(��Ī ����), �����̸鼭 �������� ��� �˻�
select empno as �����ȣ, name as �̸�, pay as �޿�, position as ����
    from emp2
    where position='����' and name='������';

desc emp2;
select * from emp2;


-- ���� 2] �ʵ� ����� ���� ����, ������ �����̰ų� �蹮ȣ�� ��� �˻�
select empno as �����ȣ, name as �̸�, pay as �޿�, position as ����
    from emp2
    where position='����' or name='�蹮ȣ';


-- ���� 3] �޿��� 500�̻��̰�, ���ʽ��� 60 �̻� �޴� ������?
select * 
    from professor
    where pay>=500 and bonus>=60;
    
-- ���� 4] �̸����� '�迵��' �����
select * from professor where name='�迵��';

-- ���� 5] �̸����� '��'�� ���� ���� �����
select * from emp2 where name like '��%';

-- ���� 6] �̸��� �� ������ ���
select * from professor where name like '__';

-- ���� 7] id�� s or a ���ڰ� ���� ��� ã��
select * from professor where id like '%s%' or id like '%a%';

-- ���� 8] ���Ӱ��� ã��
select * from professor where position = '���Ӱ���';

-- ���� 9] �̸��� '���Ѷ�'�� '���ѳ�'�� ����
update emp2 set name='���Ѷ�' where name='���Ѷ�';
select * from emp2 where name = '���Ѷ�';

-- ���� 10] ��̰� '���'�� ����鸸 ã�Ƽ� '����'���� ����
update emp2 set hobby='����' where hobby='���';

-- ���� 11] ����� ���� ã�Ƽ� ����
delete from emp2 where emp_type='�����';

-- ���� 12] pay(or bonus)�� 50 �̻��� ����� ���
select * from professor where pay>=50 or bonus>=50;

-- ���� 13] �������̸鼭 '�����' ã��
select * from emp2 where emp_type='������' and name='�����';

-- ���� 14] �������̰ų� '������' ã��
select * from emp2 where emp_type='������' or name='������';

-- ���� 15] �������̰ų� �达���� ���� ��� ã��
select * from emp2 where emp_type='������' or name like '��%';

-- ���� 16] �达�� �ƴ� �������� ã��
select * from emp2 where emp_type='������' and name not like '��%';

-- ���� 17] �������̺��� �����Ե��� �̸��� ��ȸ�Ͽ� ���� �κп� '��'�� ���Ե� ����� ����� ���
select name from professor where name between '��' and '��';


-- ����] Ű�� 168�� ����� �� ��°�� ū�� Ȯ��
select rank(168) within group(order by height desc)
    from student;

-- ����] �����԰� 58�� ����� �� ��°���� ��� ���ϱ�
select rank(58) within group(order by weight desc)
    from student;

-- ����] g_end�� 200000, 600000 ���� ���� �� ��� (any ����� ��)


