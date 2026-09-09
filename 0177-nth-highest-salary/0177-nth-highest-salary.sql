CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

  RETURN (
      WITH RankedSalaries AS (
          SELECT salary, 
                 DENSE_RANK() OVER (ORDER BY salary DESC) as rk
          FROM Employee
      )
      SELECT DISTINCT salary 
      FROM RankedSalaries 
      WHERE rk = N


  );
END