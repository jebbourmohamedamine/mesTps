package ma.education.tp5.collection;

public class Client {
    Integer code;
    String name;
    public Client(Integer code, String name) {
        this.code = code;
        this.name = name;
    } @
            Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Object o) {
        Client client = (Client) o;
        return -client.code+this.code;
    }
}
