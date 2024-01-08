public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Constructor.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Constructor.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * To string.
     */
    public String toString() {
        String endXInAlphabet = "";
        switch (endX) {
            case 1:
                endXInAlphabet = "a";
                break;
            case 2:
                endXInAlphabet = "b";
                break;
            case 3:
                endXInAlphabet = "c";
                break;
            case 4:
                endXInAlphabet = "d";
                break;
            case 5:
                endXInAlphabet = "e";
                break;
            case 6:
                endXInAlphabet = "f";
                break;
            case 7:
                endXInAlphabet = "g";
                break;
            case 8:
                endXInAlphabet = "h";
                break;
            default:
                break;
        }
        return movedPiece.getColor() + "-" + movedPiece.getSymbol()
                + endXInAlphabet + endY;
    }

    public int getStartX() {
        return this.startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndX() {
        return this.endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getStartY() {
        return this.startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndY() {
        return this.endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
