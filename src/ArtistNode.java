import java.io.PrintWriter;

//Jae Jee
//CIS211 401
public class ArtistNode extends Artist implements Comparable<ArtistNode>{
     private ArtNode firstNode,lastNode;


    public ArtistNode(int artistID, String artistName) {
        super(artistID, artistName);

        firstNode=null;
        lastNode=null;
    }


    @Override
    public String toString() {
        return String.format("%5d %-15s",getArtistID(),getArtistName());
    }

    @Override
    public int compareTo(ArtistNode o) {
        if (getArtistID()>o.getArtistID())
            return 1;
        else if (getArtistID()<o.getArtistID())
            return -1;
        else
            return 0;
    }

     public void printList(){
         ArtNode tmp=firstNode;
         while (tmp!=null){
           System.out.print("\t\t"+tmp+"\n");
            tmp=tmp.next;
        }
    }

    public void printList(PrintWriter output){
        ArtNode tmp=firstNode;
        while (tmp!=null){
            output.print("\t\t"+tmp+"\n");
            tmp=tmp.next;
        }
    }

     public void append(int artID, String artTitle, int artistID, int value){
        ArtNode newArt=new ArtNode(artID,artTitle,artistID,value,lastNode,null);

        if (isEmpty())
            firstNode=newArt;
        else
            lastNode.next=newArt;

        lastNode=newArt;
    }

     public boolean isEmpty(){return firstNode==null;}
}
