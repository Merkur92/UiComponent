package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
    }

    public void showNotification(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        Notification notification = new NotificationCompat.Builder(this, "default")
                .setContentTitle("Pedido en camino")
                .setContentText("Su pedido llegará en 30 minutos...")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setPriority(Notification.PRIORITY_DEFAULT) // Prioridad para versiones anteriores a Android 8
                .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setOngoing(true) // Evitar archivado
                // Set Action Tap
                .setContentIntent(pendingIntent)
                .setAutoCancel(true) // Cerrar luego del tap
                // Set Action Button
//                .addAction(R.drawable.ic_launcher_foreground, "Mostrar", pendingIntent)
                // Texto expandible, https://developer.android.com/training/notify-user/expanded
//                .setStyle(new NotificationCompat.BigTextStyle().bigText("Descripción de más de una línea para mayor información..."))
                // Imange expandible (no vector)
//                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.bg_cover)).bigLargeIcon(null))
                .build();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // NotificationChannel en Android 8: https://developer.android.com/training/notify-user/channels
            NotificationChannel channel = new NotificationChannel("default", "Channel name", NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("Channel description");

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
            notificationManager.notify(0, notification);
        }else{
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(0, notification);
        }



    }
}

