package week2.task2;

public class Fraction {

    // TODO 2: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO 2A: khởi tạo giá trị cho các thuộc tính numerator (tử số), denominator (mẫu số)
		this.numerator = numerator;
		this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO 2B: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới		
	int newDenominator = this.denominator * other.denominator;
	int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
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

    public boolean equals(Fraction obj) {
	//TODO 2C: Phương thức so sánh hai phân số (this và obj), trả về giá trị true hoặc false
        return (this.numerator * obj.denominator == this.denominator * obj.numerator);
    }
}
