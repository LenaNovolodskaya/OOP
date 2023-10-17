/**
 * @author Новолодская Елена
 * Класс, содержащий в себе информацию о песнях (звуковоспроизводящие устройства,
 * носители музыкальных композиций, исполнители, названия песен)
 */
public class MusicSystem {

    // свойства
    private String device;     // звуковоспроизводящее устройство
    private String carrier;    // носитель музыкальных композиций
    private String executor;   // исполнитель
    private String song;       // песня

    /**
     * Конструктор с параметрами
     * @param device звуковоспроизводящее устройство
     * @param carrier носитель музыкальных композиций
     * @param executor исполнитель
     * @param song песня
     */
    public MusicSystem(String device, String carrier, String executor, String song){
        this.device = device;
        this.carrier = carrier;
        this.executor = executor;
        this.song = song;
    }

    // методы получения доступа
    public String getDevice(){
        return device;
    }
    public String getCarrier(){
        return carrier;
    }

    public String getExecutor(){
        return executor;
    }
    public String getSong(){
        return song;
    }


    // методы изменения
    public void setDevice(){
        this.device = device;
    }

    public void setCarrier(){
        this.carrier = carrier;
    }

    public void setExecutor(){
        this.executor = executor;
    }

    public void setSong(){
        this.song = song;
    }


    // вывод шапка таблицы
    public static String heading(){
        return "+  Звук. устройство  +   Носитель   +   Исполнитель   +  Название песни  +";
    }

    // вывод данных
    public String toString(){
        return String.format("|%20s|%14s|%17s|%18s|", device, carrier, executor, song);
    }

    // вывод разделительной линии
    public static String separator() {
        return "+--------------------+--------------+-----------------+------------------+";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        MusicSystem other = (MusicSystem) obj;
        if (this.device != other.device)
            return false;
        if (this.carrier != other.carrier)
            return false;
        if (this.executor != other.executor)
            return false;
        if (this.song != other.song)
            return false;
        return true;
    }
}