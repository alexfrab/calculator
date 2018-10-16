package it.alexfrab.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
	
	//AGGIUNTO UN COMMENTO
	//VEDIAMO CHE SUCCEDE :|
	//Che succede se riapplico lo stash ?
	
	
	int sum(int a, int b) {
		return a + b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int div(int a, int b) {
		return a / b;
	}
	
	int mod(int a, int b) {
		return a % b;
	}
}
