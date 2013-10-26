package com.persesgames.jogl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date: 10/25/13
 * Time: 11:03 PM
 */
public class Util {

    public static String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");

        return formatter.format(new Date());
    }

}
