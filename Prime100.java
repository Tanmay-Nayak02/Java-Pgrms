import java.util.*;

public class Prime100 {

  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      int flag = 0;

      for (int j = 2; j <= i - 1; j++) {
        if (i % j == 0) {
          flag += 1;
        }
      }
      if (flag == 0) {
        System.out.println(i);
        count++;
      }
    }
    System.out.println(count);
  }
}
