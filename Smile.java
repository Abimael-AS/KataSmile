import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
    // Just Smile :)
    String[] comparar = {":)", ":D", ":-D", ":-)", ":~D", ":~)", ";)", ";D", ";-D", ";-)", ";~D", ";~)"};
    int contar = 0;
    for (String c : arr){
      for (String buscado : comparar) {
        if (c.equals(buscado)){
          contar++;
            break;
        } 
      }
    }
    return contar;
  }
}