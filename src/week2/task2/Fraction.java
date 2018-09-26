package week2.task2;

import week2.task1.*;

public class Fraction {

    // TODO 2: khai báo các thuộc tính
    private int numerator;
    private int denominator;
    
    
    public int getNumerator() {
        return this.numerator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public Fraction(int numerator, int denominator) {
        // TODO 2A: khởi tạo giá trị cho các thuộc tính numerator (tử số), denominator (mẫu số)
		this.numerator = numerator;
		this.denominator = denominator;
    }
    
    /*public Fraction reduce() {
        int g = Task1.gcd(this.numerator, this.denominator);
        int newNumerator = this.numerator / g;
        int newDenominator = this.denominator / g;
        Fraction newFrac = new Fraction(newNumerator, newDenominator);
        return newFrac;
    }*/
    
    public void reduce() {
        int g = Task1.gcd(this.numerator, this.denominator);
        this.numerator /= g;
        this.denominator /= g;
    }

    public Fraction add(Fraction other) {
        // TODO 2B: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới		
	int newDenominator = this.denominator * other.denominator;
	int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public Fraction subtract(Fraction other) {
        // TODO 2B: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
	int newDenominator = this.denominator * other.denominator;
	int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);        
        return result;
    }

    public Fraction multiply(Fraction other) {
        // TODO 2B: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int newDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.numerator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        return result;
    }

    public Fraction divide(Fraction other) {
        // TODO 2B: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;	
        Fraction result = new Fraction(newNumerator, newDenominator);
        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
	//TODO 2C: Phương thức so sánh hai phân số (this và obj), trả về giá trị true hoặc false
        Fraction f = (Fraction) obj;
        return (this.numerator * f.denominator == this.denominator * f.numerator);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.numerator;
        hash = 41 * hash + this.denominator;
        return hash;
    }
    
    public void printFraction() {
        System.out.println("(" + this.numerator + "," + this.denominator + ")");
    }
}
