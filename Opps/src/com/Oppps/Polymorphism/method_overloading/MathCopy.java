package com.Oppps.Polymorphism.method_overloading;

public class MathCopy {
void sub(int a, int b) {
	int c=a-b;
	System.out.println("Subtraction of :" +c);
}
void sub(int a, int b, int d) {
	int c=a-b+d;
	System.out.println("Subtraction of :" +c);
}
}
