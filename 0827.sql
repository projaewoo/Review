
SELECT sysdate FROM dual;

--��������� �̸� �ձ��ڸ� �빮�ڷ� ���
SELECT INITCAP(ename)
FROM    emp
WHERE job = UPPER('salesman');

--������ ���� �ľ�
SELECT      LENGTH('SCOTT'), LENGTH('�ȳ��ϼ���'),       --���� ���� �ľ�
                LENGTHB('SCOTT'), LENGTHB('�ȳ��ϼ���')   --LENGTHB() : ����Ʈ ũ�� �ľ�
FROM        dual;

--NLS
SELECT  parameter, value
FROM NLS_SESSION_PARAMETERS;

--�̸��� ���̰� 5���� �ʰ��ϴ� ��� ���
SELECT ename
FROM    emp
WHERE   LENGTH(ename) > 5;


--SUBSTR(job, 1, 3) : 1���� 3�� -- (_ _ _) job������ ���ڸ� 3���ڱ����� ���
    --SUBSTR(job , 3) : job���������� 3��°���� ������ ���
SELECT      job,  SUBSTR(job, 1, 3), SUBSTR(job, 3) 
FROM        emp
WHERE deptno = 10;


ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD';

--1987�⿡ �Ի��� ���
SELECT      empno, ename, hiredate
FROM       emp 
--WHERE       hiredate >= '1987-01-01' AND hiredate <= '1987-12-31';
--WHERE hiredate BETWEEN '1987-01-01' AND '1987-12-31';
--WHERE hiredate LIKE '1987%';
WHERE SUBSTR(hiredate, 1, 4) = '1987';      --hiredate���� ù��°���� 4��°���� ������ ���� 1987�̸� ���


--�̸��� ù���ڰ� B�� J������ ��� ����� ���� ���.
SELECT      *
FROM        emp
WHERE     SUBSTR(ename, 1, 1) BETWEEN 'B'  AND  'J';


--INSTR(ename, 'A') : ename���� �빮��A�� ���° ����? --������ 0
SELECT      ename, LENGTH(ename), LOWER(ename), SUBSTR(ename, 1, 3), INSTR(ename, 'A')  
FROM        emp
WHERE       deptno = 20;

--�����ȣ �˻�
SELECT          *
FROM        zipcode
--WHERE       dong LIKE '%����%';           --�ڹٴ� ������ �����Ƿ� �߶� DB -> JAVA���� ��������
WHERE dong LIKE CONCAT(CONCAT('%', '����'), '%');

--TRIM() �Լ�
SELECT      'aaHelloaa' , LTRIM('yxHelloaa' , 'xy'), RTRIM('aaHelloxXx', 'x'),
                TRIM(BOTH  'a'  FROM 'aaHelloaa')
FROM    dual;

--ASCII()�Լ� �̿�
SELECT      'Hello' || ', World' || CHR(10) || CHR(36) || 'Oracle Programming'     --ASCII Code 10 = '%n' (�ٹٲ�) --ASCII Code 36 = '$'
FROM    dual;

--�־��� ������ ���� ū, ����
SELECT      GREATEST('������', '������', '������'), LEAST('������', '������', '������')
FROM        dual;