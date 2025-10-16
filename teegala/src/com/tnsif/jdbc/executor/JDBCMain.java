package com.tnsif.jdbc.executor;
import com.tnsif.jdbc.services.CurdOperations;


public class JDBCMain {
	

		public static void main(String[] args) {
			CurdOperations.addStudent(101, "Seetha");
			CurdOperations.addStudent(102, "Geetha");
			CurdOperations.addStudent(103, "Ramu");

		}

	}

