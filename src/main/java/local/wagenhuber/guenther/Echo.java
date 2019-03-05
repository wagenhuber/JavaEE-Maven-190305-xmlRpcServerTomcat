package local.wagenhuber.guenther;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Echo {

    public String getEcho(String s) {
        return s;
    }

    public String getEchoWithDate(String s) {
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return "[" + f.format(new Date()) + "]" + s;
    }

}
