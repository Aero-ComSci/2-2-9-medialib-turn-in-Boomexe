import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaLibTest {
    @Test
    void testAddObjects() {
        Medialib myLib1 = new Medialib();
        myLib1.addBook(" "," ");
        myLib1.addMovie(" ",1.5);
        myLib1.addSong("Bulls on Parade");
        assertEquals(3, Medialib.getNumEntries());
    }
    @Test
    void TestGetTallies(){
        Medialib myLib1 = new Medialib();
        myLib1.addBook(" "," ");
         Medialib myLib2 = new Medialib();
        myLib2.addBook(" "," ");
        assertEquals(2, Medialib.getNumBooks());
       
        myLib1.addMovie(" ",1.2);
        
        myLib2.addMovie(" ",1.2);
        assertEquals(2, Medialib.getNumMovies());
        myLib1.addSong("Bulls on Parade");
        myLib2.addSong("3's&7's");
        assertEquals(2, Medialib.getNumSongs());
        
    }
    
}
