import java.util.ArrayList;

public class SnakesLadders {
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Ladder> modifiers = new ArrayList<>();
    private boolean isGameStopped;

    public SnakesLadders() {
        players.add(new Player(1, true));
        players.add(new Player(2));

        modifiers.add(new Ladder(2,38));
        modifiers.add(new Ladder(7,14));
        modifiers.add(new Ladder(8,31));
        modifiers.add(new Ladder(7,14));
        modifiers.add(new Ladder(8,31));
        modifiers.add(new Ladder(15,26));
        modifiers.add(new Ladder(21,42));
        modifiers.add(new Ladder(28,84));
        modifiers.add(new Ladder(36,44));
        modifiers.add(new Ladder(51,67));
        modifiers.add(new Ladder(71,91));
        modifiers.add(new Ladder(78,98));
        modifiers.add(new Ladder(87,94));

        modifiers.add(new Slope(16,6));
        modifiers.add(new Slope(46,25));
        modifiers.add(new Slope(49,11));
        modifiers.add(new Slope(62,19));
        modifiers.add(new Slope(64,60));
        modifiers.add(new Slope(74,53));
        modifiers.add(new Slope(89,68));
        modifiers.add(new Slope(92,88));
        modifiers.add(new Slope(95,75));
        modifiers.add(new Slope(99,80));

        isGameStopped = false;
    }

    class Ladder {
        private int startX, endX;

        public Ladder(int startX, int endX) {
            this.startX = startX;
            this.endX = endX;
        }
    }

    class Slope extends Ladder {
        public Slope(int startX, int endX) {
            super(startX, endX);
        }
    }

    class Player {
        private int id, x;
        private boolean isWinner, isCurrentTurn;

        public Player(int id) {
            this.id = id;
        }

        public Player(int id, boolean isCurrentTurn) {
            this.id = id;
            this.isCurrentTurn = isCurrentTurn;
        }
    }

    private String currentState(Player p) {
        if (p.x == 100 && !isGameStopped) {
            p.isWinner = true;
            isGameStopped = true;
            return String.format("Player %d Wins!", p.id);
        } else {
            if (isGameStopped) {
                return ("Game over!");
            }
            return String.format("Player %d is on square %d", p.id, p.x);
        }
    }

    private void checkPosition(Player p) {
        modifiers.forEach(m -> {
            if (m.startX == p.x) {
                p.x = m.endX;
            }
        });
    }

    public String play(int die1, int die2) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).isCurrentTurn) {
                players.get(i).x += die1 + die2;

                if (players.get(i).x > 100) {
                    players.get(i).x = 100 - (players.get(i).x - 100);
                }

                checkPosition(players.get(i));

                if (die1 != die2) {
                    players.get(i).isCurrentTurn = false;

                    if (i != players.size() - 1) {
                        players.get(i + 1).isCurrentTurn = true;
                    } else {
                        players.get(0).isCurrentTurn = true;
                    }
                }
                return currentState(players.get(i));
            }
        }
        return null;
    }
}
