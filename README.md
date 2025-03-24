# 브랜치 이름 규칙

브랜치를 생성할 때 `FEATURE/작업명` 형식으로 지어서 진행합니다.  
추후 작업을 합칠 때 혼동을 방지하기 위함입니다.

# DB 관리자 생성
```
CREATE USER hsp_usr IDENTIFIED BY 1234;
GRANT CREATE SESSION TO hsp_usr;
GRANT RESOURCE, DBA TO hsp_usr;
```
