package yourpackage;

import android.content.SharedPreferences;

Class YourClass extends AppCompatActivity {

    private final int DEFALT_PREFERENCE_INT = 0;

    private void function () {
        SharedPreferences pref = getSharedPreferences("pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        editor.putInt("value", 1);
        editor.apply();

        pref.getInt("value", DEFALT_PREFERENCE_INT);
    }

}