
public class Main {
	static int i;
	static Thread Sapo = new Thread() {
		public void run() {
			do {
				int salto = (int) (Math.random() * 10) + 1;
				i = i + salto;
				if (1000 - i >=0) {
					System.out.println("O sapo 1 pulou " + salto + " metro(s). Faltam " + (1000 - i) + "m");
				} else {
					System.out.println("O sapo 1 pulou " + salto + " metro(s).");
				}
			} while (i<=1000);
			System.out.println("Sapo 1 terminou a corrida");
		}
	};
	static Thread Sapo2 = new Thread() {
		public void run() {
			do {
				int salto = (int) (Math.random() * 10) + 1;
				i = i + salto;
				if (1000 - i >=0) {
					System.out.println("O sapo 2 pulou " + salto + " metro(s). Faltam " + (1000 - i) + "m");
				} else {
					System.out.println("O sapo 2 pulou " + salto + " metro(s).");
				}
			} while (i<=1000);
			System.out.println("Sapo 2 terminou a corrida");
		}
	};
	static Thread Sapo3 = new Thread() {
		public void run() {
			do {
				int salto = (int) (Math.random() * 10) + 1;
				i = i + salto;
				if (1000 - i >=0) {
					System.out.println("O sapo 3 pulou " + salto + " metro(s). Faltam " + (1000 - i) + "m");
				} else {
					System.out.println("O sapo 3 pulou " + salto + " metro(s).");
				}
			} while (i<=1000);
			System.out.println("Sapo 3 terminou a corrida");
		}
	};
	static Thread Sapo4 = new Thread() {
		public void run() {
			do {
				int salto = (int) (Math.random() * 10) + 1;
				i = i + salto;
				if (1000 - i >=0) {
					System.out.println("O sapo 4 pulou " + salto + " metro(s). Faltam " + (1000 - i) + "m");
				} else {
					System.out.println("O sapo 4 pulou " + salto + " metro(s).");
				}
			} while (i<=1000);
			System.out.println("Sapo 4 terminou a corrida");
		}
	};
	static Thread Sapo5 = new Thread() {
		public void run() {
			do {
				int salto = (int) (Math.random() * 10) + 1;
				i = i + salto;
				if (1000 - i >=0) {
					System.out.println("O sapo 5 pulou " + salto + " metro(s). Faltam " + (1000 - i) + "m");
				} else {
					System.out.println("O sapo 5 pulou " + salto + " metro(s).");
				}
			} while (i<=1000);
			System.out.println("Sapo 5 terminou a corrida");
		}
	};
	public static void main(String[] args) {
		Sapo.start();
		Sapo2.start();
		Sapo3.start();
		Sapo4.start();
		Sapo5.start();
	}
}
