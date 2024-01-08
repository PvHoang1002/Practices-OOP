public class Rook extends Piece {
    /**
     * Constructor.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Get symbol of the piece.
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * Check can move.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x == super.getCoordinatesX() && y == super.getCoordinatesY()) {
            return true;
        }

        if (board.getAt(x, y) == null || board.getAt(x, y).getColor() != super.getColor()) {
            // Check collision
            if (x == super.getCoordinatesX()) {
                if (y > super.getCoordinatesY()) { // Move up
                    for (int i = super.getCoordinatesY() + 1; i < y; i++) {
                        if (board.getAt(super.getCoordinatesX(), i) != null) {
                            return false;
                        }
                    }
                } else { // Move down
                    for (int i = super.getCoordinatesY() - 1; i > y; i--) {
                        if (board.getAt(super.getCoordinatesX(), i) != null) {
                            return false;
                        }
                    }
                }
            } else if (y == super.getCoordinatesY()) {
                if (x > super.getCoordinatesX()) { // Move right
                    for (int i = super.getCoordinatesX() + 1; i < x; i++) {
                        if (board.getAt(i, super.getCoordinatesY()) != null) {
                            return false;
                        }
                    }
                } else { // Move left
                    for (int i = super.getCoordinatesX() - 1; i > x; i--) {
                        if (board.getAt(i, super.getCoordinatesY()) != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
            return true;
        }
        return false;
    }
}
