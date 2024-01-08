import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Constructor.
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * Move piece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            if (board.getAt(x, y) != null) {
                /*
                int sourceX = piece.getCoordinatesX();
                int sourceY = piece.getCoordinatesY();
                 */
                Move move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(),
                        x, y, piece, board.getAt(x, y));
                moveHistory.add(move);
                board.removeAt(x, y);
            } else {
                Move move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(), x, y, piece);
                moveHistory.add(move);
            }
            board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            board.addPiece(piece);
        }
    }

    /**
     * Get move history.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
