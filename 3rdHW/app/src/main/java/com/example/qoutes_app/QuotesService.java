package com.example.qoutes_app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class QuotesService extends Service {

    private int i = 60;

    public QuotesService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Friends quotes are on the way", Toast.LENGTH_LONG).show();

        long currTime = System.currentTimeMillis();
        long timeForCalc = 1000*i; //one minute

        QuotesBroadcastReceiver createNotification = new QuotesBroadcastReceiver();
        Intent newIntent = new Intent(this, QuotesBroadcastReceiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, newIntent,0);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, currTime+timeForCalc, timeForCalc, pendingIntent);


        //return super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"no more Friends quotes are given", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}