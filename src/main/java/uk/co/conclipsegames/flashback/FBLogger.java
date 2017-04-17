package uk.co.conclipsegames.flashback;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by Ethan Brews on 15/04/2017.
 */

public class FBLogger
{
    private static boolean debug = false;
    public static void log(Level logLevel, Object object) { FMLLog.log(FlashBack.MODID, logLevel, String.valueOf(object)); }

    public static void error(Object object) { log(Level.ERROR, object); }

    public static void info(Object object) { log(Level.INFO, object); }

    public static void warn(Object object) { log(Level.WARN, object); }

    public static void debug(Object object) { if (debug) { log(Level.DEBUG, object); } }
}