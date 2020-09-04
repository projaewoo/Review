REM DATE : 2020년 9월 2일
REM AUTHOR : 정재우
REM Objective : Basic SQL과 Oracle 함수 학습하기
REM Environment : Mac OS Catalina, Oracle SQL Developer, Oracle Database 11g Express Edition

--사원테이블에서 직무가 PRESIDENT가 아닌 사원의 사원이름, 직무를 조회.
SELECT      ename, job
FROM        emp
WHERE job != 'PRESIDENT';

--부서 테이블에서 위치가 'BOSTON'인 사원의 부서번호, 부서이름 조회.
SELECT      deptno, dname
FROM       dept
WHERE   loc = 'BOSTON';

--사원테이블에서 직무가 'CLERK', 'MANAGER', 'ANALYST'인 사원의 사원이름, 직무 조회.
SELECT      ename, job
FROM    emp
WHERE   job IN ('CLERK', 'MANAGER', 'ANALYST');

--매니저 번호가 7902, 7566, 7788인 사원의 사번, 이름, 월급, 매니저 번호 조회.
SELECT      empno, ename, sal, mgr
FROM        emp
WHERE   mgr IN (7902, 7566, 7788);

--부서에서 부서번호가 10, 20인 사원의 부서이름 조회.
SELECT      dname, deptno
FROM        dept
WHERE   deptno IN (10, 20);

--월급이 1300이상 1500이하인 사원이름, 직무, 월급 조회
SELECT      ename, job, sal
FROM        emp
--WHERE   sal >= 1300 AND sal <= 1500;
WHERE sal BETWEEN 1300 AND 1500;
--WHERE sal BETWEEN 1500 AND 1300;   --ERROR : 앞의 A의 값이 뒤의 B값보다 작아야함.

--사원이름의 두번째 글자가 M인 사원이름 조회.
SELECT  ename
FROM    emp
WHERE   ename LIKE '_M%';

--사원이름 첫글자 : S, 세번째 글자 : I인 사원의 이름 조회.
SELECT  ename
FROM    emp
WHERE   ename LIKE 'S_I%';

--사원테이블에서 사원이름의 2번째가 특수문자_가 있는 사원의 이름 조회.
SELECT  ename
FROM    emp
WHERE   ename LIKE '_$_%' ESCAPE '$';

--우리 회사에서 보너스를 받지 않는 사원 정보 조회
SELECT      *
FROM    emp
WHERE   comm IS NOT NULL;
--여기서 COMM이 0인 사람은 조회가 됨. --comm이 null인 사람만 걸러짐.

--우리 회사에서 매니저가 없는 사원의 정보를 출력.
SELECT  *
FROM    emp
WHERE   mgr IS NULL;

--보너스 기준 내림차순
SELECT  *
FROM    emp
ORDER BY comm DESC;

--부서테이블에서 부서번호가 10인 사원들을 모아서 emp10이라는 테이블 생성
CREATE TABLE emp10
AS
SELECT *
FROM    emp
WHERE  deptno = 10;

--emp10테이블 확인
SELECT *
FROM emp10;

--부서번호가 20인 사원들 모아서 emp20테이블로 생성
CREATE TABLE emp20
AS
SELECT  *
FROM emp
WHERE deptno = 20;

--emp20테이블 확인
SELECT *
FROM emp20;

--emp10과 emp20테이블을 사원번호, 사원이름, 부서번호를 추출해서 emp_1020테이블 생성
CREATE TABLE  emp_1020
AS
SELECT  empno, ename, deptno
FROM    emp10
UNION
SELECT empno, ename, deptno
FROM    emp20;

--직무가 'CLERK'인 직원을 모아 emp_clerk테이블 생성
CREATE TABLE emp_clerk
AS
SELECT  *
FROM emp
WHERE job = 'CLERK';

--직무가 'MANAGER'인 직원을 모아서 emp_manager테이블 생성
CREATE TABLE emp_manager
AS
SELECT  *
FROM    emp
WHERE job LIKE 'MA%';

--emp_clerk과 emp_manager테이블에서 사원번호, 사원이름, 직무만 추출해서 emp_tf테이블 생성
CREATE TABLE emp_tf
AS
SELECT empno, ename, job
FROM emp_clerk
UNION
SELECT empno, ename, job
FROM emp_manager;

--emp테이블에서 emp_clerk테이블을 빼서 사원이름과 직무만 출력
SELECT  ename, job
FROM  emp
MINUS
SELECT ename, job
FROM emp_clerk;

--emp테이블과 emp_clerk테이블의 공통사원의 사원이름, 직무 조회
SELECT ename, job
FROM emp
INTERSECT
SELECT  ename, job
FROM  emp_clerk;

--부서번호가 10, 20이고 월급이 2000인 사원의 사원번호, 사원이름, 월급, 부서번호 조회.
SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno IN (10, 20)
INTERSECT
SELECT empno, ename, sal, deptno
FROM emp
WHERE sal > 2000;

--사원이름의 첫글자가 L 이후의  사원의 모든 정보 조회
SELECT *
FROM emp
WHERE ename >= 'L%';

--단일 행 함수 다루기
--1. 문자 함수 다루기

--대문자, 소문자로 처리
--직무가 SALESMAN인 사원 정보 출력
SELECT *
FROM emp
--WHERE job = UPPER('salesman');
WHERE LOWER(job) = 'salesman';  --본 테이블의 job : 대문자 -> 소문자로 변형하여 salesman인 사원 추출.

--UPPER() : 모두 대문자로, LOWER() : 모두 소문자로, INITCAP() : 첫글자만 대문자로
SELECT UPPER('hello, wolrd'), LOWER('HELLO, WORLD'), INITCAP('HELLO, WORLD')
FROM dual;

--직무가 'SALESMAN'인 사원의 사원이름을 첫글자만 대문자로 조회
SELECT INITCAP(ename)
FROM emp
WHERE job = UPPER('salesman');

-- LEGNTH() : 문자열 길이, LENGTHB() : 문자열의 바이트 크기
SELECT LENGTH('SCOTT'), LENGTHB('SCOTT'),
            LENGTH('안녕하세요'), LENGTHB('안녕하세요')
FROM dual;

--NLS_SESSION_PARAMETERS의 parameter, value 조회
SELECT parameter, value
FROM NLS_SESSION_PARAMETERS;

--사원이름이 5자 초과인 사원의 사원이름 조회
SELECT  ename
FROM emp
WHERE LENGTH(ename) > 5;

--부서번호가 10인 사원의 직무 출력
--SUBSTR(s, x, y) : s의 x번째 문자를 y개 조회.
--SUBSTR(s, n) : s의 문자를 n번째 이후로 조회.
SELECT  job, SUBSTR(job , 1, 3), SUBSTR(job, 4)
FROM emp
WHERE deptno = 10;

--NLS_DATE_FORMAT 변경
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD';
--변경된 세션 확인
SELECT parameter, value
FROM NLS_SESSION_PARAMETERS;

--1982년에 입사한 사람 조회
SELECT   empno, ename, hiredate
FROM     emp
--WHERE   hiredate >= '1987-01-01' AND hiredate <= '1987-12-31';
--WHERE hiredate BETWEEN '1987-01-01' AND '1987-12-31';
--WHERE hiredate LIKE '1987%';
WHERE SUBSTR(hiredate, 1, 4) = '1987';

--이름의 첫 글자가 B와 J사이의 모든 사원의 정보 출력
SELECT *
FROM emp
WHERE SUBSTR(ename, 1, 1) BETWEEN 'B' AND 'J';

--INSTR(ename, 'A') : ename에서 대문자A가 몇번째 있음?  -- 없으면 0
SELECT   ename, LENGTH(ename), LOWER(ename), SUBSTR(ename, 1, 3), INSTR(ename, 'A')
FROM     emp
WHERE   deptno = 20;

--TRIM() : 각 방향에서 해당 문자를 찾고 다른 문자가 나오면 stop. 괜히 엉뚱한 Hello같은 원래문자 훼손하면 안되므로
SELECT  'aaHelloaa', LTRIM('yxHelloaa', 'xy'), RTRIM('aaHelloxXx', 'x'), TRIM(BOTH 'a' FROM 'aaHelloaa')
FROM   dual;

--ASCII()
--ASCII Code 10 : '%n' (줄바꿈),  ASCII Code 36 = '$'
SELECT   'Hello' || ', World' || CHR(10) || CHR(36) || 'Oracle Programming'
FROM   dual;

--GREATEST() : 주어진 문자의 가장 큰 문자
--LEAST() : 주어진 문자의 가장 작은 문자.
SELECT   GREATEST('한지민', '김지민', '박지민'), LEAST('한지민', '김지민', '박지민')
FROM   dual;