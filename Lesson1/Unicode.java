// Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры, то [33, 126]
class Unicode {
	public static void main (String[] args) {
		for (int i = 9398; i <= 10178; i++) {
			System.out.println ((char) i);
		}

		for (int i = 33; i <= 126; i++) {
			System.out.println ((char) i);
		}
	}
}