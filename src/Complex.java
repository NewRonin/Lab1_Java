import java.lang.IllegalArgumentException;

public class Complex {
	private float a, b;
	//Конструкторы ввода
	public Complex() {
		this(0,0);
	}
	public Complex(float a) {
		this(a, 0);
	}
	public Complex(float a, float b) {
		this.a = a;
		this.b = b;
	}

	//Сложение
	public void add(Complex num) {
		if (num == null) {
			throw new IllegalArgumentException("Отсутствует второй операнд");
		}

		this.a += num.a;
		this.b += num.b;

	}

	//Умножение
	public void mult(Complex num) {
		if (num == null) {
			throw new IllegalArgumentException("Отсутствует второй операнд");
		}

		final float temp = this.a;
		this.a = (this.a * num.a) - (this.b * num.b);
		this.b = (temp * num.b) + (this.b * num.a);
	}

	//Тригонометрическая форма
	public void getTriangle() {
		final float r = (float) Math.sqrt(this.a * this.a + this.b*this.b);
		final float cosf = this.a / r;
		final float f = (float) Math.acos(cosf);

		System.out.printf("%.2f * (cos(%.2f) + i * sin(%.2f))",r, f, f);
	}

	// Геттеры/Сеттеры класса

	public void getNumber() {
		System.out.print(a + ( b > 0 ? "+" : "") + (b == 0 ? "" : b + "*i"));
	}

	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	

}