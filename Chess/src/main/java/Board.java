import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * Constructor.
     */
    public Board() {

    }

    /**
     * Add piece.
     */
    public void addPiece(Piece newPiece) {
        if (validate(newPiece.getCoordinatesX(), newPiece.getCoordinatesY())) {
            if (getAt(newPiece.getCoordinatesX(), newPiece.getCoordinatesY()) == null) {
                pieces.add(newPiece);
            }
        }
    }

    /**
     * Check coordinates.
     */
    public boolean validate(int x, int y) {
        if (x < 1 || x > WIDTH || y < 1 || y > HEIGHT) {
            return false;
        }
        return true;
    }

    /**
     * Return a piece at coordinate x and y.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Remove piece at coordinate x and y.
     */
    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                return;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
