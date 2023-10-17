import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("musicsystem.txt");
        if(!file.exists())
            return;
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        MusicSystem[] musics = new MusicSystem[n];
        for(int i = 0; i < n; i++){
            String device = in.next();
            String carrier = in.next();
            String executor = in.next();
            String song = in.next();
            musics[i] = new MusicSystem(device, carrier, executor, song);
        }

        Scanner cin = new Scanner(System.in);
        System.out.print("Носитель музыкальных композиций: ");
        String carrier = cin.next();
        System.out.print("Песня: ");
        String song = cin.next();

        boolean flag = false;
        System.out.println(MusicSystem.separator());
        System.out.println(MusicSystem.heading());
        for(int i = 0; i < n; i++) {
            if(carrier.equals(musics[i].getCarrier()) && song.equals(musics[i].getSong())) {
                System.out.println(MusicSystem.separator());
                System.out.println(musics[i].toString());
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(MusicSystem.separator());
            System.out.println("+     Устройство не может воспроизвести музыку с требуемого носителя     +");
        }
        System.out.println(MusicSystem.separator());

        /* System.out.println("\nСписок всех записей");
        System.out.println(MusicSystem.separator());
        System.out.println(MusicSystem.heading());
        for(int i = 0; i < n; i++) {
            System.out.println(MusicSystem.separator());
            System.out.println(musics[i].toString());
        }
        System.out.println(MusicSystem.separator()); */
    }
}