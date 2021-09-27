-- update 명령어
-- UPDATE 테이블명 SET 수정되어야 할 칼럼명 = 수정되기를 원하는 새로운 값;  -- 레코드 전체 수정
-- UPDATE 테이블명 SET 수정되어야 할 칼럼명 = 수정되기를 원하는 새로운 값 whereh 조건;  --

select * from professor where position= '정교수';

update professor set pay = pay + 100;  -- 레코드 전체 수정
ROLLBACK; -- 취소
update professor set pay = pay + 100 where position= '정교수'; -- 조건에 맞는 레코드만 수정
commit; -- 완료

-- delete 명령어
-- DELETE [FROM] 삭제를 원하는 정보가 들어있는 테이블명; -- 레코드 전체 삭제(제거)
-- DELETE [FROM] 삭제를 원하는 정보가 들어있는 테이블명 where 조건; -- 조건에 맞는 레코드 삭제(제거)
delete from emp2;  
select * from professor where position like '정%';
delete professor where position like '정%';




