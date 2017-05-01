//Jae Jee
//CIS211 401

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyArtCollection {
    MyArtistNodes artists=new MyArtistNodes("p7artists.txt");

    Scanner input;

    public MyArtCollection(String fileName) throws IOException{
        input=new Scanner(new File(fileName));

        input.useDelimiter("\t|\r\n");
            while (input.hasNext()){
                int artID=input.nextInt();
                String artTitle=input.next();
                int artistID=input.nextInt();
                int value=input.nextInt();

                artists.myArtistNodes.get(artists.indexOfArtistID(artistID)).append(artID,artTitle,artistID,value);
            }
    }

    public void print(){
        for (int i=0;i<(artists.myArtistNodes).size();i++){
            System.out.println((artists.myArtistNodes.get(i)));
            ((artists.myArtistNodes).get(i)).printList();
        }
    }

    public void print(String outputFile) throws IOException{
        java.io.PrintWriter output=new java.io.PrintWriter(new File(outputFile));

        for (int i=0;i<(artists.myArtistNodes).size();i++){
            output.println((artists.myArtistNodes.get(i)));
            ((artists.myArtistNodes).get(i)).printList(output);
        }output.close();
    }
}
