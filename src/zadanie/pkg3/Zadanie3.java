package zadanie.pkg3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


    /**
     * Z publicznego API: https://jsonplaceholder.typicode.com pobierz wszystkie zapisane posty znajdujące się pod adresem
     * https://jsonplaceholder.typicode.com/posts tak by po wywołaniu metody getPosts() można było wypisać wszystkie elementy w konsoli,
     * podobnie jak wypisuje je przeglądarka po wejściu w link.
     *
     * Można skorzystać z dowolnych sposobów pobierania danych z API dostępnych dla języka Java.
     * */
public class Zadanie3 {

    public static String getPosts() {
        String jsonText = "";
        
        try{
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");                    //połączenie przez adres URL
            InputStream is = url.openStream();
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));      //nowy obiekt klasy BufferedReader
            
            String line;                                                                        //odczyt danych JSON linia po lini
            while ((line = bufferedReader.readLine()) != null)
            {
                jsonText += line + "\n";
            }
            is.close();                                                                         //zamknięcie połącznia
            bufferedReader.close();
        } catch (Exception e) {
    }
        return jsonText;
    }
    
    public static void main(String[] args) {

        System.out.println(getPosts());
    }
}
