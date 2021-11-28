package com.example.qoutes_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class QuotesBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String quotes = new Quotes().notifyQ;
        NotificationCompat.Builder quoteNot = (NotificationCompat.Builder) new NotificationCompat.Builder(context, "current quote");
        quoteNot.setContentTitle("Current 'Friends' quote:");
        quoteNot.setContentText(quotes);
        quoteNot.setSmallIcon(R.drawable.otherlogo);
        quoteNot.setAutoCancel(true);

        NotificationManagerCompat managerComp = NotificationManagerCompat.from(context);
        managerComp.notify(1, quoteNot.build());
    }
}