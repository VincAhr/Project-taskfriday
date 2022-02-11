package neuefische.friday.week1;

import neuefische.friday.week1.Checkpassword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckpasswordTest {


    @Test
    void checkifpasswortisright(){
        String result = Checkpassword.checkpass("1234");
        Assertions.assertEquals("Bitte nochmal eingeben!", result);

    }

}