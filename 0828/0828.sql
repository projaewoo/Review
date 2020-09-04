REM AUTHOR : 정재우
REM Objective : Oracle 복습
REM Environment : MacOS Catalina

--NLS파라미터 값 확인
SELECT parameter, value
FROM NLS_SESSION_PARAMETERS;

--NLS파라미터의 NLS_DATA_FORMAT 변환
--ALTER ~ SET : SESSION변경
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD';

--숫자함수
--1. ROUND()
--소수점2, 0까지 보여줘
SELECT ROUND(45.124, 2), ROUND(45.124, 0)
FROM DUAL;

--소수점 1자리에서 반올림해
SELECT  ROUND(45.12, -1)
FROM DUAL;

--23번 문제 : 부서번호가 20인 부서의 시간당 임금을 계산하여 출력.
--단, 1달의 근무일수는 12일, 1일 근무시간 : 5시간,
--출력양식 : 이름, 급여, 시간당 임금(소수이하 첫 번째 자리에서 반올림) (소수점 0번째까지 출력)
SELECT ename, sal, ROUND(sal / 12 / 5, 0) AS "시급"
FROM emp
WHERE deptno = 20;

--2. TRUNC()
--소숫점 2, 0까지만 보여줘
SELECT  TRUNC(45.1234, 2), TRUNC(45.1234, 0)
FROM dual;
--1의 자리를 버려
SELECT TRUNC(45.1234, -1)
FROM dual;
--1의 자리에서 반올림해
SELECT ROUnD(45.1234, -1)
FROM dual;

--3. CEIL, FLOOR()
--CEIL : 천장, 상한
--FLOOR : 바닥, 하한
SELECT ROUND(45.5678, 2), TRUNC(45.5678, 2), CEIL(45.5678), FLOOR(45.5678)
FROM dual;
--parameter가 음수일때
SELECT ROUND(-45.5678, 2), TRUNC(-45.5678, 2), CEIL(-45.5678), FLOOR(-45.5678)
FROM dual;

--4. MOD()
--15를 6으로 나눈 나머지
SELECT 15 / 6, MOD(15, 6)
FROM dual;

--5. NVL2()
REM NVL1(column, express1) : NULL이면 experss1으로 변환.
REM NVL2(column, express1, express2) : NULL아니면 express1, NULL이면 express2
REM NULLIF : comm이 NULL과 같으면 NULL, 다르면 그대로 comm출력.
SELECT deptno, comm, NVL(comm, 0), NVL2(comm, comm * 1.1, 0), NULLIF(comm, NULL)
FROM emp
WHERE  deptno IN(10, 30)
ORDER BY deptno;

--보너스가 NULL이면 0으로 표시
SELECT NVL(comm, 0), comm
FROM emp;

--보너스가 NULL이면 0으로 표시, NULL이 아니면 보너스 계산
SELECT NVL2(comm, comm * 1.1, 0), comm
FROM emp;

--6. NULLIF()
REM 스미스 월급 = 800 -> NULL, 스미스 월급 != 800 -> 스미스 월급 그대로 출력
SELECT NULLIF(sal, 800)
FROM  emp
WHERE LOWER(ename) LIKE 'smi%';
--밀러의 월급이 1200이면 NULL, 1200이 아니면 월급 그대로 출력
SELECT NULLIF(sal, 1200), ename
FROM emp
WHERE LOWER(ename) LIKE 'mil%';

--7. COALESCE() : 널이 아닌 값 뽑아냄
--COALESCE(comm, sal) : comm이 NULL -> sal찍고, comm이 NULL아니면 comm찍기.
SELECT comm, sal, NVL(comm, 0), NVL2(comm, comm * 1.1, 0), COALESCE(comm, sal)
FROM emp
WHERE deptno IN (10, 30);
--보너스가 없는 사람은 월급 찍고, 보너스가 있으면 보너스 그대로 찍기
SELECT COALESCE(comm, sal), comm, sal
FROM emp;
-- 보너스가 없으면 100찍고, 보너스가 있으면 보너스 그대로 출력
SELECT  deptno, comm, COALESCE(comm, 100)
FROM  emp
WHERE deptno IN (10, 30)
ORDER BY deptno ASC;

--9. DECODE : IF문과 유사.
--부서번호에 따른 보너스
--deptno : 10 -> 10%, 20 -> 50%, 30 -> 기본급
SELECT deptno, sal, DECODE(deptno, 10, sal * 1.1,
                                                    20, sal * 1.5,
                                                       30, sal) AS "보너스"
FROM emp
ORDER BY deptno ASC;

--직무별 보너스
SELECT job, sal,
            DECODE(job, 'ANALYST', sal * 0.1,
                                    'CLERK', sal * 0.2,
                                        'MANAGER', sal * 0.3,
                                            0) AS "보너스"
FROM  emp
ORDER BY job;
--입사연도에 따른 직급 부여
--80년 입사 : 이사, 81년 입사 : 부장, 82년 입사 : 과장, 87년 입사 : 사원
SELECT  ename, CONCAT('---->', TO_CHAR(hiredate, 'YYYY')) AS "입사년도",
                        DECODE(TO_CHAR(hiredate, 'YYYY'), '1980', '이사',
                                                                                '1981', '부장',
                                                                                    '1982', '과장',
                                                                                        '사원') AS "직급"
FROM  emp
ORDER BY "입사년도";

--10. CASE()
REM CASE ~ WHEN ~ THEN ... ELSE ~ END
--deptno : 10 -> 10%, 20 -> 50%, 30 -> 기본급
SELECT  deptno, DECODE(deptno, 10, sal * 1.1,
                                                    20, sal * 1.5,
                                                    30, sal) AS "보너스"
FROM  emp
ORDER BY deptno;
--위의 식을 CASE()로 변환
SELECT  deptno, sal,
                CASE
                    WHEN deptno = 10 THEN sal * 1.1
                    WHEN deptno = 20 THEN sal * 1.5
                    ELSE sal
                END AS "보너스"
FROM  emp
ORDER BY deptno ASC;

--직급별 보너스를 DECODE로 구현
SELECT job, sal,
            DECODE(job, 'ANALYST', sal * 0.1,
                                    'CLERK', sal *  0.2,
                                     'MANAGER', sal * 0.3,
                                      0) AS "보너스"
FROM emp
ORDER BY job;
--직급별 보너스를 CASE로 구현
SELECT job, sal,
            CASE
                WHEN job = 'ANALYST'  THEN sal * 0.1
                WHEN  job = 'CLERK' THEN sal * 0.2
                WHEN job = 'MANAGER' THEN sal * 0.3
                ELSE 0
            END AS "보너스"
FROM emp
ORDER BY job;
--hiredate에서 "입사년도", "직급" 출력.
SELECT ename, TO_CHAR(hiredate, 'YYYY') AS "입사년도",
                CASE
                    WHEN TO_CHAR(hiredate, 'YYYY') = '1980' THEN '이사'
                    WHEN TO_CHAR(hiredate, 'YYYY') = '1981' THEN '부장'
                    WHEN TO_CHAR(hiredate, 'YYYY') = '1982' THEN '과장'
                    ELSE '사원'
                END AS "직급"
FROM emp
ORDER BY "입사년도";

--오늘 날짜 출력
SELECT sysdate
FROM dual;

--오늘부터 5일 뒤의 날짜 출력
SELECT sysdate + 5
FROM dual;

--날짜 함수
--입사한지 몇년째, 몇달째 되는지 출력
SELECT ename, hiredate,
                TRUNC(TRUNC(sysdate - hiredate) / 365) || '년째 근무',
                TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) || '개월 째 근무'
FROM emp
WHERE deptno = 30;
--TEST
--sysdate - hiredate : 현재 날짜 - 고용날짜 (지금까지 일한 날을 소숫점으로 표현)
--TRUNC(sysdate - hiredate) : 현재 날짜 - 고용날짜 (지금까지 일한 날)
--TRUNC(sysdate - hiredate) / 365 : 근무 년수 (소숫점으로 표현) (365로 나누니까 소숫점 나옴)
--TRUNC(TRUNC(sysdate - hiredate) / 365)) : 근무 년수
--MONTHS_BETWEEN(sysdate, hiredate) : 지금까지 일한 개월을 소숫점으로
--TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) : 지금까지 일한 개월
SELECT ename, hiredate, sysdate - hiredate,
               TRUNC(sysdate - hiredate),
               TRUNC(sysdate - hiredate) / 365,
               TRUNC(TRUNC(sysdate - hiredate) / 365),
               MONTHS_BETWEEN(sysdate, hiredate)
FROM emp
WHERE deptno = 30;

--지금까지 일한 년수, 개월 수
SELECT ename, hiredate, TRUNC(TRUNC(sysdate - hiredate) / 365) || '년째 근무',
                                    TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) || '개월 째 근무'
FROM emp;

--지금으로부터 5개월 뒤
SELECT ADD_MONTHS(sysdate, 5)
FROM dual;

--다음 금요일의 날짜형식 출력
SELECT NEXT_DAY(sysdate, '금요일')
FROM dual;

--다다음주 월요일 출력
SELECT NEXT_DAY(NEXT_DAY(sysdate, '월요일'), '월요일')
FROM dual;

--다음달의 마지막 날
SELECT LAST_DAY(ADD_MONTHS(sysdate, 1))
FROM dual;

--다다음달의 마지막 날
SELECT LAST_DAY(ADD_MONTHS(sysdate, 2))
FROM dual;

--오늘의 3개월 전의 연도 반올림
--2020년 6월 4일 기준으로 연도 반올림
--1~6월 : 반내림, 7~12월 : 반올림
SELECT ROUND(ADD_MONTHS(sysdate, -3), 'YEAR')
FROM dual;

--현재 날짜 기준으로 연도 반올림
SELECT ROUND(sysdate, 'YEAR')
FROM dual;