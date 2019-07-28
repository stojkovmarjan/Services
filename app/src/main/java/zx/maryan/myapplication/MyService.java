package zx.maryan.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {

    private MediaPlayer mMediaPlayer;

    public  MyService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mMediaPlayer=MediaPlayer.create(this,R.raw.ala);
        mMediaPlayer.start();
       // return super.onStartCommand(intent, flags, startId);
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        //return null;
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void onDestroy() {
        mMediaPlayer.stop();
        mMediaPlayer.release();
        super.onDestroy();
    }
}
