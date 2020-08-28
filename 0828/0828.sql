REM �ּ�


--NLS�Ķ������ �� Ȯ��
SELECT parameter, value
FROM NLS_SESSION_PARAMETERS;

--NLS�Ķ������ NLS_DATE_FORMAT ��ȯ  --ALTER ~ SET : SESSION ����
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD';

REM �����Լ�
--1. ROUND( )
SELECT ROUND(45.925, 2), ROUND(45.925, 0), ROUND(45.925, -1)        --�Ҽ���2, 0���� ������ -- -1: 1�ڸ����� �ݿø�
FROM DUAL;

--23. �μ���ȣ�� 20�� �μ��� �ð��� �ӱ��� ����Ͽ� ����϶�. ��, 1���� �ٹ��ϼ��� 12���̰�, 1
--�� �ٹ��ð��� 5�ð��̴�. ��¾���� �̸�, �޿�, �ð��� �ӱ�(�Ҽ����� ù ��° �ڸ����� �ݿø�)
--�� ����϶�

SELECT      sal, ROUND(sal / 12 / 5, 0)     -- = ROUND( sal / 12 / 5)
FROM       emp 
WHERE       deptno = 20;


--2. TRUNC( )
SELECT TRUNC(45.925, 2), TRUNC(45.925, 0), TRUNC(45.925, -1)       -- 2, 0 : �Ҽ��� 2, 0������ ������  -- -1 : ���� 1�ڸ����� �߶�
FROM DUAL;

--3. CEIL, FLOOR( ) --CEIL : õ�� : ���� --FLOOR : �ٴ� : ����
SELECT      ROUND(45.925, 2), TRUNC(42.924, 2), CEIL(45.925), FLOOR(45.925)
FROM        dual;

SELECT      ROUND(-45.925, 2), TRUNC(-42.924, 2), CEIL(-45.925), FLOOR(-45.925)
FROM        dual;

--4. MOD( )
SELECT 15 / 6, MOD(15, 6)
FROM dual;

--5. NVL2( )
REM NVL1(column, express1) : NULL�̸� express1���� �ٲ�
REM NVL2(column, express1, express2) : null�ƴϸ� express1, null�̸� express2
REM NULLIF : comm�� NULL�� ����? ������ NULL,  �ٸ��� �״�� comm ���
SELECT   deptno, comm, NVL(comm, 0), NVL2(comm, comm * 1.1, 0), NULLIF(comm, NULL)
FROM    emp
WHERE   deptno IN (10, 30)
ORDER BY deptno;

--6. NULLIF()
REM ���̽� ���� = 800 -> NULL ,  ���̽� ���� != 800 --> ���̽� ���� �״�� ���
SELECT NULLIF(sal, 800)
FROM        emp
WHERE       ename = UPPER('smith');

--7. COALLESCE() : ���� �ƴ� �� �̾Ƴ�
SELECT comm, sal, NVL(comm, 0), NVL2(comm, comm * 1.1, 0), COALESCE(comm, sal) --comm�� null�̸� sal���, comm : NULL�� �ƴϸ� �ڱ� comm���.
FROM emp
WHERE deptno IN(10, 30);

SELECT deptno, comm, COALESCE(comm, 100)  --comm�� null�̸� 100���, comm�� null�� �ƴϸ� comm���
FROM emp
WHERE deptno IN (10, 30)
ORDER BY deptno ASC;

--9. DECODE
--�μ���ȣ�� ���� ���ʽ�
SELECT      deptno, sal, DECODE(deptno, 10, sal * 1.1, 20, sal * 1.5, 30, sal) AS "���ʽ�"  --deptno : 10�̸� 10%, 20�̸� 50%, 30���̸� �⺻����
FROM        emp
ORDER BY deptno ASC;

--���� �� ���ʽ�
SELECT    job, sal,
                DECODE(job, 'ANALYST', sal * 0.1, 
                                    'CLERK', sal * 0.2,
                                        'MANAGER', sal * 0.3,
                                            0) AS "���ʽ�" --  'ANALYST'�� ���ʽ� : 10%, Ŭ��(�Ϲ� ȸ���)�̸� 20%, �Ŵ����� 30%, ��Ÿ �������� �⺻��
FROM    emp
ORDER BY   job;

-- �Ի�⵵�� ���� ���� �ο�
--80�� �Ի� : �̻�, 81�� �Ի� : ����, 82�� �Ի� : ����, 87�� �Ի� : ���
SELECT   ename, CONCAT(' --> ', TO_CHAR(hiredate, 'YYYY')) AS "�Ի�⵵",
                DECODE(TO_CHAR(hiredate, 'YYYY'), '1980', '�̻�',
                                                                '1981', '����',
                                                                    '1982', '����',
                                                                        '���') AS "����"
FROM    emp
ORDER BY "�Ի�⵵";


--10. CASE()
SELECT      deptno, sal, DECODE(deptno, 10, sal * 1.1, 20, sal * 1.5, 30, sal) AS "���ʽ�"  --deptno : 10�̸� 10%, 20�̸� 50%, 30���̸� �⺻����
FROM        emp
ORDER BY deptno ASC;

--92~94���� CASE()�� ��ȯ
SELECT      deptno, sal,
                CASE
                    WHEN deptno = 10  THEN sal * 1.1
                    WHEN deptno = 20   THEN sal * 1.5
                    ELSE  sal
                END AS "���ʽ�"
FROM   emp
ORDER BY deptno ASC;

--���޺� ���ʽ��� DECODE�� ����
SELECT    job, sal,
                DECODE(job, 'ANALYST', sal * 0.1, 
                                    'CLERK', sal * 0.2,
                                        'MANAGER', sal * 0.3,
                                            0) AS "���ʽ�" --  'ANALYST'�� ���ʽ� : 10%, Ŭ��(�Ϲ� ȸ���)�̸� 20%, �Ŵ����� 30%, ��Ÿ �������� �⺻��
FROM    emp
ORDER BY   job;

--���޺� ���ʽ��� CASE�� ����
SELECT    job, sal,
            CASE
                WHEN  job = 'ANALYST' THEN  sal * 0.1
                WHEN  job = 'CLERK'     THEN  sal * 0.2
                WHEN  job = 'MANAGER' THEN sal * 0.3
                ELSE   0
            END AS "���ʽ�"
FROM    emp
ORDER BY   job;

--hiredate���� "�Ի�⵵", "����" ���.
SELECT      ename, TO_CHAR(hiredate, 'YYYY') AS "�Ի�⵵",
                CASE
                    WHEN TO_CHAR(hiredate, 'YYYY') = '1980' THEN '�̻�'
                    WHEN TO_CHAR(hiredate, 'YYYY') = '1981' THEN '����'
                    WHEN TO_CHAR(hiredate, 'YYYY') = '1982' THEN '����'
                    ELSE '���'
                END AS "����"
FROM        emp
ORDER BY       "�Ի�⵵";


--���� ��¥ ���
SELECT sysdate
FROM dual;

--���ú��� 5�� ���� ��¥ ���
SELECT sysdate + 5
FROM dual;

--��¥�Լ�
SELECT      ename, hiredate, TRUNC(TRUNC(sysdate - hiredate) / 365) || '��° �ٹ�',  --�Ի����� ���° �Ǵ��� �Ҽ��� ���� ����
                TRUNC(MONTHS_BETWEEN(SYSDATE, hiredate)) || '���� ° �ٹ�'
FROM        emp
WHERE       deptno = 10;

--�������κ��� 5���� ��
SELECT ADD_MONTHS(SYSDATE, 5)
FROM dual;

--���� �ݿ����� ��¥���� ���
SELECT NEXT_DAY(SYSDATE, '�ݿ���')
FROM dual;

--�ٴ����� ������ ���
SELECT NEXT_DAY(NEXT_DAY(SYSDATE, '������'), '������')
FROM dual;

--�������� ������ ��
SELECT LAST_DAY(ADD_MONTHS(SYSDATE, 1))
FROM dual;

--������ 3���� ���� ���� �ݿø� --2020�� 5�� 28�� �������� ���� �ݿø�
SELECT     ROUND(ADD_MONTHS(SYSDATE, -3), 'YEAR')
FROM    dual;