package yourpackage;

Class MyService extends Service {
    
    // ...

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Log.e("ClearService", "END");
        // Do Something Here.
        stopSelf();
    }

}