//Jae Jee
//CIS211 401
public class ArtNode extends Art{
    ArtNode previous,next;

    public ArtNode(int artID, String artTitle, int artistID, double value, ArtNode previous, ArtNode next) {
        super(artID, artTitle, artistID, value);
        this.previous=previous;
        this.next=next;
    }

    public ArtNode getPrevious() {
        return previous;
    }

    public void setPrevious(ArtNode previous) {
        this.previous = previous;
    }

    public ArtNode getNext() {
        return next;
    }

    public void setNext(ArtNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("%5d %-15s %10.2f",getArtiD(),getArtTitle(),getValue());
    }
}
