<!DOCTYPE html>
<html>
<head>
    <title>Salary Calculator</title>
</head>
<body>
    <h1>Employee Salary Calculator</h1>
    <form action="salaryCalculatorServlet" method="post">
        <label for="baseSalary">Base Salary:</label>
        <input type="number" name="baseSalary" id="baseSalary" required><br><br>

        <label for="hoursWorked">Hours Worked:</label>
        <input type="number" name="hoursWorked" id="hoursWorked" required><br><br>

        <label for="hourlyRate">Hourly Rate:</label>
        <input type="number" name="hourlyRate" id="hourlyRate" required><br><br>

        <label for="overtimeRate">Overtime Rate:</label>
        <input type="number" name="overtimeRate" id="overtimeRate" required><br><br>

        <label for="deductions">Deductions:</label>
        <input type="number" name="deductions" id="deductions" required><br><br>

        <label for="bonus">Bonus:</label>
        <input type="number" name="bonus" id="bonus" required><br><br>

        <input type="submit" value="Calculate Salary">
    </form>
</body>
</html>
