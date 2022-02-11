package neuefische.friday.week1;

public class Checkpassword {

    public static void main(String[] args) {

//        System.out.println(checkpassword("asdf1234"));
        System.out.println(checkliste());
    }


    public static String checkpass(String password) {
        int menge = 0;
 //       char[] sonderzeichen = {'!', '?', '$', '§', '"',};
        boolean uppercase = false;

        if (password.length() < 8) {
            System.out.println("Das Passwort muss mindestens 8 Zeichen beinhalten: " + "Ihr angegebens Passwort hat nur " + password.length() + " Zeichen \n");
            return "Bitte nochmal eingeben!";
        }

        for (int i = 0; i < password.length(); i++) {
//           System.out.println(password.charAt(i));                    //Aktuelle prüfung ob die richtigen Werte gelesen werden
            if (Character.isDigit(password.charAt(i))) {
                menge = menge + 1;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                uppercase = true;
            }
            }

        if (menge > 0 && uppercase) {
            return "Passwort hat mindestens acht Zeichen und eine Zahl, die Anzahl der Zahlen beträgt " + menge + " und du hast Groß- und kleinschreibung verwendet\n";
        }

        return "Passwort enthält keine Zahl oder Großbuchstaben \n\nBitte nochmal eingeben!\n";

    }


    public static String checkliste() {
        String[] list = new String[4];
        list[0] = "asdf1234";
        list[1] = "adsF1234";
        list[2] = "1234asdf";
        list[3] = "asdf";

        String[] ausgabe=new String[4];
        for (int i = 0; i < list.length; i++) {
            ausgabe = new String[4];
            System.out.println(ausgabe[i] = checkpass(list[i]));
        }
        return "";
    }

    }




