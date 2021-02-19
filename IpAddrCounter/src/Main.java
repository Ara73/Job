import java.io.*;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Рома\\Desktop\\ip_addresses";
        int count = 0;
        HashSet hashSet = new HashSet();
        BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        BufferedReader is2 = is;
        try {
            while ((is.readLine()) != null){
                boolean sort = true;
                while ((is2.readLine()) != null) {
                    if (is.readLine().equals(is2.readLine())) {
                        sort = false;
                        hashSet.add(is.readLine());
                    }
                }
                if (sort){
                    count++;
                }
            }
            System.out.println(count + hashSet.size());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
