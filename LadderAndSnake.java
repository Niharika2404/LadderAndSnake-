public class LadderAndSnake {
		public static final int WinningPosition = 100;
		public static final int NoPlay = 1;
		public static final int Ladder = 2;
		public static final int Snake = 3;

		public static void Player() {
			LadderAndSnake p1 = new LadderAndSnake();
		}

		public static void main(String[] args) {
			LadderAndSnake.Player();
			int position = 0;
			int DiceRolled = 0;
			int NewPosition = 0;
			while (position <= WinningPosition) {
				DiceRolled++;
				int dieCheck = (int)(Math.floor(Math.random() * 10) % 5) + 1;
					switch (dieCheck) {
							case NoPlay:
								position = 0;
								break;
							case Ladder:
								position = position + dieCheck;
								DiceRolled++;
								break;
							case Snake:
								position--;
								break;
					}
			NewPosition += position;
			System.out.println("Player is in the position of: " + NewPosition);
			}

			System.out.println(NewPosition);

		}
}
