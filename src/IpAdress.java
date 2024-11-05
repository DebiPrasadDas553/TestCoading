import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAdress {
    public static void main(String[] args) {
        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        IpAdress.extractIpAdress(str);
    }

    public static void extractIpAdress(String[] str) {
        String ipAdress = "\\b(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\b";//192.168.0.255
        Map<String,Integer>map= new HashMap<>();
        Pattern pattern = Pattern.compile(ipAdress);//creating pattern object the we can perform serach match any operation
        for (String st : str) {
            Matcher matcher = pattern.matcher(st);//create matcher object from Pattern object then use find()
            while (matcher.find()) {
                String ip = matcher.group();
                if (isValidIp(ip)) {
                    System.out.println("Valid IP:" + ip);
                    map.put(ip,
                            map.getOrDefault(ip,0)+1);

                }
                else {
                    System.out.println("Found invalid ip: "+ip);
                }
            }
        }
        String maxIp = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(n -> n.getKey()).orElse("No Valid Ip found");
        System.out.println("Expected IpAdress "+maxIp);
    }

    private static boolean isValidIp(String ip) {
        String[] parts = ip.split("\\.");
        for (String part:parts){
            int num;
            try {
                num = Integer.parseInt(part);
            }
            catch (NumberFormatException ex){
                return  false;
            }
            if(num<0||num>255){
                return false;
            }

        }
        return true;
    }
}