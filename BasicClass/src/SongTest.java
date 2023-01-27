public class SongTest {
    public static void main(String[] args) {
        Song song1 = new Song();
        String[] composer = {"김자바","이자바","박자바"};
        song1.setInfo("제목","가수","1992",
                    "앨범",composer);
    song1.printInfo();
    }
}
