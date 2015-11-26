package com.example.boasvindas;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;

public class NotificationOnClic implements View.OnClickListener {

	public void onClick(View v) {

        Context context = v.getContext();

        int notificationId = 101;
        
        Uri uri = Uri.parse("cadastrar");

        
        Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri);

        
        PendingIntent pendingIntent =
                PendingIntent.getActivity(context, 0, viewIntent, 0);

        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        android.app.Notification notificationBuild = new NotificationCompat.Builder(context)
                .setTicker("Avaliador")
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("Título")
                .setContentText("Título de avaliador")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSound(alarmSound)
                .build();

        
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(context);

        
        notificationManager.notify(notificationId, notificationBuild);
    }
}
