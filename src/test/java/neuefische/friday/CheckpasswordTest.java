package neuefische.friday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckpasswordTest {


    @Test
    void checkifpasswortisright(){
        String result = Checkpassword.checkpass("1234");
        Assertions.assertEquals("Bitte nochmal eingeben!", result);

    }

}