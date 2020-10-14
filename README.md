# SessionManager

#### Make Class Session
```java
public class SessionManager {
    private String PREF_NAME = "SIMPAN";
    private String KEY_ID = "antrian_id";

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public SessionManager(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void setIdAntrian(String id) {
        mEditor = mSharedPreferences.edit();
        mEditor.putString(KEY_ID, id).apply();
    }

    public String getId() {
        return mSharedPreferences.getString(KEY_ID, null);
    }

    public void logout() {
        mEditor = mSharedPreferences.edit();
        mEditor.clear().commit();
    }
}
```

#### Use Session
```java
public class MainActivity extends AppCompatActivity {

    private SessionManager mSessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSessionManager = new SessionManager(this);

        //to set data
        mSessionManager.setId("ID");

        //to get data
        mSessionManager.getId();

    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```
