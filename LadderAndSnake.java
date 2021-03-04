public class LadderAndSnake {
		public static void Player() {
			LadderAndSnake p1 = new LadderAndSnake();
		}

		public static void main(String[] args) {
			LadderAndSnake.Player();
			int position = 0;
			double dieCheck = (Math.floor(Math.random() * 10) % 5) + 1;
			System.out.println("Rolled diced number is: " + dieCheck);

		}
}
