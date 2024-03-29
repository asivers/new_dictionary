import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

    public static void main(String[] args) {

/*        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = in.nextLine();
        System.out.println("Введите язык 1");
        String lang1 = in.nextLine();
        System.out.println("Введите язык 2");
        String lang2 = in.nextLine();
        System.out.println("Введите количество переводов");
        int lim = in.nextInt();
        in.close();
        System.out.println();
        translate(word, lang1, lang2, lim);*/

        MainWindow w = new MainWindow();

    }

    public static void translate(String word, String lang1, String lang2, int lim) {
        try {
            String _lang1 = switchLang(lang1);
            String _lang2 = switchLang(lang2);
            URL website = new URL("https://www.multitran.com/m.exe?l1=" + _lang1 + "&l2=" + _lang2 + "&s=" + word);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("information.txt");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            Scanner sc = new Scanner(new File("information.txt"));
            String x = "";
            while(sc.hasNext()) {
                if (find("Общая лексика", sc.nextLine(), false, 1)) {
                    x = sc.nextLine();
                    break;
                }
            }
            boolean translation = find("\"> .+?</a>", x, true, lim);
            rbc.close();
            fos.close();
            sc.close();
            if (translation == false) {
                System.out.println("Перевод " + word + " на " + lang2 + " не найден.");
                System.out.println("Перевод " + word + " на русский: ");
                translate(word, lang1, "Русский", lim);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static String switchLang(String lang) {
        switch(lang) {
            case("Английский"):
                return "1";
            case("Русский"):
                return "2";
            case("Немецкий"):
                return "3";
            case("Французский"):
                return "4";
            case("Испанский"):
                return "5";
            default:
                return "2";
        }
    }

    public static boolean find(String pattern, String str, boolean write, int lim) {
        List<String> allMatches = new ArrayList<>();
        Matcher m = Pattern.compile(pattern).matcher(str);
        while (m.find()) {
            allMatches.add(m.group());
        }
        if (write == true) {
            for (int i = 0; i < allMatches.size(); i++) {
                String s = "";
                for (int j = 3; j < allMatches.get(i).length() - 4; j++) {
                    s += allMatches.get(i).charAt(j);
                }
                allMatches.set(i, s);

            }
            if (allMatches.size() < lim)
                lim = allMatches.size();
            for (int i = 0; i < lim; i++) {
                System.out.println(allMatches.get(i));
            }
        }
        if (allMatches.size() > 0)
            return true;
        else
            return false;
    }

}