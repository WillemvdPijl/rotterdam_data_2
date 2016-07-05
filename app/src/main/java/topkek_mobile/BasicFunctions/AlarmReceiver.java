package topkek_mobile.BasicFunctions;

/**
 * Created by Anthony on 5-7-2016.
 */
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import topkek_mobile.fragments1.R;

public class AlarmReceiver extends BroadcastReceiver {

    private static final int MY_NOTIFICATION_ID=1;
    NotificationManager notificationManager;
    Notification myNotification;
    private final String myBlog = "http://android-er.blogspot.com/";

    @SuppressWarnings("WrongConstant")
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm received!", Toast.LENGTH_LONG).show();

        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(myBlog));
        PendingIntent pendingIntent;
        pendingIntent = PendingIntent.getActivity(
                context,
                0,
                myIntent,
                Intent.FLAG_ACTIVITY_NEW_TASK);

        myNotification = new NotificationCompat.Builder(context)
                .setContentTitle("Your bike is waiting")
                .setContentText("hello")
                .setTicker("Notification!")
                .setWhen(System.currentTimeMillis())
                .setContentIntent(pendingIntent)
                .setDefaults(Notification.DEFAULT_SOUND)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_launcher)
                .build();

        notificationManager =
                (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(MY_NOTIFICATION_ID, myNotification);
    }

}