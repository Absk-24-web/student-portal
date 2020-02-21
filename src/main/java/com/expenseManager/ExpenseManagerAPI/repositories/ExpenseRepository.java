package com.expenseManager.ExpenseManagerAPI.repositories;

import java.util.List;
import com.expenseManager.ExpenseManagerAPI.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, String> {

	List<Expense> findByMonthAndYear(String month, int year);
	
	List<Expense> findByYear(int year);

}
