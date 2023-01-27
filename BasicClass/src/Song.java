public class Song {
    String title, artist,album,year;
    String[] composer = new String[3];

    public void setInfo(String title1, String artist1, String year1
    ,String album1,String composer1[]){
        title = title1;
        artist = artist1;
        album = album1;
        year = year1;
        composer = composer1;

    }

    public void printInfo(){
        System.out.println(title);
        System.out.println(artist);
        System.out.println(album);
        System.out.println(year);
        for(String e : composer){
            System.out.println(e);
        }
    }
    }

