--1. ��� row�� ��� column ��ȸ�ϱ�
SELECT ALL *  --ALL : ��� low, * : ��� column
FROM salgrade;

--2. ��� row�� Ư�� column ��ȸ�ϱ�
SELECT empno, ename
FROM emp;

--�μ����̺��� �μ���ȣ�� �μ��� ��ȸ�ϱ�
SELECT  deptno, dname
FROM    dept;

--������̺��� �����ȣ�� �μ���ȣ ��ȸ�ϱ�
SELECT  empno, deptno
FROM    emp;

--������̺��� ������ ��ȸ�ϱ�
SELECT  DISTINCT job            --DISTINCT : �ߺ� ����
FROM    emp;

--������̺��� ������� �� ���� �μ��� �ҼӵǾ� �ֽ��ϱ�? (�ڿ���)
SELECT  DISTINCT deptno
FROM    emp;

--3. ��Ī ����ϱ�
SELECT  empno AS "�����ȣ"  , ename  AS  "����̸�"
FROM    emp;

SELECT  sal * 12 + NVL(COMM, 0) AS "����"
FROM    emp;

--������̺��� ���, ����� �̸�, ����, ����, ���ʽ�, ������ ��ȸ�Ͻÿ�.
--��, ������ ������������ ����Ͻÿ�.
SELECT  empno AS "���", ename AS "����� �̸�", job AS "����",
        sal AS "����", comm AS "���ʽ�",
        sal * 12 + NVL(COMM, 0) AS "����"
FROM    emp
ORDER BY "����" DESC;

--4. �����ϱ�
--������̺��� �μ���ȣ�� �������� �����ϰ�, ������ ������������ �����Ͻÿ�.
SELECT  deptno, sal
FROM    emp
ORDER BY deptno ASC, sal DESC;

--92page Q3
--����1
SELECT  *
FROM    emp;

--����2
SELECT  empno AS "EMPLOYEE_NO", ename AS "EMPLOYEE_NAME",
        MGR AS "MANAGER", SAL AS "SALARY", 
        COMM AS "COMMISION", DEPTNO AS "DEPARTMENT_NO"
FROM    emp;

--����3
SELECT  empno, ename
FROM    emp
ORDER BY empno DESC, ename ASC;

--5. NULL ó��
--NVL()�Լ�
--SELECT  NVL(commm, 'NULL')
--comm : ���������̹Ƿ� ���������� ��ȯ
SELECT NVL(mgr, 0)
FROM    emp;

--6. ���ڿ� �����ϱ�
SELECT  'HELLO' || ', WOLRD'
FROM    dual;

SELECT  '�����ȣ ' || empno || '�� ' || ename || '�Դϴ�.'
FROM    emp;

--7. ������
--ALL �������־ ��� ����� ename, job, sal ������.
SELECT  ename, job, sal
FROM    emp
WHERE   deptno = 10;

SELECT  sal
FROM    emp
WHERE   empno = 7782;

--������̺��� �μ���ȣ�� 20�� �μ��� �����ִ�
--��� �߿� ������ 1000�� ������ ����� ������ ��ȸ�Ͻÿ�.
SELECT  *
FROM    emp
WHERE   deptno = 20 AND sal <= 1000;

SELECT  sal
FROM    emp
WHERE   empno = 7369;

--������̺��� �μ���ȣ�� 10���̰ų� ������ 3000�ҿ��� 5000�� ������ ����� 
--���, �̸�, ����, �μ���ȣ�� ��ȸ�Ͻÿ�.
SELECT  empno, ename, sal, deptno
FROM    emp
WHERE   deptno = 10 OR (sal >= 3000 AND sal <= 5000);


SELECT          deptno, dname, loc
FROM              dept
WHERE           deptno NOT IN(10, 20);
--WHERE NOT (deptno = 10 OR deptno = 20);

--������̺��� ������ SALESMAN�̰ų� MANAGER�̰ų� PRESIDENT�� �����
--����̸�, ������ ��ȸ�Ͻÿ�.
SELECT      ename, job
FROM        emp
WHERE       job IN('SALESMAN', 'MANAGER', 'PRESIDENT');
--WHERE   job = 'SALESMAN'   OR   job = 'MANAGER'   OR   job = 'PRESIDENT';