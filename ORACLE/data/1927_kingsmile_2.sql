-- update ��ɾ�
-- UPDATE ���̺�� SET �����Ǿ�� �� Į���� = �����Ǳ⸦ ���ϴ� ���ο� ��;  -- ���ڵ� ��ü ����
-- UPDATE ���̺�� SET �����Ǿ�� �� Į���� = �����Ǳ⸦ ���ϴ� ���ο� �� whereh ����;  --

select * from professor where position= '������';

update professor set pay = pay + 100;  -- ���ڵ� ��ü ����
ROLLBACK; -- ���
update professor set pay = pay + 100 where position= '������'; -- ���ǿ� �´� ���ڵ常 ����
commit; -- �Ϸ�

-- delete ��ɾ�
-- DELETE [FROM] ������ ���ϴ� ������ ����ִ� ���̺��; -- ���ڵ� ��ü ����(����)
-- DELETE [FROM] ������ ���ϴ� ������ ����ִ� ���̺�� where ����; -- ���ǿ� �´� ���ڵ� ����(����)
delete from emp2;  
select * from professor where position like '��%';
delete professor where position like '��%';




