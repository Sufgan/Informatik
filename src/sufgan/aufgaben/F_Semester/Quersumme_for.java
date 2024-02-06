package sufgan.aufgaben.F_Semester;

public class Quersumme_for {

	public static void main(String[] args) {
		int sum = 0, z = (int)(Math.random() * 10000); // Инициализация. Для z можно и в 7 стр. сделать
		for (; sum < 30; z = (int)(Math.random() * 10000) /*+ (sum = 0)*/) { // Условие выхода и шаг итерации
			sum = 0; // Обнуление Quersumme, можно вместо этого, то что сверху в комментарии использовать
			for (int z1 = z; z1 > 0; z1 /= 10) sum += z1 % 10; // Подсчет Quersumme
			System.out.printf("| %-6d->%4d |\n", z, sum);
		}
	}
	
}
