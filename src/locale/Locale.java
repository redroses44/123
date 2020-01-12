package locale;

public class Locale {
    private int id = 1;
    private static int count = 0;
    private String name;
    private String desc;

    public Locale(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Locale{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
