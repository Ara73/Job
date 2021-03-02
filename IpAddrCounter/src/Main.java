import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Рома\\Desktop\\ip_addresses";
        BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        Stream<String> line = is.lines();
        //line = line.distinct();
        //LinkedHashSet<String> set = new LinkedHashSet<>();
        //line.forEach(x -> set.add(x));
        System.out.println(line);
    }

    public boolean equals(Object obj){
        return (this == obj);
    }
}