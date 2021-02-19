import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Рома\\Desktop\\ip_addresses";
        int count = 0;
        BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        BufferedReader is2 = is;
        try {
            while ((is.readLine()) != null){
                boolean sort = true;
                while ((is2.readLine()) != null) {
                    if (is.readLine().equals(is2.readLine())) {
                        sort = false;
                    }
                }
                if (sort){
                    count++;
                }
            }
            System.out.println(count);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
