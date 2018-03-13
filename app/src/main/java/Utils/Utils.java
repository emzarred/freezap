package Utils;

import android.util.Log;

/**
 * Created by pc on 13/03/2018.
 */

public class Utils {public static Long executeLongActionDuring7seconds(){

    Log.e("TAG", "Long action is starting...");
    Long endTime = System.currentTimeMillis() + 7000;
    while (System.currentTimeMillis() <  endTime) {
        //Loop during 7 secs hehehe...
    }
    Log.e("TAG", "Long action is finished !");

    return endTime;
}



}
