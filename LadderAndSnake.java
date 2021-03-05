public class LadderAndSnake {
		public static void Player() {
			LadderAndSnake p1 = new LadderAndSnake();
		}

		public static void main(String[] args) {
			LadderAndSnake.Player();
			int position = 0;
			int N0_PLAY = 1;
			int LADDER = 2;
			int SNAKE = 3;

			double dieCheck = (Math.floor(Math.random() * 10) % 5) + 1;
					switch (dieCheck) {
							case 1:
								position = 0;
								break;
							case 2:
								position = position++ + dieCheck;
								break;
							case 3:
								position--;
								break;
					}

			System.out.println(position);

		}
}
