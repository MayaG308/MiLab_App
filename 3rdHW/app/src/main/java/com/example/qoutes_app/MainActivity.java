package com.example.qoutes_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();

        Button startQuotes = findViewById(R.id.Start);
        Button stopQuotes = findViewById(R.id.Stop);

        startQuotes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(new Intent(v.getContext(), QuotesService.class));
            }
        });

        stopQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(v.getContext(), QuotesService.class));
            }
        });
    }

    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel myChannel = new NotificationChannel("current quote", "mychannel", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager myManager = getSystemService(NotificationManager.class);
            myManager.createNotificationChannel(myChannel);
        }
    }
}